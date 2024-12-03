// Generated from /home/omarwawy/IdeaProjects/Lisp/src/gen/LispParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LispParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(LispParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(LispParser.Arithmetic_expressionContext ctx);
}