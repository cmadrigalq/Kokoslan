/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoNumValue
import KoKoKotlin.eval.KoKoValue
import KoKoKotlin.exception.KoKoEvalException
import src.java.ast.KoKoAst



class KoKoPLUS(operator: KoKoAst, left: KoKoAst, right: KoKoAst) : KoKoKotlin.ast.KoKoBiOperation(operator, left, right) {

    override fun eval(ctx: KoKoContext): KoKoValue {
        try {
            val lv = left().eval(ctx) as KoKoNumValue
            val rv = right().eval(ctx) as KoKoNumValue
            return KoKoNumValue(lv.value + rv.value)
        } catch (e: Exception) {
            throw KoKoEvalException(e.message)
        }

    }

}