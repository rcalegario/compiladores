// Generated from gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, IDENTIFIER=35, INTEGER_LITERAL=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "')'", "'+'", "'-'", "IDENTIFIER", "INTEGER_LITERAL"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(17); classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(T__28);
			setState(26); match(IDENTIFIER);
			setState(27); match(T__24);
			setState(28); match(T__5);
			setState(29); match(T__3);
			setState(30); match(T__25);
			setState(31); match(T__33);
			setState(32); match(T__17);
			setState(33); match(T__7);
			setState(34); match(T__9);
			setState(35); match(T__6);
			setState(36); match(IDENTIFIER);
			setState(37); match(T__2);
			setState(38); match(T__24);
			setState(39); statement();
			setState(40); match(T__20);
			setState(41); match(T__20);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__28);
			setState(44); match(IDENTIFIER);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(45); match(T__21);
				setState(46); match(IDENTIFIER);
				}
			}

			setState(49); match(T__24);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50); varDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(56); methodDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(T__20);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); type();
			setState(65); match(IDENTIFIER);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(T__5);
			setState(68); type();
			setState(69); match(IDENTIFIER);
			setState(70); match(T__17);
			setState(82);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(71); type();
				setState(72); match(IDENTIFIER);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(73); match(T__14);
					setState(74); type();
					setState(75); match(IDENTIFIER);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84); match(T__2);
			setState(85); match(T__24);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); varDeclaration();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__24) | (1L << T__19) | (1L << T__10) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(92); statement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(T__29);
			setState(99); expression(0);
			setState(100); match(T__26);
			setState(101); match(T__20);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(T__18);
				setState(104); match(T__9);
				setState(105); match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(T__24);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__24) | (1L << T__19) | (1L << T__10) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(112); statement();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118); match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(T__19);
				setState(120); match(T__17);
				setState(121); expression(0);
				setState(122); match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(T__27);
				setState(125); match(T__17);
				setState(126); expression(0);
				setState(127); match(T__2);
				setState(128); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); match(T__10);
				setState(131); match(T__17);
				setState(132); expression(0);
				setState(133); match(T__2);
				setState(134); match(T__26);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); match(IDENTIFIER);
				setState(137); match(T__22);
				setState(138); expression(0);
				setState(139); match(T__26);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141); match(IDENTIFIER);
				setState(142); match(T__9);
				setState(143); expression(0);
				setState(144); match(T__6);
				setState(145); match(T__22);
				setState(146); expression(0);
				setState(147); match(T__26);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(gramaticaParser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(152); match(T__4);
				setState(153); expression(2);
				}
				break;
			case 2:
				{
				setState(154); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(155); match(T__30);
				}
				break;
			case 4:
				{
				setState(156); match(T__13);
				}
				break;
			case 5:
				{
				setState(157); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(158); match(T__15);
				}
				break;
			case 7:
				{
				setState(159); match(T__31);
				setState(160); match(T__18);
				setState(161); match(T__9);
				setState(162); expression(0);
				setState(163); match(T__6);
				}
				break;
			case 8:
				{
				setState(165); match(T__31);
				setState(166); match(IDENTIFIER);
				setState(167); match(T__17);
				setState(168); match(T__2);
				}
				break;
			case 9:
				{
				setState(169); match(T__17);
				setState(170); expression(0);
				setState(171); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(176);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__16) | (1L << T__8) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(177); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(179); match(T__9);
						setState(180); expression(0);
						setState(181); match(T__6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(184); match(T__12);
						setState(185); match(T__32);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(187); match(T__12);
						setState(188); match(IDENTIFIER);
						setState(189); match(T__17);
						setState(198);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__30) | (1L << T__17) | (1L << T__15) | (1L << T__13) | (1L << T__4) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(190); expression(0);
							setState(195);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(191); match(T__14);
								setState(192); expression(0);
								}
								}
								setState(197);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(200); match(T__2);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\5\6"+
		"U\n\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\7\bt\n\b"+
		"\f\b\16\bw\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16"+
		"\t\u00c7\13\t\5\t\u00c9\n\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t\3\t"+
		"\2\3\20\n\2\4\6\b\n\f\16\20\2\3\6\2\r\r\24\24\34\34#$\u00e7\2\22\3\2\2"+
		"\2\4\33\3\2\2\2\6-\3\2\2\2\bB\3\2\2\2\nE\3\2\2\2\fo\3\2\2\2\16\u0097\3"+
		"\2\2\2\20\u00af\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32"+
		"\7\2\2\3\32\3\3\2\2\2\33\34\7\b\2\2\34\35\7%\2\2\35\36\7\f\2\2\36\37\7"+
		"\37\2\2\37 \7!\2\2 !\7\13\2\2!\"\7\3\2\2\"#\7\23\2\2#$\7\35\2\2$%\7\33"+
		"\2\2%&\7\36\2\2&\'\7%\2\2\'(\7\"\2\2()\7\f\2\2)*\5\16\b\2*+\7\20\2\2+"+
		",\7\20\2\2,\5\3\2\2\2-.\7\b\2\2.\61\7%\2\2/\60\7\17\2\2\60\62\7%\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7\f\2\2\64\66\5\b\5\2\65\64"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:"+
		"<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2"+
		"@A\7\20\2\2A\7\3\2\2\2BC\5\f\7\2CD\7%\2\2D\t\3\2\2\2EF\7\37\2\2FG\5\f"+
		"\7\2GH\7%\2\2HT\7\23\2\2IJ\5\f\7\2JQ\7%\2\2KL\7\26\2\2LM\5\f\7\2MN\7%"+
		"\2\2NP\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2TI\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\"\2\2W[\7\f\2\2XZ\5\b\5\2YX\3\2"+
		"\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\16\b\2_^"+
		"\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\7\2\2e"+
		"f\5\20\t\2fg\7\n\2\2gh\7\20\2\2h\13\3\2\2\2ij\7\22\2\2jk\7\33\2\2kp\7"+
		"\36\2\2lp\7\31\2\2mp\7\22\2\2np\7%\2\2oi\3\2\2\2ol\3\2\2\2om\3\2\2\2o"+
		"n\3\2\2\2p\r\3\2\2\2qu\7\f\2\2rt\5\16\b\2sr\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x\u0098\7\20\2\2yz\7\21\2\2z{\7\23\2\2"+
		"{|\5\20\t\2|}\7\"\2\2}\u0098\3\2\2\2~\177\7\t\2\2\177\u0080\7\23\2\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0082\7\"\2\2\u0082\u0083\5\16\b\2\u0083\u0098\3"+
		"\2\2\2\u0084\u0085\7\32\2\2\u0085\u0086\7\23\2\2\u0086\u0087\5\20\t\2"+
		"\u0087\u0088\7\"\2\2\u0088\u0089\7\n\2\2\u0089\u0098\3\2\2\2\u008a\u008b"+
		"\7%\2\2\u008b\u008c\7\16\2\2\u008c\u008d\5\20\t\2\u008d\u008e\7\n\2\2"+
		"\u008e\u0098\3\2\2\2\u008f\u0090\7%\2\2\u0090\u0091\7\33\2\2\u0091\u0092"+
		"\5\20\t\2\u0092\u0093\7\36\2\2\u0093\u0094\7\16\2\2\u0094\u0095\5\20\t"+
		"\2\u0095\u0096\7\n\2\2\u0096\u0098\3\2\2\2\u0097q\3\2\2\2\u0097y\3\2\2"+
		"\2\u0097~\3\2\2\2\u0097\u0084\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008f"+
		"\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\b\t\1\2\u009a\u009b\7 \2\2\u009b"+
		"\u00b0\5\20\t\4\u009c\u00b0\7&\2\2\u009d\u00b0\7\6\2\2\u009e\u00b0\7\27"+
		"\2\2\u009f\u00b0\7%\2\2\u00a0\u00b0\7\25\2\2\u00a1\u00a2\7\5\2\2\u00a2"+
		"\u00a3\7\22\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6"+
		"\7\36\2\2\u00a6\u00b0\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7%\2\2\u00a9"+
		"\u00aa\7\23\2\2\u00aa\u00b0\7\"\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00ad\5"+
		"\20\t\2\u00ad\u00ae\7\"\2\2\u00ae\u00b0\3\2\2\2\u00af\u0099\3\2\2\2\u00af"+
		"\u009c\3\2\2\2\u00af\u009d\3\2\2\2\u00af\u009e\3\2\2\2\u00af\u009f\3\2"+
		"\2\2\u00af\u00a0\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a7\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\u00cd\3\2\2\2\u00b1\u00b2\f\17\2\2\u00b2\u00b3\t"+
		"\2\2\2\u00b3\u00cc\5\20\t\20\u00b4\u00b5\f\16\2\2\u00b5\u00b6\7\33\2\2"+
		"\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\36\2\2\u00b8\u00cc\3\2\2\2\u00b9\u00ba"+
		"\f\r\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00cc\7\4\2\2\u00bc\u00bd\f\f\2\2"+
		"\u00bd\u00be\7\30\2\2\u00be\u00bf\7%\2\2\u00bf\u00c8\7\23\2\2\u00c0\u00c5"+
		"\5\20\t\2\u00c1\u00c2\7\26\2\2\u00c2\u00c4\5\20\t\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\7\"\2\2\u00cb\u00b1\3\2\2\2\u00cb\u00b4\3\2"+
		"\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\22\26\61\67=QT[aou\u0097\u00af\u00c5\u00c8\u00cb\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}