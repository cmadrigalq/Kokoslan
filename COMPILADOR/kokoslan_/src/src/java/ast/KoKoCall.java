
package src.java.ast;
import java.util.*;
import java.io.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoValue;
import src.java.exception.KoKoEvalException;
public class KoKoCall 
        implements KoKoAst{
    protected KoKoList args;
    protected KoKoAst head;

    public KoKoCall(KoKoAst head,KoKoList args) {
        this.args = args;
        this.head = head;
    }

    public KoKoCall(KoKoAst head) {
        this(head , new KoKoList());
    }

    @Override
    public void genCode(PrintStream out) {
        this.head.genCode(out);
        out.print("(");
        this.args.genCode(out);
        out.print(")");
    }

    @Override
    public KoKoValue eval(KoKoContext ctx) {
        throw new KoKoEvalException("KoKoCall: eval not implemented ");
    }
    
}
