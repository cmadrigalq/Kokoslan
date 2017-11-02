/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import java.util.*
import java.io.*

import src.java.ast.KoKoAst





class KoKoProgram(private val statements: List<KoKoAst>) : KoKoAst {
    override fun genCode(out: PrintStream) {
        this.statements.stream()
                .forEach { t -> t.genCode(out) }
    }


    override fun eval(ctx: KoKoContext): KoKoValue {
        var res: KoKoValue? = null
        for (i in 0..statements.size - 1 - 1) {
            res = statements[i].eval(ctx)
        }
        res = statements[statements.size - 1].eval(ctx)
        return res

    }

    fun eval(): KoKoValue {
        return eval(KoKoContext())
    }
}