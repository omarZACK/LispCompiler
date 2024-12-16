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
	 * Visit a parse tree produced by {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashed_expression(LispParser.Hashed_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashvector_expression(LispParser.Hashvector_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expression(LispParser.Number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_number_definetion(LispParser.Complex_number_definetionContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(LispParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes_expression(LispParser.Types_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListForm_content(LispParser.ListForm_contentContext ctx);
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
	 * Visit a parse tree produced by {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_expression(LispParser.Complex_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_expression(LispParser.Float_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigonometric_expression(LispParser.Trigonometric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyperbolic_expression(LispParser.Hyperbolic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcd_expression(LispParser.Gcd_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcm_expression(LispParser.Lcm_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloor_expression(LispParser.Floor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeil_expression(LispParser.Ceil_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo_expression(LispParser.Modulo_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_string(LispParser.Format_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string_format_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_format_argument(LispParser.String_format_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition_expression(LispParser.Variable_definition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_definition_expression(LispParser.Constant_definition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_definition_expression(LispParser.Parameter_definition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_structure_expression(LispParser.List_structure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expression(LispParser.Vector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(LispParser.Array_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_key_argument(LispParser.Array_key_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_expression(LispParser.Cons_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetq_expression(LispParser.Setq_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_definition_expression(LispParser.Macro_definition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_definition_expression(LispParser.Structure_definition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_content(LispParser.Structure_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference_expression(LispParser.Difference_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_expression(LispParser.Union_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_expression(LispParser.Member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubset_expression(LispParser.Subset_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection_expression(LispParser.Intersection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_expression(LispParser.Append_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse_expression(LispParser.Reverse_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_function_expression(LispParser.Character_function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_expression(LispParser.Sort_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashcomparison(LispParser.HashcomparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayref_expression(LispParser.Arrayref_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_expression(LispParser.Push_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop_expression(LispParser.Pop_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(LispParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_function(LispParser.Function_call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply_call_function(LispParser.Apply_call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapcar_function(LispParser.Mapcar_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgn_expression(LispParser.Progn_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_expression(LispParser.Let_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_binding(LispParser.Let_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(LispParser.Lambda_functionContext ctx);
}