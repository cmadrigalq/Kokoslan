/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoNumValue
import KoKoKotlin.eval.KoKoValue
import KoKoKotlin.exception.KoKoEvalException
import java.util.*

import src.java.ast.KoKoAst



open class KoKoBiOperation(operator: KoKoAst, left: KoKoAst, right: KoKoAst) : KoKoKotlin.ast.KoKoOperation(operator, Arrays.asList(left, right)) {

    fun left(): KoKoAst {
        return this.operands[0]
    }

    fun right(): KoKoAst {
        return this.operands[1]
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        try {
            val operId = operator as KoKoKotlin.ast.KoKoId
            val lv = left().eval(ctx) as KoKoNumValue
            val rv = right().eval(ctx) as KoKoNumValue
            when (operId.value) {
                "+" -> return KoKoNumValue(lv.value + rv.value)
                "-" -> return KoKoNumValue(lv.value - rv.value)
                else -> throw KoKoEvalException("KoKoBiOperation: unimpemented operator")
            }

        } catch (e: Exception) {
            throw KoKoEvalException(e.message)
        }

    }

}