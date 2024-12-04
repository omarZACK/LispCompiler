// Generated from /home/omarwawy/IdeaProjects/Lisp/src/gen/LispParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void enterLisp(LispParser.LispContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void exitLisp(LispParser.LispContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LispParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LispParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterList_content(LispParser.List_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitList_content(LispParser.List_contentContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(LispParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(LispParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(LispParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(LispParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(LispParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(LispParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhen_expression(LispParser.When_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhen_expression(LispParser.When_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(LispParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(LispParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void enterCond_clause(LispParser.Cond_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void exitCond_clause(LispParser.Cond_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(LispParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(LispParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 */
	void enterNested_list(LispParser.Nested_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 */
	void exitNested_list(LispParser.Nested_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(LispParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(LispParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(LispParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(LispParser.Logical_expressionContext ctx);
}