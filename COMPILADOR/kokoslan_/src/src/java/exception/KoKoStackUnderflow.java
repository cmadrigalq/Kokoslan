/**
 @author loriacarlos@gmail.com
 
*/
package src.java.exception;


public class KoKoStackUnderflow extends RuntimeException {
	public KoKoStackUnderflow(){
		super( "Pop of an empty context" );
	}
	
}