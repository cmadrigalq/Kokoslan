/**
 * Kokoslan toy compiler
 * Demo ANTLR (suing visitors)
 *
 * @author loriacarlos@gmail.com
 * @version EIF400.II-2017
 * @since 0.0
 */
package javaK.Compiler;


import KoKoKotlin.ast.KoKoList;
import KoKoKotlin.ast.KoKoProgram;
import KoKoKotlin.eval.KoKoValue;
import org.antlr.v4.runtime.tree.ParseTree;
import src.java.ast.KoKoAst;

import javaK.parser.KoKoslanBaseVisitor;
import javaK.parser.KoKoslanParser;
import java.util.*;
import java.util.stream.*;
import java.io.*;


public class KoKoCompiler extends KoKoslanBaseVisitor<KoKoAst> implements KoKoEmiter {

    protected String outputFile = null;
    protected KoKoAst program;

    public KoKoCompiler() {
        this(null);
    }

    public KoKoCompiler(String outputFile) {
        this.outputFile = outputFile;
    }

    public KoKoProgram getProgram() {
        return PROGRAM(this.statements);
    }
    protected List<KoKoAst> statements = new ArrayList<>();

    public void genCode() {
        try {
            genCode(outputFile == null ? System.out : new PrintStream(outputFile));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void genCode(PrintStream out) {
        this.statements.stream()
                .forEach(t -> t.genCode(out));
    }

    public KoKoValue eval() {
        return getProgram().eval();
    }

    public KoKoAst compile(ParseTree tree) {
        return visit(tree);
    }

    @Override
    public KoKoAst visitProgram(KoKoslanParser.ProgramContext ctx) {
        ctx.definition()
                .stream()
                .map(fun -> visit(fun))
                .forEach(fun -> this.statements.add(fun));
        this.program = PROGRAM(this.statements);
        KoKoAst expr = visit(ctx.expression());
        this.statements.add(expr);
        return this.program;
    }

    @Override
    public KoKoAst visitDefinition(KoKoslanParser.DefinitionContext ctx) {
        KoKoAst id = visit(ctx.id());
        KoKoAst expr = visit(ctx.expression());
        return LET(id, expr);
    }

    @Override
    public KoKoAst visitLambda_expr(KoKoslanParser.Lambda_exprContext ctx) {
        System.err.println("no se pueden usar lambdas aun");
        return null;
    }

    @Override
    public KoKoAst visitAdd_expr(KoKoslanParser.Add_exprContext ctx) {
        // Check if only one operand. Then just visit down
        if (ctx.add_oper() == null) {
            return visit(ctx.mult_expr(0));
        }

        List<KoKoAst> operators = ctx.add_oper()
                .stream()
                .map(e -> visit(e))
                .collect(Collectors.toList());

        List<KoKoAst> operands = ctx.mult_expr()
                .stream()
                .map(e -> visit(e))
                .collect(Collectors.toList());

        /* 
	  // Imperative
	  KoKoAst result = operands.get(0);
	  for(int i = 1; i < operands.size(); i++){
		  result = BI_OPERATION(operators.get(i - 1), result, operands.get(i));
	  }
	  return result;
         */
        KoKoAst[] r = {operands.get(0)};
        IntStream
                .range(1, operands.size())
                .forEach(i -> r[0] = BI_OPERATION(operators.get(i - 1), r[0], operands.get(i)));
        return r[0];
    }

    @Override
    public KoKoAst visitAdd_oper(KoKoslanParser.Add_operContext ctx) {
        return OPERATOR(ctx.oper.getText());
    }

    @Override
    public KoKoAst visitId(KoKoslanParser.IdContext ctx) {
        return ID(ctx.ID().getText());
    }

    @Override
    public KoKoAst visitNumber(KoKoslanParser.NumberContext ctx) {
        return NUM(Double.valueOf(ctx.NUMBER().getText()));
    }

    @Override
    public KoKoAst visitBool(KoKoslanParser.BoolContext ctx) {
        return (ctx.TRUE() != null) ? TRUE : FALSE;
    }

    @Override
    public KoKoAst visitMult_expr(KoKoslanParser.Mult_exprContext ctx) {
        System.err.println("visitando visitMult_expr (incompleto aun!)");
        return visit(ctx.value_expr(0));
    }

    @Override
    public KoKoAst visitCallValueExpr(KoKoslanParser.CallValueExprContext ctx) {
        KoKoAst head = visit(ctx.value_expr());
        KoKoList args = (KoKoList) visit(ctx.call_args());
        return CALL(head, args);
    }

    @Override
    public KoKoAst visitCall_args(KoKoslanParser.Call_argsContext ctx) {
        return ctx.list_expr() != null
                ? visit(ctx.list_expr())
                : LIST();
    }

    @Override
    public KoKoAst visitList_expr(KoKoslanParser.List_exprContext ctx) {
        List<KoKoAst> exprs = ctx.expression()
                .stream()
                .map(e -> visit(e))
                .collect(Collectors.toList());
        return LIST(exprs);
    }
}
