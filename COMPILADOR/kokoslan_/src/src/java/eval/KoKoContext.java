/**
 * @author loriacarlos@gmail.com
 *
 */
package src.java.eval;

import java.util.*;
import src.java.ast.KoKoId;
import src.java.exception.KoKoNotFoundId;
import src.java.exception.KoKoStackUnderflow;

public class KoKoContext extends HashMap<String, KoKoValue> {

    private KoKoContext parent;

    public KoKoContext() {
        this(null);
    }

    public KoKoContext(KoKoContext parent) {
        this.parent = parent;
    }

    public KoKoValue find(KoKoId id) {
        KoKoValue val = get(id.getValue());
        if (val != null) {
            return val;
        }
        if (parent == null) {
            throw new KoKoNotFoundId(id);
        }
        return parent.find(id);
    }

    public void assoc(KoKoId id, KoKoValue val) {
        /*if(super.containsKey(id.getValue()))
            throw new KokoIdDuplicatedException();*/
        put(id.getValue(), val);
    }

    public KoKoContext push() {
        return new KoKoContext(this);
    }

    public KoKoContext pop() {
        if (parent == null) {
            throw new KoKoStackUnderflow();
        }
        return parent;
    }

}
