/**
 * @author loriacarlos@gmail.com
 *
 */
package src.java.ast;

import java.io.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoValue;

public class KoKoLet implements KoKoAst {

    private KoKoAst id;

    public KoKoAst getId() {
        return this.id;
    }

    private KoKoAst expr;

    public KoKoAst getExpr() {
        return this.expr;
    }

    public KoKoLet(KoKoAst id, KoKoAst expr) {
        this.id = id;
        this.expr = expr;
    }

    public void genCode(PrintStream out) {
        out.print("let ");
        this.id.genCode(out);
        out.print(" = ");
        this.expr.genCode(out);
        out.println();
    }

    public KoKoValue eval(KoKoContext ctx) {
        KoKoValue val = expr.eval(ctx);
        ctx.assoc((KoKoId) id, (KoKoValue) val);
        return val;
    }
}
