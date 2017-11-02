/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;

import src.java.eval.KoKoContext;
import src.java.eval.KoKoNumValue;
import src.java.eval.KoKoValue;

public class KoKoNum extends KoKoAtom<Double>{
   public KoKoNum(Double value){
      super(value);
   }
   @Override
   public KoKoValue eval(KoKoContext ctx){
	   return new KoKoNumValue(getValue());
	   
   }
   
}