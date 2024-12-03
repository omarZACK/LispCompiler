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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, QUOTE=3, WS=4, COMMENT_START=5, MULTILINE_COMMENT_START=6, 
		STRING_START=7, TRUE=8, FALSE=9, PLUS=10, MINUS=11, MULTIPLY=12, DIVIDE=13, 
		EQUAL=14, LT=15, GT=16, LTE=17, GTE=18, AND=19, OR=20, NOT=21, MIN=22, 
		MAX=23, INCF=24, DECF=25, LOGAND=26, LOGIOR=27, LOGXOR=28, LOGNOR=29, 
		LOGEQV=30, EVEN=31, COND=32, IF=33, WHEN=34, UNLESS=35, CASE=36, DOLIST=37, 
		DOTIMES=38, LOOP=39, FOR=40, DO_LOOP=41, ERROR=42, BLOCK=43, FUNCALL=44, 
		APPLY=45, MAPCAR=46, LAMBDA=47, VECTOR=48, CHARACTER=49, STRING=50, ARRAY=51, 
		MARCO=52, SETQ=53, FUNCTION=54, STRUCT=55, PRINT=56, DEFPARAM=57, VARIABLE=58, 
		WRITE=59, FORMAT=60, LET=61, PROGN=62, CONSTANT=63, BOUNDP=64, LIST=65, 
		CONS=66, FIXNUM=67, BIGNUM=68, RATION=69, FLOAT=70, COMPLEX=71, SIN=72, 
		COS=73, TAN=74, ASIN=75, ACOS=76, ATAN=77, SINH=78, COSH=79, TANH=80, 
		EXP=81, EXPT=82, SQRT=83, LOG=84, CONJUGATE=85, ABS=86, GCD=87, LCM=88, 
		ISQRT=89, FLOOR=90, CEIL=91, MODULO=92, PUSH=93, POP=94, ARRAYREF=95, 
		SORT=96, APPEND=97, REVERSE=98, MEMBERS=99, SUBSET=100, INTERSECT=101, 
		UNION=102, DIFFERENT=103, KEYWORD=104, ID=105, INTEGERNUMBERDEF=106, FLOATNUMBERDEF=107, 
		SCIENCENUMBERDEF=108, NUMBERDEF=109, COMPLEXNUMBERDEF=110, STRINGDEF=111, 
		MULTILINE_COMMENT=112, SINGLELINECOMMENT=113, STRING_CONTENT=114, STRING_END=115, 
		FORMAT_STRING_BEGIN=116, FORMAT_ARG=117, FORMAT_END=118, TILDE_A=119, 
		TILDE_S=120, TILDE_PERCENT=121, TILDE_AMPERSAND=122, TILDE_D=123, TILDE_F=124, 
		FORMAT_STRING_CONTENT=125, FORMAT_STRING_END=126;
	public static final int
		RULE_expression = 0, RULE_arithmetic_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "arithmetic_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", null, "'''", null, "';'", "'#|'", null, "'t'", "'nil'", 
			"'+'", "'-'", "'*'", "'/'", null, "'<'", "'>'", "'<='", "'>='", "'and'", 
			"'or'", "'not'", "'min'", "'max'", "'incf'", "'decf'", "'logand'", "'logior'", 
			"'logxor'", "'lognor'", "'logeqv'", "'evenp'", "'cond'", "'if'", "'when'", 
			"'unless'", "'case'", "'dolist'", "'dotimes'", "'loop'", "'for'", "'do'", 
			"'error'", "'block'", "'funcall'", "'apply'", "'mapcar'", "'lambda'", 
			"'vector'", "'char'", "'string'", "'make-array'", "'defmacro'", "'setq'", 
			"'defun'", "'defstruct'", "'print'", "'defparameter'", "'defvar'", "'write'", 
			"'format'", "'let'", "'prog'", "'defconstant'", "'boundp'", "'list'", 
			"'cons'", "'fixnum'", "'bignum'", "'ratio'", "'float'", "'complex'", 
			"'sin'", "'cos'", "'tan'", "'asin'", "'acos'", "'atan'", "'sinh'", "'cosh'", 
			"'tanh'", "'exp'", "'expt'", "'sqrt'", "'log'", "'conjugate'", "'abs'", 
			"'gcd'", "'lcm'", "'isqrt'", "'floor'", "'ceiling'", null, "'push'", 
			"'pop'", "'aref'", "'sort'", "'append'", "'reverse'", "'member'", "'subsetp'", 
			"'intersection'", "'union'", "'set-difference'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'~a'", 
			"'~s'", "'~%'", "'~&'", "'~d'", "'~f'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "CLOSE", "QUOTE", "WS", "COMMENT_START", "MULTILINE_COMMENT_START", 
			"STRING_START", "TRUE", "FALSE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"EQUAL", "LT", "GT", "LTE", "GTE", "AND", "OR", "NOT", "MIN", "MAX", 
			"INCF", "DECF", "LOGAND", "LOGIOR", "LOGXOR", "LOGNOR", "LOGEQV", "EVEN", 
			"COND", "IF", "WHEN", "UNLESS", "CASE", "DOLIST", "DOTIMES", "LOOP", 
			"FOR", "DO_LOOP", "ERROR", "BLOCK", "FUNCALL", "APPLY", "MAPCAR", "LAMBDA", 
			"VECTOR", "CHARACTER", "STRING", "ARRAY", "MARCO", "SETQ", "FUNCTION", 
			"STRUCT", "PRINT", "DEFPARAM", "VARIABLE", "WRITE", "FORMAT", "LET", 
			"PROGN", "CONSTANT", "BOUNDP", "LIST", "CONS", "FIXNUM", "BIGNUM", "RATION", 
			"FLOAT", "COMPLEX", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", "SINH", 
			"COSH", "TANH", "EXP", "EXPT", "SQRT", "LOG", "CONJUGATE", "ABS", "GCD", 
			"LCM", "ISQRT", "FLOOR", "CEIL", "MODULO", "PUSH", "POP", "ARRAYREF", 
			"SORT", "APPEND", "REVERSE", "MEMBERS", "SUBSET", "INTERSECT", "UNION", 
			"DIFFERENT", "KEYWORD", "ID", "INTEGERNUMBERDEF", "FLOATNUMBERDEF", "SCIENCENUMBERDEF", 
			"NUMBERDEF", "COMPLEXNUMBERDEF", "STRINGDEF", "MULTILINE_COMMENT", "SINGLELINECOMMENT", 
			"STRING_CONTENT", "STRING_END", "FORMAT_STRING_BEGIN", "FORMAT_ARG", 
			"FORMAT_END", "TILDE_A", "TILDE_S", "TILDE_PERCENT", "TILDE_AMPERSAND", 
			"TILDE_D", "TILDE_F", "FORMAT_STRING_CONTENT", "FORMAT_STRING_END"
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public TerminalNode NUMBERDEF() { return getToken(LispParser.NUMBERDEF, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(NUMBERDEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(6);
				arithmetic_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(7);
				match(OPEN);
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(8);
					expression();
					}
					}
					setState(11); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPEN || _la==ID || _la==NUMBERDEF );
				setState(13);
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
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(LispParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(LispParser.CLOSE, 0); }
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
		enterRule(_localctx, 2, RULE_arithmetic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(OPEN);
			setState(18);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				expression();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN || _la==ID || _la==NUMBERDEF );
			setState(24);
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

	public static final String _serializedATN =
		"\u0004\u0001~\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0015\b\u0001"+
		"\u000b\u0001\f\u0001\u0016\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000"+
		"\u0002\u0000\u0002\u0000\u0001\u0001\u0000\n\r\u001d\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0010\u0005"+
		"i\u0000\u0000\u0005\u0010\u0005m\u0000\u0000\u0006\u0010\u0003\u0002\u0001"+
		"\u0000\u0007\t\u0005\u0001\u0000\u0000\b\n\u0003\u0000\u0000\u0000\t\b"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0005\u0002\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\u0004\u0001\u0000\u0000\u0000\u000f\u0005\u0001\u0000\u0000\u0000"+
		"\u000f\u0006\u0001\u0000\u0000\u0000\u000f\u0007\u0001\u0000\u0000\u0000"+
		"\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0001\u0000\u0000"+
		"\u0012\u0014\u0007\u0000\u0000\u0000\u0013\u0015\u0003\u0000\u0000\u0000"+
		"\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000"+
		"\u0019\u0003\u0001\u0000\u0000\u0000\u0003\u000b\u000f\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}