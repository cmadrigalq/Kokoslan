/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;

import src.java.eval.KoKoContext;
import src.java.eval.KoKoValue;


public class KoKoId extends KoKoAtom<String>{
   public KoKoId(String value){
      super(value);
   }
   @Override 
   public KoKoValue eval(KoKoContext ctx){
	   return ctx.find(this);
   }
   
}