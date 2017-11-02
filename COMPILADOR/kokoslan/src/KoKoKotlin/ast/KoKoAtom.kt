/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import KoKoKotlin.exception.KoKoEvalException
import src.java.ast.KoKoAst
import java.io.PrintStream


open class KoKoAtom<T>(val value: T) : KoKoAst {
    override fun genCode(out: PrintStream) {
        out.print(this.value.toString() + " ")
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        throw KoKoEvalException("KoKoAtom: eval not implemented")

    }

    override fun toString(): String {
        return value.toString()
    }
}