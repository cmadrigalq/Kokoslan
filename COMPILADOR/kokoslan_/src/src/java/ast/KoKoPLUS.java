/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoNumValue;
import src.java.eval.KoKoValue;
import src.java.exception.KoKoEvalException;


public class KoKoPLUS extends KoKoBiOperation {
	
    public KoKoPLUS(KoKoAst operator, KoKoAst left, KoKoAst right){
		super(operator, left, right);
	}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
		     KoKoNumValue lv = (KoKoNumValue)(left().eval(ctx));
			 KoKoNumValue rv = (KoKoNumValue)(right().eval(ctx));
	         return new KoKoNumValue(lv.getValue() + rv.getValue());
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	   }
	   
   }
	
}