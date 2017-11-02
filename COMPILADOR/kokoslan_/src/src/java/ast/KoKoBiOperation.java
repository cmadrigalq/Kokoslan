/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;
import java.util.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoNumValue;
import src.java.eval.KoKoValue;
import src.java.exception.KoKoEvalException;


public class KoKoBiOperation extends KoKoOperation {
	
    public KoKoBiOperation(KoKoAst operator, KoKoAst left, KoKoAst right){
		super(operator, Arrays.asList(left, right));
	}
	
	public KoKoAst left(){return this.operands.get(0);}
	public KoKoAst right(){return this.operands.get(1);}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
	        KoKoId operId = (KoKoId)operator;
			KoKoNumValue lv = (KoKoNumValue)(left().eval(ctx));
			KoKoNumValue rv = (KoKoNumValue)(right().eval(ctx));
			switch (operId.getValue()){
				case "+" : return new KoKoNumValue(lv.getValue() + rv.getValue());
				case "-" : return new KoKoNumValue(lv.getValue() - rv.getValue());
				default  : throw new KoKoEvalException("KoKoBiOperation: unimpemented operator");
			}
			
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	     }
	   
   }
	
}