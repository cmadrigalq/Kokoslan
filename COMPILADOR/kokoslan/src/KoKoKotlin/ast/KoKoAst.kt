package src.java.ast

import KoKoKotlin.eval.KoKoContext
import KoKoKotlin.eval.KoKoValue
import java.*
import java.io.*


interface KoKoAst {
    fun genCode(out: PrintStream = System.out) {
    }

    fun eval(ctx: KoKoContext): KoKoValue

}