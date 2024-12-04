// Generated from /home/omarwawy/IdeaProjects/Lisp/src/gen/LispParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisp(LispParser.LispContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LispParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_content(LispParser.List_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(LispParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(LispParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(LispParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(LispParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_expression(LispParser.When_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expression(LispParser.Cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_clause(LispParser.Cond_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(LispParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(LispParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(LispParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_list(LispParser.Nested_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(LispParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(LispParser.Logical_expressionContext ctx);
}