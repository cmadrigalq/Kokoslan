
package src.java.eval;
import java.util.*;
import java.io.*;
public class KoKoListValue
		extends ArrayList<KoKoValue>
		implements KoKoValue{
	public KoKoListValue(ArrayList<KoKoValue>list){
		super(list);
	}
	public KoKoListValue(){
		super();
	}
}