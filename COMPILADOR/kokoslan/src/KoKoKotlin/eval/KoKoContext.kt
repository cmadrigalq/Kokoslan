/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.eval

import KoKoKotlin.ast.KoKoId
import KoKoKotlin.exception.KoKoNotFoundId
import KoKoKotlin.exception.KoKoStackUnderflow
import java.util.*



class KoKoContext @JvmOverloads constructor(private val parent: KoKoContext? = null) : HashMap<String, KoKoValue>() {

    fun find(id: KoKoId): KoKoValue {
        val `val` = get(id.value)
        if (`val` != null) {
            return `val`
        }
        if (parent == null) {
            throw KoKoNotFoundId(id)
        }
        return parent.find(id)
    }

    fun assoc(id: KoKoId, `val`: KoKoValue) {
        /*if(super.containsKey(id.getValue()))
            throw new KokoIdDuplicatedException();*/
        put(id.value, `val`)
    }

    fun push(): KoKoContext {
        return KoKoContext(this)
    }

    fun pop(): KoKoContext {
        if (parent == null) {
            throw KoKoStackUnderflow()
        }
        return parent
    }

}
