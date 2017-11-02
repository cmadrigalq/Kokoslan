/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue


class KoKoId(value: String) : KoKoKotlin.ast.KoKoAtom<String>(value) {
    override fun eval(ctx: KoKoContext): KoKoValue {
        return ctx.find(this)
    }

}