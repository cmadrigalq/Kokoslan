/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;
import java.io.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoValue;
import src.java.exception.KoKoEvalException;


public class KoKoAtom<T> implements KoKoAst{
   private T value;
   public T getValue(){return this.value;}
   
   public KoKoAtom(T value){
      this.value = value;
   }
   @Override
   public void genCode(PrintStream out){
      out.print(this.value + " ");
   }
   public KoKoValue eval(KoKoContext ctx){
	   throw new KoKoEvalException("KoKoAtom: eval not implemented");
	   
   }
   public String toString(){
	   return value.toString();
   }
}