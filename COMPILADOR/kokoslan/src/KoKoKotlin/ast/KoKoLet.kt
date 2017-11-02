/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import java.io.*

import src.java.ast.KoKoAst


class KoKoLet(val id: KoKoAst, val expr: KoKoAst) : KoKoAst {

    override fun genCode(out: PrintStream) {
        out.print("let ")
        this.id.genCode(out)
        out.print(" = ")
        this.expr.genCode(out)
        out.println()
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        val `val` = expr.eval(ctx)
        ctx.assoc(id as KoKoId, `val` as KoKoValue)
        return `val`
    }
}
