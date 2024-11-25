// Generated from C:/Users/DELL/IdeaProjects/compilerProject/src/main/java/org/example/LispLexer.g4 by ANTLR 4.13.2

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
		COMMENT=1, STRING=2, SYMBOL=3, NUMBER=4, WHITESPACE=5, LPAREN=6, RPAREN=7, 
		QUOTE=8, BACKSLASH=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "STRING", "SYMBOL", "NUMBER", "WHITESPACE", "LPAREN", "RPAREN", 
			"QUOTE", "BACKSLASH", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'''", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "STRING", "SYMBOL", "NUMBER", "WHITESPACE", "LPAREN", 
			"RPAREN", "QUOTE", "BACKSLASH"
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
		"\u0004\u0000\tP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0003"+
		"\u0004\u00033\b\u0003\u000b\u0003\f\u00034\u0001\u0003\u0001\u0003\u0004"+
		"\u00039\b\u0003\u000b\u0003\f\u0003:\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0004\u0004@\b\u0004\u000b\u0004\f\u0004A\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\u0000\u0001\u0000\u0007\u0002\u0000\n\n\r\r\u0002\u0000\"\"\\\\\t\u0000"+
		"!!$&*+--//<?AZ__az\t\u0000!!$&*+--/9<?AZ__az\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \b\u0000\"\"\'\'\\\\bbffnnrrttV\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001"+
		"\u0015\u0001\u0000\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u0005*\u0001"+
		"\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000f"+
		"I\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005;\u0000\u0000\u0016\u0017\u0005;\u0000"+
		"\u0000\u0017\u001b\u0001\u0000\u0000\u0000\u0018\u001a\b\u0000\u0000\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0006\u0000\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000"+
		" %\u0005\"\u0000\u0000!$\u0003\u0013\t\u0000\"$\b\u0001\u0000\u0000#!"+
		"\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\"\u0000\u0000)\u0004\u0001"+
		"\u0000\u0000\u0000*.\u0007\u0002\u0000\u0000+-\u0007\u0003\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/\u0006\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000013\u0007\u0004\u0000\u000021\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u00005<\u0001\u0000\u0000\u000068\u0005.\u0000\u000079\u0007\u0004\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<6\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\b\u0001\u0000\u0000\u0000"+
		">@\u0007\u0005\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0006\u0004\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005"+
		"(\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u000e\u0001"+
		"\u0000\u0000\u0000IJ\u0005\'\u0000\u0000J\u0010\u0001\u0000\u0000\u0000"+
		"KL\u0005\\\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005\\\u0000"+
		"\u0000NO\u0007\u0006\u0000\u0000O\u0014\u0001\u0000\u0000\u0000\t\u0000"+
		"\u001b#%.4:<A\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}