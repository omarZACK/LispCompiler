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
	 * Enter a parse tree produced by {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void enterHashed_expression(LispParser.Hashed_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void exitHashed_expression(LispParser.Hashed_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 */
	void enterHashvector_expression(LispParser.Hashvector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 */
	void exitHashvector_expression(LispParser.Hashvector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiterals_expression(LispParser.Literals_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiterals_expression(LispParser.Literals_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expression(LispParser.Number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expression(LispParser.Number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 */
	void enterComplex_number_definetion(LispParser.Complex_number_definetionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 */
	void exitComplex_number_definetion(LispParser.Complex_number_definetionContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnless_expression(LispParser.Unless_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnless_expression(LispParser.Unless_expressionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LispParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(LispParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(LispParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void enterTypes_expression(LispParser.Types_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void exitTypes_expression(LispParser.Types_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(LispParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(LispParser.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(LispParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(LispParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 */
	void enterDolist_expr(LispParser.Dolist_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 */
	void exitDolist_expr(LispParser.Dolist_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 */
	void enterDotimes_expr(LispParser.Dotimes_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 */
	void exitDotimes_expr(LispParser.Dotimes_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expr(LispParser.Loop_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expr(LispParser.Loop_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void enterLoop_clause(LispParser.Loop_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void exitLoop_clause(LispParser.Loop_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void enterListForm(LispParser.ListFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void exitListForm(LispParser.ListFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 */
	void enterListForm_content(LispParser.ListForm_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 */
	void exitListForm_content(LispParser.ListForm_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn_expression(LispParser.Return_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn_expression(LispParser.Return_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expression(LispParser.Block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expression(LispParser.Block_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn_from_expression(LispParser.Return_from_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn_from_expression(LispParser.Return_from_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 */
	void enterError_handling_expression(LispParser.Error_handling_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 */
	void exitError_handling_expression(LispParser.Error_handling_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void enterError_expression(LispParser.Error_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void exitError_expression(LispParser.Error_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_define_function_expression(LispParser.Pre_define_function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_define_function_expression(LispParser.Pre_define_function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_function_expression(LispParser.Print_function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_function_expression(LispParser.Print_function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterWrite_function_expression(LispParser.Write_function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitWrite_function_expression(LispParser.Write_function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(LispParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(LispParser.Complex_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat_expression(LispParser.Float_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat_expression(LispParser.Float_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrigonometric_expression(LispParser.Trigonometric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrigonometric_expression(LispParser.Trigonometric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 */
	void enterHyperbolic_expression(LispParser.Hyperbolic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 */
	void exitHyperbolic_expression(LispParser.Hyperbolic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 */
	void enterGcd_expression(LispParser.Gcd_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 */
	void exitGcd_expression(LispParser.Gcd_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 */
	void enterLcm_expression(LispParser.Lcm_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 */
	void exitLcm_expression(LispParser.Lcm_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 */
	void enterFloor_expression(LispParser.Floor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 */
	void exitFloor_expression(LispParser.Floor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 */
	void enterCeil_expression(LispParser.Ceil_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 */
	void exitCeil_expression(LispParser.Ceil_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 */
	void enterModulo_expression(LispParser.Modulo_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 */
	void exitModulo_expression(LispParser.Modulo_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void enterFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void exitFormat_expression(LispParser.Format_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 */
	void enterFormat_string(LispParser.Format_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 */
	void exitFormat_string(LispParser.Format_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#string_format_argument}.
	 * @param ctx the parse tree
	 */
	void enterString_format_argument(LispParser.String_format_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#string_format_argument}.
	 * @param ctx the parse tree
	 */
	void exitString_format_argument(LispParser.String_format_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition_expression(LispParser.Variable_definition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition_expression(LispParser.Variable_definition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_definition_expression(LispParser.Constant_definition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_definition_expression(LispParser.Constant_definition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterParameter_definition_expression(LispParser.Parameter_definition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitParameter_definition_expression(LispParser.Parameter_definition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 */
	void enterList_structure_expression(LispParser.List_structure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 */
	void exitList_structure_expression(LispParser.List_structure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void enterVector_expression(LispParser.Vector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void exitVector_expression(LispParser.Vector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(LispParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(LispParser.Array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterArray_key_argument(LispParser.Array_key_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitArray_key_argument(LispParser.Array_key_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 */
	void enterCons_expression(LispParser.Cons_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 */
	void exitCons_expression(LispParser.Cons_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 */
	void enterSetq_expression(LispParser.Setq_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 */
	void exitSetq_expression(LispParser.Setq_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(LispParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterMacro_definition_expression(LispParser.Macro_definition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitMacro_definition_expression(LispParser.Macro_definition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterStructure_definition_expression(LispParser.Structure_definition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitStructure_definition_expression(LispParser.Structure_definition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 */
	void enterStructure_content(LispParser.Structure_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 */
	void exitStructure_content(LispParser.Structure_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(LispParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 */
	void enterDifference_expression(LispParser.Difference_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 */
	void exitDifference_expression(LispParser.Difference_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnion_expression(LispParser.Union_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnion_expression(LispParser.Union_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void enterMember_expression(LispParser.Member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void exitMember_expression(LispParser.Member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 */
	void enterSubset_expression(LispParser.Subset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 */
	void exitSubset_expression(LispParser.Subset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 */
	void enterIntersection_expression(LispParser.Intersection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 */
	void exitIntersection_expression(LispParser.Intersection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 */
	void enterAppend_expression(LispParser.Append_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 */
	void exitAppend_expression(LispParser.Append_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 */
	void enterReverse_expression(LispParser.Reverse_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 */
	void exitReverse_expression(LispParser.Reverse_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_function_expression(LispParser.Character_function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_function_expression(LispParser.Character_function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 */
	void enterSort_expression(LispParser.Sort_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 */
	void exitSort_expression(LispParser.Sort_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 */
	void enterHashcomparison(LispParser.HashcomparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 */
	void exitHashcomparison(LispParser.HashcomparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayref_expression(LispParser.Arrayref_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayref_expression(LispParser.Arrayref_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void enterPush_expression(LispParser.Push_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void exitPush_expression(LispParser.Push_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 */
	void enterPop_expression(LispParser.Pop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 */
	void exitPop_expression(LispParser.Pop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(LispParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(LispParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_function(LispParser.Function_call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_function(LispParser.Function_call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 */
	void enterApply_call_function(LispParser.Apply_call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 */
	void exitApply_call_function(LispParser.Apply_call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 */
	void enterMapcar_function(LispParser.Mapcar_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 */
	void exitMapcar_function(LispParser.Mapcar_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 */
	void enterProgn_expression(LispParser.Progn_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 */
	void exitProgn_expression(LispParser.Progn_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void enterLet_expression(LispParser.Let_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void exitLet_expression(LispParser.Let_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 */
	void enterLet_binding(LispParser.Let_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 */
	void exitLet_binding(LispParser.Let_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(LispParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(LispParser.Lambda_functionContext ctx);
}