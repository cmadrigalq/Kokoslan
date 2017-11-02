/**
 * @author loriacarlos@gmail.com
 */
package KoKoKotlin.exception

import KoKoKotlin.ast.KoKoId


class KoKoNotFoundId(id: KoKoId) :
        RuntimeException(String.format("*** Id '%s' is not defined! ***", id.value))