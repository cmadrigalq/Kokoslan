/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoListValue
import KoKoKotlin.eval.KoKoValue
import java.io.*
import java.util.*

import src.java.ast.KoKoAst



class KoKoList : ArrayList<KoKoAst>, KoKoAst {

    constructor(list: List<KoKoAst>) : super(list) {}

    constructor() : super() {}

    override fun genCode(out: PrintStream) {
        if (this.size == 0) {
            return
        }
        this[0].genCode(out)
        this.stream()
                .skip(1)
                .forEach { t ->
                    out.print(",")
                    t.genCode(out)
                }
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        val res = KoKoListValue()
        this.stream()
                .forEach { t -> res.add(t.eval(ctx)) }
        return res
    }

    fun eval(): KoKoValue {
        return eval(KoKoContext())
    }
}
