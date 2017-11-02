// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package javaK.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoKoslanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, STRING=4, DOT=5, BACK_SLASH=6, COMMA=7, COLON=8, 
		QUESTION_MARK=9, LEFT_PAR=10, RIGHT_PAR=11, LEFT_CURLY=12, RIGHT_CURLY=13, 
		LEFT_BRACKET=14, RIGHT_BRACKET=15, LET=16, NOT=17, EQ=18, NEQ=19, LEQ=20, 
		OR=21, TRUE=22, FALSE=23, MUL=24, DIV=25, ADD=26, SUB=27, ID=28, SLC=29, 
		MLC=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", "COMMA", 
		"COLON", "QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", "'->'", null, null, "'.'", "'\\'", "','", "':'", "'?'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'let'", "'!'", "'='", "'!='", "'<='", 
		"'||'", "'true'", "'false'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NUMBER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public KoKoslanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KoKoslan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\4\5\4J\n\4\3\4\3\4\3\4\5\4O\n\4\3\5\6\5R\n\5"+
		"\r\5\16\5S\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u009b"+
		"\n\36\f\36\16\36\u009e\13\36\3\37\3\37\3\37\3\37\7\37\u00a4\n\37\f\37"+
		"\16\37\u00a7\13\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u00b2\n \f"+
		" \16 \u00b5\13 \3 \5 \u00b8\n \3 \3 \3 \3 \3!\6!\u00bf\n!\r!\16!\u00c0"+
		"\3!\3!\4\u00a5\u00b3\2\"\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!\3\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2"+
		"\2\5E\3\2\2\2\7I\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2"+
		"\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2"+
		"\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|"+
		"\3\2\2\2+\177\3\2\2\2-\u0082\3\2\2\2/\u0085\3\2\2\2\61\u008a\3\2\2\2\63"+
		"\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u0094\3\2\2\29\u0096\3\2\2\2;\u0098"+
		"\3\2\2\2=\u009f\3\2\2\2?\u00ad\3\2\2\2A\u00be\3\2\2\2CD\7~\2\2D\4\3\2"+
		"\2\2EF\7/\2\2FG\7@\2\2G\6\3\2\2\2HJ\7/\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KN\5\t\5\2LM\7\60\2\2MO\5\t\5\2NL\3\2\2\2NO\3\2\2\2O\b\3\2\2\2PR\t\2"+
		"\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\n\3\2\2\2UY\7$\2\2VX\n\3"+
		"\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"$\2\2]\f\3\2\2\2^_\7\60\2\2_\16\3\2\2\2`a\7^\2\2a\20\3\2\2\2bc\7.\2\2"+
		"c\22\3\2\2\2de\7<\2\2e\24\3\2\2\2fg\7A\2\2g\26\3\2\2\2hi\7*\2\2i\30\3"+
		"\2\2\2jk\7+\2\2k\32\3\2\2\2lm\7}\2\2m\34\3\2\2\2no\7\177\2\2o\36\3\2\2"+
		"\2pq\7]\2\2q \3\2\2\2rs\7_\2\2s\"\3\2\2\2tu\7n\2\2uv\7g\2\2vw\7v\2\2w"+
		"$\3\2\2\2xy\7#\2\2y&\3\2\2\2z{\7?\2\2{(\3\2\2\2|}\7#\2\2}~\7?\2\2~*\3"+
		"\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081,\3\2\2\2\u0082\u0083"+
		"\7~\2\2\u0083\u0084\7~\2\2\u0084.\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7w\2\2\u0088\u0089\7g\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7g\2\2\u008f\62\3\2\2\2\u0090\u0091\7,\2\2\u0091\64\3\2\2\2\u0092"+
		"\u0093\7\61\2\2\u0093\66\3\2\2\2\u0094\u0095\7-\2\2\u00958\3\2\2\2\u0096"+
		"\u0097\7/\2\2\u0097:\3\2\2\2\u0098\u009c\t\4\2\2\u0099\u009b\t\5\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d<\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1"+
		"\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\b\37\2\2\u00ac>\3\2\2\2\u00ad\u00ae\7\61\2"+
		"\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\7\17\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\f"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b \2\2\u00bc@\3\2\2\2\u00bd\u00bf"+
		"\t\6\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b!\2\2\u00c3B\3\2\2\2\f"+
		"\2INSY\u009c\u00a5\u00b3\u00b7\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}