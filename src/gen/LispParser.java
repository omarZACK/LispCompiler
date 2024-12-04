// Generated from /home/omarwawy/IdeaProjects/Lisp/src/gen/LispParser.g4 by ANTLR 4.13.2
package gen;
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, QUOTE=3, WS=4, COMMENT_START=5, MULTILINE_COMMENT_START=6, 
		STRING_START=7, TRUE=8, FALSE=9, PLUS=10, MINUS=11, MULTIPLY=12, DIVIDE=13, 
		EQUAL=14, LT=15, GT=16, LTE=17, GTE=18, AND=19, OR=20, NOT=21, MIN=22, 
		MAX=23, INCF=24, DECF=25, LOGAND=26, LOGIOR=27, LOGXOR=28, LOGNOR=29, 
		LOGEQV=30, EVEN=31, COND=32, IF=33, WHEN=34, UNLESS=35, CASE=36, OTHERWISE=37, 
		DOLIST=38, DOTIMES=39, LOOP=40, FOR=41, DO_LOOP=42, ERROR=43, BLOCK=44, 
		FUNCALL=45, APPLY=46, MAPCAR=47, LAMBDA=48, VECTOR=49, CHARACTER=50, STRING=51, 
		ARRAY=52, MARCO=53, SETQ=54, FUNCTION=55, STRUCT=56, PRINT=57, DEFPARAM=58, 
		VARIABLE=59, WRITE=60, FORMAT=61, LET=62, PROGN=63, CONSTANT=64, BOUNDP=65, 
		LIST=66, CONS=67, FIXNUM=68, BIGNUM=69, RATION=70, FLOAT=71, COMPLEX=72, 
		SIN=73, COS=74, TAN=75, ASIN=76, ACOS=77, ATAN=78, SINH=79, COSH=80, TANH=81, 
		EXP=82, EXPT=83, SQRT=84, LOG=85, CONJUGATE=86, ABS=87, GCD=88, LCM=89, 
		ISQRT=90, FLOOR=91, CEIL=92, MODULO=93, PUSH=94, POP=95, ARRAYREF=96, 
		SORT=97, APPEND=98, REVERSE=99, MEMBERS=100, SUBSET=101, INTERSECT=102, 
		UNION=103, DIFFERENT=104, KEYWORD=105, ID=106, NUMBERDEF=107, COMPLEXNUMBERDEF=108, 
		STRINGDEF=109, MULTILINE_COMMENT=110, SINGLELINECOMMENT=111, STRING_CONTENT=112, 
		STRING_END=113, FORMAT_STRING_BEGIN=114, FORMAT_ARG=115, FORMAT_END=116, 
		TILDE_A=117, TILDE_S=118, TILDE_PERCENT=119, TILDE_AMPERSAND=120, TILDE_D=121, 
		TILDE_F=122, FORMAT_STRING_CONTENT=123, FORMAT_STRING_END=124;
	public static final int
		RULE_lisp = 0, RULE_expression = 1, RULE_list = 2, RULE_list_content = 3, 
		RULE_arithmetic_expression = 4, RULE_comparison_expression = 5, RULE_conditional_expression = 6, 
		RULE_if_expression = 7, RULE_when_expression = 8, RULE_cond_expression = 9, 
		RULE_cond_clause = 10, RULE_case_expression = 11, RULE_case_clause = 12, 
		RULE_value_list = 13, RULE_nested_list = 14, RULE_default_clause = 15, 
		RULE_logical_expression = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"lisp", "expression", "list", "list_content", "arithmetic_expression", 
			"comparison_expression", "conditional_expression", "if_expression", "when_expression", 
			"cond_expression", "cond_clause", "case_expression", "case_clause", "value_list", 
			"nested_list", "default_clause", "logical_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", null, "'''", null, null, null, null, "'t'", "'nil'", "'+'", 
			"'-'", "'*'", "'/'", null, "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", 
			"'not'", "'min'", "'max'", "'incf'", "'decf'", "'logand'", "'logior'", 
			"'logxor'", "'lognor'", "'logeqv'", "'evenp'", "'cond'", "'if'", "'when'", 
			"'unless'", "'case'", "'otherwise'", "'dolist'", "'dotimes'", "'loop'", 
			"'for'", "'do'", "'error'", "'block'", "'funcall'", "'apply'", "'mapcar'", 
			"'lambda'", "'vector'", "'char'", "'string'", "'make-array'", "'defmacro'", 
			"'setq'", "'defun'", "'defstruct'", "'print'", "'defparameter'", "'defvar'", 
			"'write'", "'format'", "'let'", "'prog'", "'defconstant'", "'boundp'", 
			"'list'", "'cons'", "'fixnum'", "'bignum'", "'ratio'", "'float'", "'complex'", 
			"'sin'", "'cos'", "'tan'", "'asin'", "'acos'", "'atan'", "'sinh'", "'cosh'", 
			"'tanh'", "'exp'", "'expt'", "'sqrt'", "'log'", "'conjugate'", "'abs'", 
			"'gcd'", "'lcm'", "'isqrt'", "'floor'", "'ceiling'", null, "'push'", 
			"'pop'", "'aref'", "'sort'", "'append'", "'reverse'", "'member'", "'subsetp'", 
			"'intersection'", "'union'", "'set-difference'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'~a'", "'~s'", "'~%'", 
			"'~&'", "'~d'", "'~f'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "CLOSE", "QUOTE", "WS", "COMMENT_START", "MULTILINE_COMMENT_START", 
			"STRING_START", "TRUE", "FALSE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"EQUAL", "LT", "GT", "LTE", "GTE", "AND", "OR", "NOT", "MIN", "MAX", 
			"INCF", "DECF", "LOGAND", "LOGIOR", "LOGXOR", "LOGNOR", "LOGEQV", "EVEN", 
			"COND", "IF", "WHEN", "UNLESS", "CASE", "OTHERWISE", "DOLIST", "DOTIMES", 
			"LOOP", "FOR", "DO_LOOP", "ERROR", "BLOCK", "FUNCALL", "APPLY", "MAPCAR", 
			"LAMBDA", "VECTOR", "CHARACTER", "STRING", "ARRAY", "MARCO", "SETQ", 
			"FUNCTION", "STRUCT", "PRINT", "DEFPARAM", "VARIABLE", "WRITE", "FORMAT", 
			"LET", "PROGN", "CONSTANT", "BOUNDP", "LIST", "CONS", "FIXNUM", "BIGNUM", 
			"RATION", "FLOAT", "COMPLEX", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", 
			"SINH", "COSH", "TANH", "EXP", "EXPT", "SQRT", "LOG", "CONJUGATE", "ABS", 
			"GCD", "LCM", "ISQRT", "FLOOR", "CEIL", "MODULO", "PUSH", "POP", "ARRAYREF", 
			"SORT", "APPEND", "REVERSE", "MEMBERS", "SUBSET", "INTERSECT", "UNION", 
			"DIFFERENT", "KEYWORD", "ID", "NUMBERDEF", "COMPLEXNUMBERDEF", "STRINGDEF", 
			"MULTILINE_COMMENT", "SINGLELINECOMMENT", "STRING_CONTENT", "STRING_END", 
			"FORMAT_STRING_BEGIN", "FORMAT_ARG", "FORMAT_END", "TILDE_A", "TILDE_S", 
			"TILDE_PERCENT", "TILDE_AMPERSAND", "TILDE_D", "TILDE_F", "FORMAT_STRING_CONTENT", 
			"FORMAT_STRING_END"
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
	public static class LispContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLisp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLisp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LispContext lisp() throws RecognitionException {
		LispContext _localctx = new LispContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lisp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				expression();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0) );
			setState(39);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public TerminalNode NUMBERDEF() { return getToken(LispParser.NUMBERDEF, 0); }
		public TerminalNode COMPLEXNUMBERDEF() { return getToken(LispParser.COMPLEXNUMBERDEF, 0); }
		public TerminalNode STRINGDEF() { return getToken(LispParser.STRINGDEF, 0); }
		public TerminalNode TRUE() { return getToken(LispParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LispParser.FALSE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				}
				break;
			case NUMBERDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(NUMBERDEF);
				}
				break;
			case COMPLEXNUMBERDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(COMPLEXNUMBERDEF);
				}
				break;
			case STRINGDEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(STRINGDEF);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(FALSE);
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public List_contentContext list_content() {
			return getRuleContext(List_contentContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
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
		enterRule(_localctx, 4, RULE_list);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(OPEN);
				setState(51);
				list_content();
				setState(52);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(OPEN);
				setState(55);
				match(CLOSE);
				}
				break;
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
	public static class List_contentContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public List_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterList_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitList_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitList_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_contentContext list_content() throws RecognitionException {
		List_contentContext _localctx = new List_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_content);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				arithmetic_expression();
				}
				break;
			case EQUAL:
			case LT:
			case GT:
			case LTE:
			case GTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				comparison_expression();
				}
				break;
			case COND:
			case IF:
			case WHEN:
			case CASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				conditional_expression();
				}
				break;
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				logical_expression();
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
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LispParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LispParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(LispParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(LispParser.DIVIDE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmetic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				expression();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0) );
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
	public static class Comparison_expressionContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(LispParser.EQUAL, 0); }
		public TerminalNode LTE() { return getToken(LispParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(LispParser.GTE, 0); }
		public TerminalNode LT() { return getToken(LispParser.LT, 0); }
		public TerminalNode GT() { return getToken(LispParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitComparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				expression();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0) );
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
	public static class Conditional_expressionContext extends ParserRuleContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public When_expressionContext when_expression() {
			return getRuleContext(When_expressionContext.class,0);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_expression);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				if_expression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				when_expression();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				cond_expression();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				case_expression();
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
	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LispParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			expression();
			setState(84);
			expression();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0)) {
				{
				setState(85);
				expression();
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
	public static class When_expressionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(LispParser.WHEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public When_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterWhen_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitWhen_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitWhen_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_expressionContext when_expression() throws RecognitionException {
		When_expressionContext _localctx = new When_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_when_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(WHEN);
			setState(89);
			expression();
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				expression();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0) );
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
	public static class Cond_expressionContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(LispParser.COND, 0); }
		public List<Cond_clauseContext> cond_clause() {
			return getRuleContexts(Cond_clauseContext.class);
		}
		public Cond_clauseContext cond_clause(int i) {
			return getRuleContext(Cond_clauseContext.class,i);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitCond_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitCond_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(COND);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(96);
				cond_clause();
				}
				}
				setState(101);
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
	public static class Cond_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
		public Cond_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterCond_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitCond_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitCond_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_clauseContext cond_clause() throws RecognitionException {
		Cond_clauseContext _localctx = new Cond_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OPEN);
			setState(103);
			expression();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0)) {
				{
				{
				setState(104);
				expression();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(CLOSE);
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
	public static class Case_expressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LispParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Default_clauseContext default_clause() {
			return getRuleContext(Default_clauseContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CASE);
			setState(113);
			expression();
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					case_clause();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(120);
				default_clause();
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
	public static class Case_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitCase_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitCase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(OPEN);
			setState(124);
			value_list();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0)) {
				{
				{
				setState(125);
				expression();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSE);
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
	public static class Value_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Nested_listContext> nested_list() {
			return getRuleContexts(Nested_listContext.class);
		}
		public Nested_listContext nested_list(int i) {
			return getRuleContext(Nested_listContext.class,i);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(133);
						expression();
						}
						break;
					case 2:
						{
						setState(134);
						nested_list();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Nested_listContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
		public Nested_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterNested_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitNested_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitNested_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_listContext nested_list() throws RecognitionException {
		Nested_listContext _localctx = new Nested_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nested_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(OPEN);
			setState(140);
			value_list();
			setState(141);
			match(CLOSE);
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
	public static class Default_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public TerminalNode OTHERWISE() { return getToken(LispParser.OTHERWISE, 0); }
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Default_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterDefault_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitDefault_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitDefault_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_clauseContext default_clause() throws RecognitionException {
		Default_clauseContext _localctx = new Default_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_default_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(OPEN);
			setState(144);
			match(OTHERWISE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0)) {
				{
				{
				setState(145);
				expression();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(CLOSE);
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LispParser.AND, 0); }
		public TerminalNode OR() { return getToken(LispParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(LispParser.NOT, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical_expression);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					expression();
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 770L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 15L) != 0) );
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(NOT);
				setState(160);
				expression();
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

	public static final String _serializedATN =
		"\u0004\u0001|\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b\u0000"+
		"\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003?\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b"+
		"\u0004\f\u0004D\u0001\u0005\u0001\u0005\u0004\u0005I\b\u0005\u000b\u0005"+
		"\f\u0005J\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"Q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"W\b\u0007\u0001\b\u0001\b\u0001\b\u0004\b\\\b\b\u000b\b\f\b]\u0001\t\u0001"+
		"\t\u0005\tb\b\t\n\t\f\te\t\t\u0001\n\u0001\n\u0001\n\u0005\nj\b\n\n\n"+
		"\f\nm\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"t\b\u000b\n\u000b\f\u000bw\t\u000b\u0001\u000b\u0003\u000bz\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u007f\b\f\n\f\f\f\u0082\t\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0004\r\u0088\b\r\u000b\r\f\r\u0089\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0093\b\u000f\n\u000f\f\u000f\u0096\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u009c\b\u0010\u000b\u0010\f\u0010"+
		"\u009d\u0001\u0010\u0001\u0010\u0003\u0010\u00a2\b\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0003\u0001\u0000\n\r\u0001\u0000\u000e"+
		"\u0012\u0001\u0000\u0013\u0014\u00ae\u0000#\u0001\u0000\u0000\u0000\u0002"+
		"0\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\fP\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010X\u0001"+
		"\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000"+
		"\u0000\u0016p\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a"+
		"\u0087\u0001\u0000\u0000\u0000\u001c\u008b\u0001\u0000\u0000\u0000\u001e"+
		"\u008f\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001\u0000\u0000\u0000)1\u0005"+
		"j\u0000\u0000*1\u0005k\u0000\u0000+1\u0005l\u0000\u0000,1\u0005m\u0000"+
		"\u0000-1\u0005\b\u0000\u0000.1\u0005\t\u0000\u0000/1\u0003\u0004\u0002"+
		"\u00000)\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000"+
		"\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000"+
		"\u000023\u0005\u0001\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u0002"+
		"\u0000\u000059\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u000079\u0005"+
		"\u0002\u0000\u000082\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9\u0005\u0001\u0000\u0000\u0000:?\u0003\b\u0004\u0000;?\u0003\n\u0005"+
		"\u0000<?\u0003\f\u0006\u0000=?\u0003 \u0010\u0000>:\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@B\u0007\u0000\u0000\u0000"+
		"AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\t\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0001\u0000\u0000GI\u0003\u0002\u0001\u0000HG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LQ\u0003\u000e"+
		"\u0007\u0000MQ\u0003\u0010\b\u0000NQ\u0003\u0012\t\u0000OQ\u0003\u0016"+
		"\u000b\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000"+
		"RS\u0005!\u0000\u0000ST\u0003\u0002\u0001\u0000TV\u0003\u0002\u0001\u0000"+
		"UW\u0003\u0002\u0001\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\"\u0000\u0000Y[\u0003\u0002"+
		"\u0001\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u0011\u0001\u0000\u0000\u0000_c\u0005 \u0000\u0000`b\u0003\u0014\n\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fg\u0005\u0001\u0000\u0000gk\u0003\u0002\u0001\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0002\u0000\u0000o\u0015"+
		"\u0001\u0000\u0000\u0000pq\u0005$\u0000\u0000qu\u0003\u0002\u0001\u0000"+
		"rt\u0003\u0018\f\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xz\u0003\u001e\u000f\u0000yx\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0017\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0001\u0000\u0000|\u0080\u0003\u001a\r\u0000}\u007f\u0003\u0002"+
		"\u0001\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u0002\u0000\u0000\u0084\u0019\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0003\u0002\u0001\u0000\u0086\u0088\u0003\u001c\u000e\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u001b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d\u008e"+
		"\u0005\u0002\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0001\u0000\u0000\u0090\u0094\u0005%\u0000\u0000\u0091\u0093\u0003"+
		"\u0002\u0001\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u001f\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0007\u0002\u0000\u0000\u009a\u009c\u0003"+
		"\u0002\u0001\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a2\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u0015\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1\u0099\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2!\u0001\u0000"+
		"\u0000\u0000\u0013%08>DJPV]ckuy\u0080\u0087\u0089\u0094\u009d\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}