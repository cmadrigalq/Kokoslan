/**
 * @author loriacarlos@gmail.com
 *
 */
package src.java.ast;

import java.io.*;
import java.util.*;
import src.java.eval.KoKoContext;
import src.java.eval.KoKoListValue;
import src.java.eval.KoKoValue;

public class KoKoList
        extends ArrayList<KoKoAst>
        implements KoKoAst {

    public KoKoList(List<KoKoAst> list) {
        super(list);
    }

    public KoKoList() {
        super();
    }

    public void genCode(PrintStream out) {
        if (this.size() == 0) {
            return;
        }
        this.get(0).genCode(out);
        this.stream()
                .skip(1)
                .forEach(
                        t -> {
                            out.print(",");
                            t.genCode(out);
                        }
                );
    }

    @Override
    public KoKoValue eval(KoKoContext ctx) {
        KoKoListValue res = new KoKoListValue();
        this.stream()
                .forEach(t -> res.add(t.eval(ctx)));
        return res;
    }

    public KoKoValue eval() {
        return eval(new KoKoContext());
    }
}
