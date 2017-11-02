/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import KoKoKotlin.exception.KoKoEvalException
import java.util.*
import java.io.*

import src.java.ast.KoKoAst



open class KoKoOperation @JvmOverloads constructor(protected var operator: KoKoAst, protected var operands: MutableList<KoKoAst> = ArrayList()) : KoKoAst {
    fun addOperand(x: KoKoAst) {
        this.operands.add(x)
    }

    override fun genCode(out: PrintStream) {
        this.operands[0].genCode(out)
        this.operands.stream()
                .skip(1)
                .forEach { t ->
                    this.operator.genCode(out)
                    t.genCode(out)
                }
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        throw KoKoEvalException("KoKoOperation: eval not implemented")

    }

}