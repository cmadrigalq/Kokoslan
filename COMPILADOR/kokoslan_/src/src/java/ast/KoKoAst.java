/**
 @author loriacarlos@gmail.com
 
*/
package src.java.ast;
import java.io.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoValue;


public interface KoKoAst{
   default void genCode(){
      genCode(System.out);
   }
   default void genCode(PrintStream out){
   }
   KoKoValue eval(KoKoContext ctx);
   
}