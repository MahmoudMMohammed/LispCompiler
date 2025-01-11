// Generated from C:/Users/DELL/IdeaProjects/compilerProject/src/main/java/org/example/LispParser.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, COMMENT=2, WHITESPACE=3, LPAREN=4, RPAREN=5, QUOTE=6, 
		BACKSLASH=7, STRING=8, NUMBER=9, ADDITION=10, SUBTRACTION=11, MULTIPLICATION=12, 
		DIVISION=13, LESS_THAN=14, LESS_EQUAL=15, GREATER_THAN=16, GREATER_EQUAL=17, 
		EQUALS=18, NOT_EQUAL=19, UNDERSCORE=20, DEFUN=21, SETQ=22, LET=23, IF=24, 
		EXP=25, EXPT=26, LAMBDA=27, PROGN=28, LOOP=29, RETURN=30, COND=31, EVENP=32, 
		ODDP=33, CASE=34, OTHERWISE=35, AND=36, OR=37, NOT=38, QUOTEQ=39, DEFVAR=40, 
		DEFPARAMETER=41, DEFMACRO=42, FUNCTION=43, MAPCAR=44, APPLY=45, FUNCALL=46, 
		EVAL=47, LOAD=48, PRINT=49, READ=50, FORMAT=51, CONS=52, CAR=53, CDR=54, 
		LIST=55, APPEND=56, LENGTH=57, REVERSE=58, MEMBER=59, ASSOC=60, REMOVE=61, 
		FIND=62, POSITION=63, SUBSTRING=64, CONCATENATE=65, CHAR=66, AREF=67, 
		SORT=68, MERGE=69, SUBSETP=70, REDUCE=71, FILTER=72, EVERY=73, SOME=74, 
		NULL=75, TYPEOF=76, EQUAL=77, EQ=78, EQL=79, EQUALP=80, TYPEP=81, SUBTYPEP=82, 
		COERCE=83, DECLARE=84, THE=85, BLOCK=86, RETURN_FROM=87, CATCH=88, THROW=89, 
		TAGBODY=90, GO=91, DEFCLASS=92, DEFMETHOD=93, DEFGENERIC=94, INTERSECTION=95, 
		UNION=96, SET_DIFFERENCE=97, SIGNAL=98, ERROR=99, WARN=100, BREAK=101, 
		CONTINUE=102, STORE_VALUE=103, USE_VALUE=104, ABORT=105, TYPECASE=106, 
		ETYPECASE=107, CTYPECASE=108, PROG=109, PROG1=110, PROG2=111, DO=112, 
		DOLIST=113, DOTIMES=114, NEXT_METHOD_P=115, WHEN=116, UNLESS=117, NIL=118, 
		PUSH=119, POP=120, FACT=121, OPTIONAL=122, RESET=123, KEY=124, MAKE_ARRAY=125, 
		DEFSTRUCT=126, SETF=127, INCF=128, STAR2=129, STAR3=130, SYMBOL=131, UNEXPECTED_CHAR=132, 
		GRATER_THAN=133;
	public static final int
		RULE_program = 0, RULE_s_expr = 1, RULE_atom = 2, RULE_list = 3, RULE_function_call = 4, 
		RULE_special_form = 5, RULE_if_form = 6, RULE_defun_form = 7, RULE_let_form = 8, 
		RULE_let_binding = 9, RULE_lambda_form = 10, RULE_quote_form = 11, RULE_setq_form = 12, 
		RULE_arithmetic_expr = 13, RULE_comparison_expr = 14, RULE_logical_expr = 15, 
		RULE_list_operation = 16, RULE_other_expr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "s_expr", "atom", "list", "function_call", "special_form", 
			"if_form", "defun_form", "let_form", "let_binding", "lambda_form", "quote_form", 
			"setq_form", "arithmetic_expr", "comparison_expr", "logical_expr", "list_operation", 
			"other_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'''", "'\\'", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'/='", "'_'", 
			"'defun'", "'setq'", "'let'", "'if'", "'exp'", "'expt'", "'lambda'", 
			"'progn'", "'loop'", "'return'", "'cond'", "'evenp'", "'oddp'", "'case'", 
			"'otherwise'", "'and'", "'or'", "'not'", "'quote'", "'defvar'", "'defparameter'", 
			"'defmacro'", "'function'", "'mapcar'", "'apply'", "'funcall'", "'eval'", 
			"'load'", "'print'", "'read'", "'format'", "'cons'", "'car'", "'cdr'", 
			"'list'", "'append'", "'length'", "'reverse'", "'member'", "'assoc'", 
			"'remove'", "'find'", "'position'", "'substring'", "'concatenate'", "'char'", 
			"'aref'", "'sort'", "'merge'", "'subsetp'", "'reduce'", "'filter'", "'every'", 
			"'some'", "'null'", "'type_of'", "'equal'", "'eq'", "'eql'", "'equalp'", 
			"'typep'", "'subtypep'", "'coerce'", "'declare'", "'the'", "'block'", 
			"'return_from'", "'catch'", "'throw'", "'tagbody'", "'go'", "'defclass'", 
			"'defmethod'", "'defgeneric'", "'intersection'", "'union'", "'set-difference'", 
			"'signal'", "'error'", "'warn'", "'break'", "'continue'", "'store_value'", 
			"'use_value'", "'abort'", "'typecase'", "'etypecase'", "'ctypecase'", 
			"'prog'", "'prog1'", "'prog2'", "'do'", "'dolist'", "'dotimes'", "'next_method_p'", 
			"'when'", "'unless'", "'nil'", "'push'", "'pop'", "'fact'", "'&optional'", 
			"'&rest'", "'&key'", "'make-array'", "'defstruct'", "'setf'", "'incf'", 
			"'**'", "'***'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "COMMENT", "WHITESPACE", "LPAREN", "RPAREN", "QUOTE", 
			"BACKSLASH", "STRING", "NUMBER", "ADDITION", "SUBTRACTION", "MULTIPLICATION", 
			"DIVISION", "LESS_THAN", "LESS_EQUAL", "GREATER_THAN", "GREATER_EQUAL", 
			"EQUALS", "NOT_EQUAL", "UNDERSCORE", "DEFUN", "SETQ", "LET", "IF", "EXP", 
			"EXPT", "LAMBDA", "PROGN", "LOOP", "RETURN", "COND", "EVENP", "ODDP", 
			"CASE", "OTHERWISE", "AND", "OR", "NOT", "QUOTEQ", "DEFVAR", "DEFPARAMETER", 
			"DEFMACRO", "FUNCTION", "MAPCAR", "APPLY", "FUNCALL", "EVAL", "LOAD", 
			"PRINT", "READ", "FORMAT", "CONS", "CAR", "CDR", "LIST", "APPEND", "LENGTH", 
			"REVERSE", "MEMBER", "ASSOC", "REMOVE", "FIND", "POSITION", "SUBSTRING", 
			"CONCATENATE", "CHAR", "AREF", "SORT", "MERGE", "SUBSETP", "REDUCE", 
			"FILTER", "EVERY", "SOME", "NULL", "TYPEOF", "EQUAL", "EQ", "EQL", "EQUALP", 
			"TYPEP", "SUBTYPEP", "COERCE", "DECLARE", "THE", "BLOCK", "RETURN_FROM", 
			"CATCH", "THROW", "TAGBODY", "GO", "DEFCLASS", "DEFMETHOD", "DEFGENERIC", 
			"INTERSECTION", "UNION", "SET_DIFFERENCE", "SIGNAL", "ERROR", "WARN", 
			"BREAK", "CONTINUE", "STORE_VALUE", "USE_VALUE", "ABORT", "TYPECASE", 
			"ETYPECASE", "CTYPECASE", "PROG", "PROG1", "PROG2", "DO", "DOLIST", "DOTIMES", 
			"NEXT_METHOD_P", "WHEN", "UNLESS", "NIL", "PUSH", "POP", "FACT", "OPTIONAL", 
			"RESET", "KEY", "MAKE_ARRAY", "DEFSTRUCT", "SETF", "INCF", "STAR2", "STAR3", 
			"SYMBOL", "UNEXPECTED_CHAR", "GRATER_THAN"
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

	@Override
	public String getGrammarFileName() { return "LispParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL) {
				{
				{
				setState(36);
				s_expr();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class S_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public S_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterS_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitS_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitS_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_exprContext s_expr() throws RecognitionException {
		S_exprContext _localctx = new S_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s_expr);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case STRING:
			case NUMBER:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode SYMBOL() { return getToken(LispParser.SYMBOL, 0); }
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public TerminalNode QUOTE() { return getToken(LispParser.QUOTE, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NUMBER);
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(SYMBOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(STRING);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(QUOTE);
				setState(52);
				s_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public Special_formContext special_form() {
			return getRuleContext(Special_formContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public List_operationContext list_operation() {
			return getRuleContext(List_operationContext.class,0);
		}
		public Other_exprContext other_expr() {
			return getRuleContext(Other_exprContext.class,0);
		}
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LPAREN);
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(56);
				special_form();
				}
				break;
			case 2:
				{
				setState(57);
				function_call();
				}
				break;
			case 3:
				{
				setState(58);
				arithmetic_expr();
				}
				break;
			case 4:
				{
				setState(59);
				comparison_expr();
				}
				break;
			case 5:
				{
				setState(60);
				logical_expr();
				}
				break;
			case 6:
				{
				setState(61);
				list_operation();
				}
				break;
			case 7:
				{
				setState(62);
				other_expr();
				}
				break;
			case 8:
				{
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL) {
					{
					{
					setState(63);
					s_expr();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(71);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(LispParser.SYMBOL, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(SYMBOL);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL) {
				{
				{
				setState(74);
				s_expr();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Special_formContext extends ParserRuleContext {
		public If_formContext if_form() {
			return getRuleContext(If_formContext.class,0);
		}
		public Defun_formContext defun_form() {
			return getRuleContext(Defun_formContext.class,0);
		}
		public Let_formContext let_form() {
			return getRuleContext(Let_formContext.class,0);
		}
		public Lambda_formContext lambda_form() {
			return getRuleContext(Lambda_formContext.class,0);
		}
		public Quote_formContext quote_form() {
			return getRuleContext(Quote_formContext.class,0);
		}
		public Setq_formContext setq_form() {
			return getRuleContext(Setq_formContext.class,0);
		}
		public Special_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterSpecial_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitSpecial_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitSpecial_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_formContext special_form() throws RecognitionException {
		Special_formContext _localctx = new Special_formContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_special_form);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				if_form();
				}
				break;
			case DEFUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				defun_form();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				let_form();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				lambda_form();
				}
				break;
			case QUOTEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				quote_form();
				}
				break;
			case SETQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				setq_form();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_formContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LispParser.IF, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public If_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterIf_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitIf_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitIf_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_formContext if_form() throws RecognitionException {
		If_formContext _localctx = new If_formContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			s_expr();
			setState(90);
			s_expr();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL) {
				{
				setState(91);
				s_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defun_formContext extends ParserRuleContext {
		public TerminalNode DEFUN() { return getToken(LispParser.DEFUN, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(LispParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(LispParser.SYMBOL, i);
		}
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Defun_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defun_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterDefun_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitDefun_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitDefun_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defun_formContext defun_form() throws RecognitionException {
		Defun_formContext _localctx = new Defun_formContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defun_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DEFUN);
			setState(95);
			match(SYMBOL);
			setState(96);
			match(LPAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL) {
				{
				{
				setState(97);
				match(SYMBOL);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RPAREN);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				s_expr();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Let_formContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LispParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<Let_bindingContext> let_binding() {
			return getRuleContexts(Let_bindingContext.class);
		}
		public Let_bindingContext let_binding(int i) {
			return getRuleContext(Let_bindingContext.class,i);
		}
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Let_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLet_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLet_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLet_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_formContext let_form() throws RecognitionException {
		Let_formContext _localctx = new Let_formContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_let_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LET);
			setState(110);
			match(LPAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(111);
				let_binding();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RPAREN);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				s_expr();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Let_bindingContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode SYMBOL() { return getToken(LispParser.SYMBOL, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public Let_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLet_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLet_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLet_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_bindingContext let_binding() throws RecognitionException {
		Let_bindingContext _localctx = new Let_bindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_let_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LPAREN);
			setState(124);
			match(SYMBOL);
			setState(125);
			s_expr();
			setState(126);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_formContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(LispParser.LAMBDA, 0); }
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(LispParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(LispParser.SYMBOL, i);
		}
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Lambda_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLambda_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLambda_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLambda_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_formContext lambda_form() throws RecognitionException {
		Lambda_formContext _localctx = new Lambda_formContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lambda_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LAMBDA);
			setState(129);
			match(LPAREN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL) {
				{
				{
				setState(130);
				match(SYMBOL);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(RPAREN);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				s_expr();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quote_formContext extends ParserRuleContext {
		public TerminalNode QUOTEQ() { return getToken(LispParser.QUOTEQ, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public Quote_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterQuote_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitQuote_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitQuote_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quote_formContext quote_form() throws RecognitionException {
		Quote_formContext _localctx = new Quote_formContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quote_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(QUOTEQ);
			setState(143);
			s_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Setq_formContext extends ParserRuleContext {
		public TerminalNode SETQ() { return getToken(LispParser.SETQ, 0); }
		public TerminalNode SYMBOL() { return getToken(LispParser.SYMBOL, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public Setq_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setq_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterSetq_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitSetq_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitSetq_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setq_formContext setq_form() throws RecognitionException {
		Setq_formContext _localctx = new Setq_formContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setq_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(SETQ);
			setState(146);
			match(SYMBOL);
			setState(147);
			s_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_exprContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(LispParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(LispParser.SUBTRACTION, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(LispParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(LispParser.DIVISION, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitArithmetic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitArithmetic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmetic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				s_expr();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_exprContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(LispParser.LESS_THAN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(LispParser.LESS_EQUAL, 0); }
		public TerminalNode EQUALS() { return getToken(LispParser.EQUALS, 0); }
		public TerminalNode EQUAL() { return getToken(LispParser.EQUAL, 0); }
		public TerminalNode GRATER_THAN() { return getToken(LispParser.GRATER_THAN, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(LispParser.GREATER_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LispParser.NOT_EQUAL, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterComparison_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitComparison_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitComparison_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 966656L) != 0) || _la==EQUAL || _la==GRATER_THAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				s_expr();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_exprContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LispParser.AND, 0); }
		public TerminalNode OR() { return getToken(LispParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LispParser.NOT, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLogical_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLogical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logical_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				s_expr();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_operationContext extends ParserRuleContext {
		public TerminalNode CAR() { return getToken(LispParser.CAR, 0); }
		public TerminalNode CDR() { return getToken(LispParser.CDR, 0); }
		public TerminalNode CONS() { return getToken(LispParser.CONS, 0); }
		public TerminalNode LIST() { return getToken(LispParser.LIST, 0); }
		public TerminalNode APPEND() { return getToken(LispParser.APPEND, 0); }
		public TerminalNode LENGTH() { return getToken(LispParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(LispParser.REVERSE, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public List_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterList_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitList_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitList_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_operationContext list_operation() throws RecognitionException {
		List_operationContext _localctx = new List_operationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957152676052992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				s_expr();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Other_exprContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LispParser.PRINT, 0); }
		public TerminalNode EVAL() { return getToken(LispParser.EVAL, 0); }
		public TerminalNode LOAD() { return getToken(LispParser.LOAD, 0); }
		public TerminalNode READ() { return getToken(LispParser.READ, 0); }
		public TerminalNode FORMAT() { return getToken(LispParser.FORMAT, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Other_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterOther_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitOther_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitOther_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_exprContext other_expr() throws RecognitionException {
		Other_exprContext _localctx = new Other_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_other_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4362862139015168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				s_expr();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 848L) != 0) || _la==SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003A\b\u0003\n\u0003\f\u0003D\t\u0003\u0003"+
		"\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004L\b\u0004\n\u0004\f\u0004O\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007c\b\u0007\n\u0007"+
		"\f\u0007f\t\u0007\u0001\u0007\u0001\u0007\u0004\u0007j\b\u0007\u000b\u0007"+
		"\f\u0007k\u0001\b\u0001\b\u0001\b\u0005\bq\b\b\n\b\f\bt\t\b\u0001\b\u0001"+
		"\b\u0004\bx\b\b\u000b\b\f\by\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0084\b\n\n\n\f\n\u0087\t\n\u0001\n\u0001\n"+
		"\u0004\n\u008b\b\n\u000b\n\f\n\u008c\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u0098\b\r\u000b"+
		"\r\f\r\u0099\u0001\u000e\u0001\u000e\u0004\u000e\u009e\b\u000e\u000b\u000e"+
		"\f\u000e\u009f\u0001\u000f\u0001\u000f\u0004\u000f\u00a4\b\u000f\u000b"+
		"\u000f\f\u000f\u00a5\u0001\u0010\u0001\u0010\u0004\u0010\u00aa\b\u0010"+
		"\u000b\u0010\f\u0010\u00ab\u0001\u0011\u0001\u0011\u0004\u0011\u00b0\b"+
		"\u0011\u000b\u0011\f\u0011\u00b1\u0001\u0011\u0000\u0000\u0012\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"\u0000\u0005\u0001\u0000\n\r\u0004\u0000\u000e\u000f\u0011\u0013MM"+
		"\u0085\u0085\u0001\u0000$&\u0001\u00004:\u0001\u0000/3\u00c0\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000"+
		"\u0000\u00067\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nV\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000"+
		"\u0000\u0010m\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014"+
		"\u0080\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018"+
		"\u0091\u0001\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c"+
		"\u009b\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 \u00a7"+
		"\u0001\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$&\u0003\u0002"+
		"\u0001\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000"+
		"\u0000\u0000,/\u0003\u0004\u0002\u0000-/\u0003\u0006\u0003\u0000.,\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u000006\u0005\t\u0000\u000016\u0005\u0083\u0000\u000026\u0005\b\u0000"+
		"\u000034\u0005\u0006\u0000\u000046\u0003\u0002\u0001\u000050\u0001\u0000"+
		"\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u00007E\u0005\u0004\u0000"+
		"\u00008F\u0003\n\u0005\u00009F\u0003\b\u0004\u0000:F\u0003\u001a\r\u0000"+
		";F\u0003\u001c\u000e\u0000<F\u0003\u001e\u000f\u0000=F\u0003 \u0010\u0000"+
		">F\u0003\"\u0011\u0000?A\u0003\u0002\u0001\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000E8\u0001\u0000"+
		"\u0000\u0000E9\u0001\u0000\u0000\u0000E:\u0001\u0000\u0000\u0000E;\u0001"+
		"\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000E=\u0001\u0000\u0000\u0000"+
		"E>\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0005\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IM\u0005"+
		"\u0083\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\t\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PW\u0003\f"+
		"\u0006\u0000QW\u0003\u000e\u0007\u0000RW\u0003\u0010\b\u0000SW\u0003\u0014"+
		"\n\u0000TW\u0003\u0016\u000b\u0000UW\u0003\u0018\f\u0000VP\u0001\u0000"+
		"\u0000\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"W\u000b\u0001\u0000\u0000\u0000XY\u0005\u0018\u0000\u0000YZ\u0003\u0002"+
		"\u0001\u0000Z\\\u0003\u0002\u0001\u0000[]\u0003\u0002\u0001\u0000\\[\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0015\u0000\u0000_`\u0005\u0083\u0000\u0000`d\u0005\u0004\u0000"+
		"\u0000ac\u0005\u0083\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005\u0005\u0000\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u000f\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0017\u0000\u0000nr\u0005\u0004\u0000\u0000"+
		"oq\u0003\u0012\t\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uw\u0005\u0005\u0000\u0000vx\u0003\u0002"+
		"\u0001\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0011\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0004\u0000\u0000|}\u0005\u0083\u0000\u0000}~\u0003\u0002"+
		"\u0001\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0013\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u0085\u0005\u0004\u0000"+
		"\u0000\u0082\u0084\u0005\u0083\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0005\u0000"+
		"\u0000\u0089\u008b\u0003\u0002\u0001\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\'\u0000\u0000\u008f\u0090\u0003\u0002\u0001\u0000"+
		"\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0016\u0000\u0000"+
		"\u0092\u0093\u0005\u0083\u0000\u0000\u0093\u0094\u0003\u0002\u0001\u0000"+
		"\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0000\u0000\u0000"+
		"\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0007\u0001\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a3\u0007\u0002\u0000\u0000"+
		"\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u001f\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0007\u0003\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0004\u0000\u0000\u00ae"+
		"\u00b0\u0003\u0002\u0001\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u0013\'"+
		".5BEMV\\dkry\u0085\u008c\u0099\u009f\u00a5\u00ab\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}