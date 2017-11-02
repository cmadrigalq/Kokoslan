/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.eval

import java.io.*

open class KoKoAtomValue<T>(val value: T) : KoKoValue {
    override fun toString(): String {
        return this.value.toString()
    }
}