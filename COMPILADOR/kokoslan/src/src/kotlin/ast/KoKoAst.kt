
package src.kotlin.ast
import java.io.*
import kokoslan.ast.KoKoContext
import kokoslan.ast.KoKoValue


interface KoKoAst {
    //@JvmOverloads
    fun genCode(out: PrintStream = System.out) {
    }

    fun eval(ctx: KoKoContext): KoKoValue;

}