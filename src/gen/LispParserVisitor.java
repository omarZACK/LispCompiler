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
	 * Visit a parse tree produced by the {@code LISP_EXPRESSION}
	 * labeled alternative in {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_EXPRESSION(LispParser.LISP_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE(LispParser.VARIABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(LispParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING(LispParser.STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TRUE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRUE(LispParser.TRUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FALSE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFALSE(LispParser.FALSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LIST}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIST(LispParser.LISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NON_EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNON_EMPTYLIST(LispParser.NON_EMPTYLISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEMPTYLIST(LispParser.EMPTYLISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LITERALEXPRESSION}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLITERALEXPRESSION(LispParser.LITERALEXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_HASHED}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_HASHED(LispParser.LISP_HASHEDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_HASHVECTOR(LispParser.LISP_HASHVECTORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPLEXNUMBERDEFINITION}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPLEXNUMBERDEFINITION(LispParser.COMPLEXNUMBERDEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHASHVECTOR(LispParser.HASHVECTORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QUOTED_EXPRESSION}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQUOTED_EXPRESSION(LispParser.QUOTED_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISTFORM}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISTFORM(LispParser.LISTFORMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_ARITHMETIC}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_ARITHMETIC(LispParser.LISP_ARITHMETICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_COMPARISON}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_COMPARISON(LispParser.LISP_COMPARISONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_CONDITIONAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_CONDITIONAL(LispParser.LISP_CONDITIONALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_LOGICAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_LOGICAL(LispParser.LISP_LOGICALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_LOOPS}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_LOOPS(LispParser.LISP_LOOPSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_RETURN}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_RETURN(LispParser.LISP_RETURNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_RETURNFROM}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_RETURNFROM(LispParser.LISP_RETURNFROMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_BLOCK}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_BLOCK(LispParser.LISP_BLOCKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_ERRORHANDLING}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_ERRORHANDLING(LispParser.LISP_ERRORHANDLINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_PREDEFINEDFUNCTION}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_PREDEFINEDFUNCTION(LispParser.LISP_PREDEFINEDFUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_FUNCTIONCALL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_FUNCTIONCALL(LispParser.LISP_FUNCTIONCALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER_EXPRESSION}
	 * labeled alternative in {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER_EXPRESSION(LispParser.NUMBER_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HASHCOMPLEX_NUMBER_DEFINITION}
	 * labeled alternative in {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHASHCOMPLEX_NUMBER_DEFINITION(LispParser.HASHCOMPLEX_NUMBER_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBTRACTION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBTRACTION(LispParser.SUBTRACTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVIDION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVIDION(LispParser.DIVIDIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLICATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLICATION(LispParser.MULTIPLICATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDITION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDITION(LispParser.ADDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INCREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINCREMENT(LispParser.INCREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DECREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDECREMENT(LispParser.DECREMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPONENTIAL}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPONENTIAL(LispParser.EXPONENTIALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ABSOLUTE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitABSOLUTE(LispParser.ABSOLUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONJUGATE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONJUGATE(LispParser.CONJUGATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPONENTIATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPONENTIATION(LispParser.EXPONENTIATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGARITHM}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGARITHM(LispParser.LOGARITHMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQUARE_ROOT(LispParser.SQUARE_ROOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTEGER_SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTEGER_SQUARE_ROOT(LispParser.INTEGER_SQUARE_ROOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_EQUALITY(LispParser.NUMERIC_EQUALITYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_COMPARISON}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_COMPARISON(LispParser.NUMERIC_COMPARISONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GENERAL_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGENERAL_EQUALITY(LispParser.GENERAL_EQUALITYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_CONDITION(LispParser.IF_CONDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHEN_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHEN_CONDITION(LispParser.WHEN_CONDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COND_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOND_CONDITION(LispParser.COND_CONDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CASE_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCASE_CONDITION(LispParser.CASE_CONDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNLESS_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNLESS_CONDITION(LispParser.UNLESS_CONDITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_EXPRESSION}
	 * labeled alternative in {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_EXPRESSION(LispParser.IF_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHEN_EXPRESSION}
	 * labeled alternative in {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHEN_EXPRESSION(LispParser.WHEN_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNLESS_EXPRESSION}
	 * labeled alternative in {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNLESS_EXPRESSION(LispParser.UNLESS_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COND_EXPRESSION}
	 * labeled alternative in {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOND_EXPRESSION(LispParser.COND_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COND_CLAUSE}
	 * labeled alternative in {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOND_CLAUSE(LispParser.COND_CLAUSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CASE_EXPRESSION}
	 * labeled alternative in {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCASE_EXPRESSION(LispParser.CASE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CASE_CLAUSE}
	 * labeled alternative in {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCASE_CLAUSE(LispParser.CASE_CLAUSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VALUE_LIST}
	 * labeled alternative in {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVALUE_LIST(LispParser.VALUE_LISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NESTED_LIST}
	 * labeled alternative in {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNESTED_LIST(LispParser.NESTED_LISTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEFAULT_CLAUSE}
	 * labeled alternative in {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEFAULT_CLAUSE(LispParser.DEFAULT_CLAUSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_OPERATORS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_OPERATORS(LispParser.LOGICAL_OPERATORSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT_EXPRESSION}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT_EXPRESSION(LispParser.NOT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_OPERATIONS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_OPERATIONS(LispParser.LOGICAL_OPERATIONSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EVEN_ODD}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVEN_ODD(LispParser.EVEN_ODDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ZERO_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZERO_CHECK(LispParser.ZERO_CHECKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOUND_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOUND_CHECK(LispParser.BOUND_CHECKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPE_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPE_CHECK(LispParser.TYPE_CHECKContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(LispParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPE_EXPRESSION(LispParser.TYPE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOGICAL_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOGICAL_TYPE_EXPRESSION(LispParser.LOGICAL_TYPE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_ARITHMETIC}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_ARITHMETIC(LispParser.NUMERIC_ARITHMETICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_IDENTIFIER}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_IDENTIFIER(LispParser.NUMERIC_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_LITERAL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_LITERAL(LispParser.NUMERIC_LITERALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PI}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPI(LispParser.PIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERIC_FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERIC_FUNCTION_CALL(LispParser.NUMERIC_FUNCTION_CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOLIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOLIST_EXPRESSION(LispParser.DOLIST_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOTIMES_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOTIMES_EXPRESSION(LispParser.DOTIMES_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP_EXPRESSION(LispParser.LOOP_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOLIST_LOOP}
	 * labeled alternative in {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOLIST_LOOP(LispParser.DOLIST_LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOTIMES_LOOP}
	 * labeled alternative in {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOTIMES_LOOP(LispParser.DOTIMES_LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP_STATEMENT(LispParser.LOOP_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP_WITH_CLAUSES}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP_WITH_CLAUSES(LispParser.LOOP_WITH_CLAUSESContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOR_LOOP_IN}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOR_LOOP_IN(LispParser.FOR_LOOP_INContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOR_LOOP_RANGE}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOR_LOOP_RANGE(LispParser.FOR_LOOP_RANGEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LIST_FORM_ID}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIST_FORM_ID(LispParser.LIST_FORM_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LIST_FORM_EXPRESSION}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIST_FORM_EXPRESSION(LispParser.LIST_FORM_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LIST_FORM_CONTENT}
	 * labeled alternative in {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIST_FORM_CONTENT(LispParser.LIST_FORM_CONTENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURN_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURN_EXPRESSION(LispParser.RETURN_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BLOCK_EXPRESSION}
	 * labeled alternative in {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBLOCK_EXPRESSION(LispParser.BLOCK_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURN_FROM_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURN_FROM_EXPRESSION(LispParser.RETURN_FROM_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ERROR_EXPRESSION}
	 * labeled alternative in {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitERROR_EXPRESSION(LispParser.ERROR_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ERROR_HANDLING}
	 * labeled alternative in {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitERROR_HANDLING(LispParser.ERROR_HANDLINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_PRINT_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_PRINT_FUNCTION(LispParser.LISP_PRINT_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_WRITE_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_WRITE_FUNCTION(LispParser.LISP_WRITE_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_COMPLEX}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_COMPLEX(LispParser.LISP_COMPLEXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_FLOAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_FLOAT(LispParser.LISP_FLOATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_TRIGONOMETRIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_TRIGONOMETRIC(LispParser.LISP_TRIGONOMETRICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_HYPERBOLIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_HYPERBOLIC(LispParser.LISP_HYPERBOLICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_LCM}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_LCM(LispParser.LISP_LCMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_GCD}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_GCD(LispParser.LISP_GCDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_CEIL}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_CEIL(LispParser.LISP_CEILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_FLOOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_FLOOR(LispParser.LISP_FLOORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_MODULO}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_MODULO(LispParser.LISP_MODULOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_FORMAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_FORMAT(LispParser.LISP_FORMATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_VARIABLE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_VARIABLE_DEFINITION(LispParser.LISP_VARIABLE_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_CONSTANT_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_CONSTANT_DEFINITION(LispParser.LISP_CONSTANT_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_PARAMETER_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_PARAMETER_DEFINITION(LispParser.LISP_PARAMETER_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_LIST_STRUCTURE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_LIST_STRUCTURE(LispParser.LISP_LIST_STRUCTUREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_VECTOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_VECTOR(LispParser.LISP_VECTORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_ARRAY}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_ARRAY(LispParser.LISP_ARRAYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_CONS}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_CONS(LispParser.LISP_CONSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_SETQ}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_SETQ(LispParser.LISP_SETQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_FUNCTION_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_FUNCTION_DEFINITION(LispParser.LISP_FUNCTION_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_MACRO_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_MACRO_DEFINITION(LispParser.LISP_MACRO_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_STRUCTURE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_STRUCTURE_DEFINITION(LispParser.LISP_STRUCTURE_DEFINITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_REVERSE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_REVERSE(LispParser.LISP_REVERSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_APPEND}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_APPEND(LispParser.LISP_APPENDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_INTERSECTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_INTERSECTION(LispParser.LISP_INTERSECTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_SUBSET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_SUBSET(LispParser.LISP_SUBSETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_MEMBER}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_MEMBER(LispParser.LISP_MEMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_UNION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_UNION(LispParser.LISP_UNIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_DIFFERENCE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_DIFFERENCE(LispParser.LISP_DIFFERENCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_CHARACTER_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_CHARACTER_FUNCTION(LispParser.LISP_CHARACTER_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_SORT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_SORT(LispParser.LISP_SORTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_ARRAY_REF}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_ARRAY_REF(LispParser.LISP_ARRAY_REFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_POP}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_POP(LispParser.LISP_POPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_PUSH}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_PUSH(LispParser.LISP_PUSHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_PROGN}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_PROGN(LispParser.LISP_PROGNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LISP_LET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLISP_LET(LispParser.LISP_LETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINT_FUNCTION_EXPRESSION(LispParser.PRINT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WRITE_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWRITE_FUNCTION_EXPRESSION(LispParser.WRITE_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPLEX_EXPRESSION}
	 * labeled alternative in {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPLEX_EXPRESSION(LispParser.COMPLEX_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLOAT_EXPRESSION}
	 * labeled alternative in {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLOAT_EXPRESSION(LispParser.FLOAT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TRIGONOMETRIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRIGONOMETRIC_FUNCTION_EXPRESSION(LispParser.TRIGONOMETRIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARCTANGENT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARCTANGENT_FUNCTION_EXPRESSION(LispParser.ARCTANGENT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HYPERBOLIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHYPERBOLIC_FUNCTION_EXPRESSION(LispParser.HYPERBOLIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GCD_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGCD_FUNCTION_EXPRESSION(LispParser.GCD_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LCM_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLCM_FUNCTION_EXPRESSION(LispParser.LCM_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLOOR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLOOR_FUNCTION_EXPRESSION(LispParser.FLOOR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CEIL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCEIL_FUNCTION_EXPRESSION(LispParser.CEIL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MODULO_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMODULO_FUNCTION_EXPRESSION(LispParser.MODULO_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMAT_STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMAT_STRING_EXPRESSION(LispParser.FORMAT_STRING_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMAT_STRING}
	 * labeled alternative in {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMAT_STRING(LispParser.FORMAT_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string_format_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_format_argument(LispParser.String_format_argumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE_DEFINITION_EXPRESSION(LispParser.VARIABLE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTANT_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTANT_DEFINITION_EXPRESSION(LispParser.CONSTANT_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARAMETER_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARAMETER_DEFINITION_EXPRESSION(LispParser.PARAMETER_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LIST_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLIST_STRUCTURE_EXPRESSION(LispParser.LIST_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VECTOR_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVECTOR_STRUCTURE_EXPRESSION(LispParser.VECTOR_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_EXPRESSION(LispParser.ARRAY_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_ELEMENT_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_ELEMENT_TYPE_EXPRESSION(LispParser.ARRAY_ELEMENT_TYPE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_INITIAL_ELEMENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_INITIAL_ELEMENT_EXPRESSION(LispParser.ARRAY_INITIAL_ELEMENT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_INITIAL_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_INITIAL_CONTENT_EXPRESSION(LispParser.ARRAY_INITIAL_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADJUSTABLE_ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADJUSTABLE_ARRAY_EXPRESSION(LispParser.ADJUSTABLE_ARRAY_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FILL_POINTER_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFILL_POINTER_EXPRESSION(LispParser.FILL_POINTER_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONS_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONS_EXPRESSION_EXPRESSION(LispParser.CONS_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SETQ_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSETQ_EXPRESSION_EXPRESSION(LispParser.SETQ_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_DEFINITION_EXPRESSION(LispParser.FUNCTION_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MACRO_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMACRO_DEFINITION_EXPRESSION(LispParser.MACRO_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRUCTURE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRUCTURE_DEFINITION_EXPRESSION(LispParser.STRUCTURE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRUCTURE_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRUCTURE_CONTENT_EXPRESSION(LispParser.STRUCTURE_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARAMETER_LIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARAMETER_LIST_EXPRESSION(LispParser.PARAMETER_LIST_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIFFERENCE_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIFFERENCE_EXPRESSION_EXPRESSION(LispParser.DIFFERENCE_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNION_EXPRESSION_EXPRESSION(LispParser.UNION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MEMBER_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMEMBER_EXPRESSION_EXPRESSION(LispParser.MEMBER_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBSET_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBSET_EXPRESSION_EXPRESSION(LispParser.SUBSET_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTERSECTION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTERSECTION_EXPRESSION_EXPRESSION(LispParser.INTERSECTION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APPEND_EXPRESSION}
	 * labeled alternative in {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPPEND_EXPRESSION(LispParser.APPEND_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code REVERSE_EXPRESSION}
	 * labeled alternative in {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitREVERSE_EXPRESSION(LispParser.REVERSE_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHARACTER_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHARACTER_FUNCTION_EXPRESSION(LispParser.CHARACTER_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SORT_EXPRESSION}
	 * labeled alternative in {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSORT_EXPRESSION(LispParser.SORT_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HASH_COMPARISON}
	 * labeled alternative in {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHASH_COMPARISON(LispParser.HASH_COMPARISONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_REF_EXPRESSION}
	 * labeled alternative in {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_REF_EXPRESSION(LispParser.ARRAY_REF_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PUSH_EXPRESSION}
	 * labeled alternative in {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPUSH_EXPRESSION(LispParser.PUSH_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POP_EXPRESSION}
	 * labeled alternative in {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOP_EXPRESSION(LispParser.POP_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL(LispParser.FUNCTION_CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL_FUNCTION(LispParser.FUNCTION_CALL_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APPLY_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPPLY_CALL_FUNCTION(LispParser.APPLY_CALL_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MAPCAR_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMAPCAR_FUNCTION(LispParser.MAPCAR_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LAMBDA_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAMBDA_FUNCTION(LispParser.LAMBDA_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL_EXPRESSION(LispParser.FUNCTION_CALL_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL_FUNCTION_EXPRESSION(LispParser.FUNCTION_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APPLY_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPPLY_CALL_FUNCTION_EXPRESSION(LispParser.APPLY_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MAPCAR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMAPCAR_FUNCTION_EXPRESSION(LispParser.MAPCAR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROGN_EXPRESSION}
	 * labeled alternative in {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROGN_EXPRESSION(LispParser.PROGN_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LET_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLET_EXPRESSION(LispParser.LET_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LET_BINDING_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLET_BINDING_EXPRESSION(LispParser.LET_BINDING_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LAMBDA_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAMBDA_FUNCTION_EXPRESSION(LispParser.LAMBDA_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING_EXPRESSION(LispParser.STRING_EXPRESSIONContext ctx);
}