/**
 * Foo Emiter
 * Helps at compiling
 * Demo ANTLR
 @author loriacarlos@gmail.com 
 @version EIF400.II-2017
 @since 0.0
 
*/
package src.java.compiler;

import java.util.*;
import src.java.ast.KoKoAst;
import src.java.ast.KoKoBiOperation;
import src.java.ast.KoKoBool;
import src.java.ast.KoKoCall;
import src.java.ast.KoKoId;
import src.java.ast.KoKoLet;
import src.java.ast.KoKoList;
import src.java.ast.KoKoMINUS;
import src.java.ast.KoKoNum;
import src.java.ast.KoKoOperation;
import src.java.ast.KoKoPLUS;
import src.java.ast.KoKoProgram;

public interface KoKoEmiter{
	
   final KoKoBool TRUE = new KoKoBool(true);
   final KoKoBool FALSE = new KoKoBool(false);
   
   final KoKoAst PLUS = new KoKoId("+");
   final KoKoAst MINUS = new KoKoId("-");
   final KoKoAst ERROR = new KoKoId("??");
   
   default KoKoProgram PROGRAM(List<KoKoAst> stmts){ 
       return new KoKoProgram(stmts);
   }
   
   default KoKoAst LET(KoKoAst id, KoKoAst expr){
	   return new KoKoLet(id, expr);
   }
   default KoKoAst OPERATOR(String operator){
	   return new KoKoId(operator);
   }
   default KoKoAst OPERATION(KoKoAst operator, List<KoKoAst> operands){ 
       return new KoKoOperation(operator, operands);
   }
   
   default KoKoAst BI_OPERATION(KoKoAst operator, KoKoAst left, KoKoAst right){ 
       KoKoId id = (KoKoId)operator;
	   switch( id.getValue() ){
		   case "+" : return new KoKoPLUS(operator, left, right);
		   case "-" : return new KoKoMINUS(operator, left, right);
		   default  : return new KoKoBiOperation(operator, left, right);
	   }
       
   }
   
   default KoKoNum NUM(double value){ 
       return new KoKoNum(value);
   }
   
   default KoKoId ID(String value){ 
       return new KoKoId(value);
   }
   
   default KoKoList LIST(List<KoKoAst>expressions){
       return new KoKoList(expressions);
   } 
   default KoKoList LIST(){
       return new KoKoList();
   } 
   default KoKoAst CALL(KoKoAst head,KoKoList args){
       return new KoKoCall(head,args);
   } 
}