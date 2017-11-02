package KoKoKotlin.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import KoKoKotlin.exception.KoKoEvalException
import java.util.*
import java.io.*

import src.java.ast.KoKoAst



class KoKoCall @JvmOverloads constructor(protected var head: KoKoAst, protected var args: KoKoList = KoKoList()) : KoKoAst {

    override fun genCode(out: PrintStream) {
        this.head.genCode(out)
        out.print("(")
        this.args.genCode(out)
        out.print(")")
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        throw KoKoEvalException("KoKoCall: eval not implemented ")
    }

}
