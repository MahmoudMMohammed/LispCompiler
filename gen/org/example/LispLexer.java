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
		LINE_COMMENT=1, COMMENT=2, STRING=3, SYMBOL=4, NUMBER=5, WHITESPACE=6, 
		LPAREN=7, RPAREN=8, QUOTE=9, BACKSLASH=10, ERROR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LINE_COMMENT", "COMMENT", "STRING", "SYMBOL", "NUMBER", "WHITESPACE", 
			"LPAREN", "RPAREN", "QUOTE", "BACKSLASH", "ESC_SEQ", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "'''", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "COMMENT", "STRING", "SYMBOL", "NUMBER", "WHITESPACE", 
			"LPAREN", "RPAREN", "QUOTE", "BACKSLASH", "ERROR"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.err.println("Lexical error at line " + getLine() + ":" + getCharPositionInLine() + " - unrecognized sequence: " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000"+
		"\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"1\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003\u0001\u0004"+
		"\u0004\u0004@\b\u0004\u000b\u0004\f\u0004A\u0001\u0004\u0001\u0004\u0004"+
		"\u0004F\b\u0004\u000b\u0004\f\u0004G\u0003\u0004J\b\u0004\u0001\u0005"+
		"\u0004\u0005M\b\u0005\u000b\u0005\f\u0005N\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b_\b\u000b\u000b\u000b"+
		"\f\u000b`\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u0000\u0017\u000b\u0001\u0000\b\u0002\u0000\n\n\r\r\u0002\u0000"+
		"\"\"\\\\\t\u0000!!$&*+--//<?AZ__az\t\u0000!!$&*+--/9<?AZ__az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \b\u0000\"\"\'\'\\\\bbffnnrrtt\u000b\u0000\t\n"+
		"\r\r \"$+--/9;?AZ\\\\__azl\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u00077\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000b"+
		"L\u0001\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fT\u0001\u0000"+
		"\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000"+
		"\u0015Z\u0001\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019\u001d"+
		"\u0005;\u0000\u0000\u001a\u001c\b\u0000\u0000\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0006\u0000\u0000\u0000"+
		"!\u0002\u0001\u0000\u0000\u0000\"#\u0005;\u0000\u0000#$\u0005;\u0000\u0000"+
		"$(\u0001\u0000\u0000\u0000%\'\b\u0000\u0000\u0000&%\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0006"+
		"\u0001\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-2\u0005\"\u0000\u0000"+
		".1\u0003\u0015\n\u0000/1\b\u0001\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000056\u0005\"\u0000\u00006\u0006\u0001\u0000\u0000\u00007;\u0007"+
		"\u0002\u0000\u00008:\u0007\u0003\u0000\u000098\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0007\u0004"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BI\u0001\u0000\u0000\u0000"+
		"CE\u0005.\u0000\u0000DF\u0007\u0004\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HJ\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\n\u0001\u0000\u0000\u0000KM\u0007\u0005\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\u0005\u0000"+
		"\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000S\u000e\u0001\u0000"+
		"\u0000\u0000TU\u0005)\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005"+
		"\'\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005\\\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005\\\u0000\u0000[\\\u0007\u0006\u0000\u0000"+
		"\\\u0016\u0001\u0000\u0000\u0000]_\b\u0007\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u000b\u0001\u0000c\u0018"+
		"\u0001\u0000\u0000\u0000\u000b\u0000\u001d(02;AGIN`\u0002\u0006\u0000"+
		"\u0000\u0001\u000b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}