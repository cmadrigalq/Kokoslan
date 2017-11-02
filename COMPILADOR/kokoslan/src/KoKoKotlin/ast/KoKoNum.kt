/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoNumValue
import KoKoKotlin.eval.KoKoValue


class KoKoNum(value: Double) : KoKoKotlin.ast.KoKoAtom<Double>(value) {
    override fun eval(ctx: KoKoContext): KoKoValue {
        return KoKoNumValue(value)

    }

}