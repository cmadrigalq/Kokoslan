/**
 @author loriacarlos@gmail.com
 
*/
package src.java.exception;

import src.java.ast.KoKoId;

public class KoKoNotFoundId extends RuntimeException {
	public KoKoNotFoundId(KoKoId id){
		super( String.format("*** Id '%s' is not defined! ***", id.getValue()) );
	}
	
}