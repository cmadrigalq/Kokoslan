
package src.java.exception

import src.java.ast.KoKoId

    class KokoIdDuplicatedException(id: KoKoId) :
         RuntimeException(String.format("*** Id '%s' already exists! ***", id.getValue()))