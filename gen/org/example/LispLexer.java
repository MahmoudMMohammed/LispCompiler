// Generated from C:/Users/DELL/IdeaProjects/compilerProject/src/main/java/org/example/LispLexer.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT_SINGLE=2, COMMENT_MULTI=3, SYMBOL=4, INTEGER=5, FLOAT=6, 
		RATIONAL=7, STRING=8, LPAREN=9, RPAREN=10, QUOTE=11, BACKQUOTE=12, COMMA=13, 
		COMMA_AT=14, DOT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT_SINGLE", "COMMENT_MULTI", "SYMBOL", "INTEGER", "FLOAT", 
			"RATIONAL", "STRING", "LPAREN", "RPAREN", "QUOTE", "BACKQUOTE", "COMMA", 
			"COMMA_AT", "DOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'''", 
			"'`'", "','", "',@'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT_SINGLE", "COMMENT_MULTI", "SYMBOL", "INTEGER", "FLOAT", 
			"RATIONAL", "STRING", "LPAREN", "RPAREN", "QUOTE", "BACKQUOTE", "COMMA", 
			"COMMA_AT", "DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LispLexer.g4"; }

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
		"\u0004\u0000\u000f\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003\u0001"+
		"\u0004\u0003\u0004H\b\u0004\u0001\u0004\u0004\u0004K\b\u0004\u000b\u0004"+
		"\f\u0004L\u0001\u0005\u0003\u0005P\b\u0005\u0001\u0005\u0004\u0005S\b"+
		"\u0005\u000b\u0005\f\u0005T\u0001\u0005\u0001\u0005\u0004\u0005Y\b\u0005"+
		"\u000b\u0005\f\u0005Z\u0001\u0006\u0003\u0006^\b\u0006\u0001\u0006\u0004"+
		"\u0006a\b\u0006\u000b\u0006\f\u0006b\u0001\u0006\u0001\u0006\u0004\u0006"+
		"g\b\u0006\u000b\u0006\f\u0006h\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0002*7\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005\u0003\u0000\t\n\r\r"+
		"  \t\u0000!!%&*+--//<?AZ__az\t\u0000!!%&*+--/9<?AZ__az\u0001\u000009\u0002"+
		"\u0000\"\"\\\\\u0091\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000\u0000"+
		"\u0003&\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007?"+
		"\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bO\u0001\u0000"+
		"\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000"+
		"\u0011u\u0001\u0000\u0000\u0000\u0013w\u0001\u0000\u0000\u0000\u0015y"+
		"\u0001\u0000\u0000\u0000\u0017{\u0001\u0000\u0000\u0000\u0019}\u0001\u0000"+
		"\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0082\u0001\u0000"+
		"\u0000\u0000\u001f!\u0007\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0000\u0000\u0000%\u0002"+
		"\u0001\u0000\u0000\u0000&*\u0005;\u0000\u0000\')\t\u0000\u0000\u0000("+
		"\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-.\u0005\n\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0001"+
		"\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005#\u0000\u000023\u0005"+
		"|\u0000\u000037\u0001\u0000\u0000\u000046\t\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0005|\u0000\u0000;<\u0005#\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=>\u0006\u0002\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?C\u0007\u0001"+
		"\u0000\u0000@B\u0007\u0002\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\b\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0005-\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IK\u0007\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\n\u0001"+
		"\u0000\u0000\u0000NP\u0005-\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QS\u0007\u0003\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0005.\u0000"+
		"\u0000WY\u0007\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\f\u0001"+
		"\u0000\u0000\u0000\\^\u0005-\u0000\u0000]\\\u0001\u0000\u0000\u0000]^"+
		"\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0007\u0003\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0005"+
		"/\u0000\u0000eg\u0007\u0003\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u000e\u0001\u0000\u0000\u0000jp\u0005\"\u0000\u0000kl\u0005\\\u0000"+
		"\u0000lo\t\u0000\u0000\u0000mo\b\u0004\u0000\u0000nk\u0001\u0000\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000st\u0005\"\u0000\u0000t\u0010\u0001\u0000\u0000\u0000"+
		"uv\u0005(\u0000\u0000v\u0012\u0001\u0000\u0000\u0000wx\u0005)\u0000\u0000"+
		"x\u0014\u0001\u0000\u0000\u0000yz\u0005\'\u0000\u0000z\u0016\u0001\u0000"+
		"\u0000\u0000{|\u0005`\u0000\u0000|\u0018\u0001\u0000\u0000\u0000}~\u0005"+
		",\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000"+
		"\u0000\u0080\u0081\u0005@\u0000\u0000\u0081\u001c\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005.\u0000\u0000\u0083\u001e\u0001\u0000\u0000\u0000\u000f"+
		"\u0000\"*7CGLOTZ]bhnp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}