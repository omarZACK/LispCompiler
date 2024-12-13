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
	 * Visit a parse tree produced by {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals_expression(LispParser.Literals_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_expression(LispParser.Unless_expressionContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(LispParser.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expression(LispParser.Loop_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDolist_expr(LispParser.Dolist_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotimes_expr(LispParser.Dotimes_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expr(LispParser.Loop_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_clause(LispParser.Loop_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListForm(LispParser.ListFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_expression(LispParser.Return_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_expression(LispParser.Block_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_from_expression(LispParser.Return_from_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_handling_expression(LispParser.Error_handling_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_expression(LispParser.Error_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_define_function_expression(LispParser.Pre_define_function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_function_expression(LispParser.Print_function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_function_expression(LispParser.Write_function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_function_expression(LispParser.Format_function_expressionContext ctx);
}