// Generated from /home/omarwawy/IdeaProjects/Lisp/src/gen/LispParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code LISP_EXPRESSION}
	 * labeled alternative in {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void enterLISP_EXPRESSION(LispParser.LISP_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_EXPRESSION}
	 * labeled alternative in {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void exitLISP_EXPRESSION(LispParser.LISP_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE(LispParser.VARIABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE(LispParser.VARIABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(LispParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(LispParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(LispParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(LispParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRUE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTRUE(LispParser.TRUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRUE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTRUE(LispParser.TRUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FALSE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFALSE(LispParser.FALSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FALSE}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFALSE(LispParser.FALSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIST}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLIST(LispParser.LISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIST}
	 * labeled alternative in {@link LispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLIST(LispParser.LISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NON_EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterNON_EMPTYLIST(LispParser.NON_EMPTYLISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NON_EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitNON_EMPTYLIST(LispParser.NON_EMPTYLISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterEMPTYLIST(LispParser.EMPTYLISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EMPTYLIST}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitEMPTYLIST(LispParser.EMPTYLISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITERALEXPRESSION}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterLITERALEXPRESSION(LispParser.LITERALEXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITERALEXPRESSION}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitLITERALEXPRESSION(LispParser.LITERALEXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_HASHED}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void enterLISP_HASHED(LispParser.LISP_HASHEDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_HASHED}
	 * labeled alternative in {@link LispParser#list}.
	 * @param ctx the parse tree
	 */
	void exitLISP_HASHED(LispParser.LISP_HASHEDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_HASHVECTOR(LispParser.LISP_HASHVECTORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_HASHVECTOR(LispParser.LISP_HASHVECTORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPLEXNUMBERDEFINITION}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPLEXNUMBERDEFINITION(LispParser.COMPLEXNUMBERDEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPLEXNUMBERDEFINITION}
	 * labeled alternative in {@link LispParser#hashed_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPLEXNUMBERDEFINITION(LispParser.COMPLEXNUMBERDEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 */
	void enterHASHVECTOR(LispParser.HASHVECTORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HASHVECTOR}
	 * labeled alternative in {@link LispParser#hashvector_expression}.
	 * @param ctx the parse tree
	 */
	void exitHASHVECTOR(LispParser.HASHVECTORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QUOTED_EXPRESSION}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void enterQUOTED_EXPRESSION(LispParser.QUOTED_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QUOTED_EXPRESSION}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void exitQUOTED_EXPRESSION(LispParser.QUOTED_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISTFORM}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISTFORM(LispParser.LISTFORMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISTFORM}
	 * labeled alternative in {@link LispParser#literals_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISTFORM(LispParser.LISTFORMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_ARITHMETIC}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_ARITHMETIC(LispParser.LISP_ARITHMETICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_ARITHMETIC}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_ARITHMETIC(LispParser.LISP_ARITHMETICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_COMPARISON}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_COMPARISON(LispParser.LISP_COMPARISONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_COMPARISON}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_COMPARISON(LispParser.LISP_COMPARISONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_CONDITIONAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_CONDITIONAL(LispParser.LISP_CONDITIONALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_CONDITIONAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_CONDITIONAL(LispParser.LISP_CONDITIONALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_LOGICAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_LOGICAL(LispParser.LISP_LOGICALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_LOGICAL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_LOGICAL(LispParser.LISP_LOGICALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_LOOPS}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_LOOPS(LispParser.LISP_LOOPSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_LOOPS}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_LOOPS(LispParser.LISP_LOOPSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_RETURN}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_RETURN(LispParser.LISP_RETURNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_RETURN}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_RETURN(LispParser.LISP_RETURNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_RETURNFROM}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_RETURNFROM(LispParser.LISP_RETURNFROMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_RETURNFROM}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_RETURNFROM(LispParser.LISP_RETURNFROMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_BLOCK}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_BLOCK(LispParser.LISP_BLOCKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_BLOCK}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_BLOCK(LispParser.LISP_BLOCKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_ERRORHANDLING}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_ERRORHANDLING(LispParser.LISP_ERRORHANDLINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_ERRORHANDLING}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_ERRORHANDLING(LispParser.LISP_ERRORHANDLINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_PREDEFINEDFUNCTION}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_PREDEFINEDFUNCTION(LispParser.LISP_PREDEFINEDFUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_PREDEFINEDFUNCTION}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_PREDEFINEDFUNCTION(LispParser.LISP_PREDEFINEDFUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_FUNCTIONCALL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void enterLISP_FUNCTIONCALL(LispParser.LISP_FUNCTIONCALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_FUNCTIONCALL}
	 * labeled alternative in {@link LispParser#list_content}.
	 * @param ctx the parse tree
	 */
	void exitLISP_FUNCTIONCALL(LispParser.LISP_FUNCTIONCALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER_EXPRESSION}
	 * labeled alternative in {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER_EXPRESSION(LispParser.NUMBER_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER_EXPRESSION}
	 * labeled alternative in {@link LispParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER_EXPRESSION(LispParser.NUMBER_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HASHCOMPLEX_NUMBER_DEFINITION}
	 * labeled alternative in {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 */
	void enterHASHCOMPLEX_NUMBER_DEFINITION(LispParser.HASHCOMPLEX_NUMBER_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HASHCOMPLEX_NUMBER_DEFINITION}
	 * labeled alternative in {@link LispParser#complex_number_definetion}.
	 * @param ctx the parse tree
	 */
	void exitHASHCOMPLEX_NUMBER_DEFINITION(LispParser.HASHCOMPLEX_NUMBER_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBTRACTION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBTRACTION(LispParser.SUBTRACTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBTRACTION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBTRACTION(LispParser.SUBTRACTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVIDION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterDIVIDION(LispParser.DIVIDIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVIDION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitDIVIDION(LispParser.DIVIDIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTIPLICATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterMULTIPLICATION(LispParser.MULTIPLICATIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTIPLICATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitMULTIPLICATION(LispParser.MULTIPLICATIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDITION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterADDITION(LispParser.ADDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDITION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitADDITION(LispParser.ADDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INCREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterINCREMENT(LispParser.INCREMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INCREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitINCREMENT(LispParser.INCREMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterDECREMENT(LispParser.DECREMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECREMENT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitDECREMENT(LispParser.DECREMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPONENTIAL}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPONENTIAL(LispParser.EXPONENTIALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPONENTIAL}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPONENTIAL(LispParser.EXPONENTIALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ABSOLUTE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterABSOLUTE(LispParser.ABSOLUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ABSOLUTE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitABSOLUTE(LispParser.ABSOLUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONJUGATE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterCONJUGATE(LispParser.CONJUGATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONJUGATE}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitCONJUGATE(LispParser.CONJUGATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPONENTIATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPONENTIATION(LispParser.EXPONENTIATIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPONENTIATION}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPONENTIATION(LispParser.EXPONENTIATIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGARITHM}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOGARITHM(LispParser.LOGARITHMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGARITHM}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOGARITHM(LispParser.LOGARITHMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterSQUARE_ROOT(LispParser.SQUARE_ROOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitSQUARE_ROOT(LispParser.SQUARE_ROOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTEGER_SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterINTEGER_SQUARE_ROOT(LispParser.INTEGER_SQUARE_ROOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTEGER_SQUARE_ROOT}
	 * labeled alternative in {@link LispParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitINTEGER_SQUARE_ROOT(LispParser.INTEGER_SQUARE_ROOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_EQUALITY(LispParser.NUMERIC_EQUALITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_EQUALITY(LispParser.NUMERIC_EQUALITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_COMPARISON}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_COMPARISON(LispParser.NUMERIC_COMPARISONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_COMPARISON}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_COMPARISON(LispParser.NUMERIC_COMPARISONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GENERAL_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterGENERAL_EQUALITY(LispParser.GENERAL_EQUALITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GENERAL_EQUALITY}
	 * labeled alternative in {@link LispParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitGENERAL_EQUALITY(LispParser.GENERAL_EQUALITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterIF_CONDITION(LispParser.IF_CONDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitIF_CONDITION(LispParser.IF_CONDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHEN_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterWHEN_CONDITION(LispParser.WHEN_CONDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHEN_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitWHEN_CONDITION(LispParser.WHEN_CONDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COND_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOND_CONDITION(LispParser.COND_CONDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COND_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOND_CONDITION(LispParser.COND_CONDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CASE_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCASE_CONDITION(LispParser.CASE_CONDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CASE_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCASE_CONDITION(LispParser.CASE_CONDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNLESS_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterUNLESS_CONDITION(LispParser.UNLESS_CONDITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNLESS_CONDITION}
	 * labeled alternative in {@link LispParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitUNLESS_CONDITION(LispParser.UNLESS_CONDITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_EXPRESSION}
	 * labeled alternative in {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIF_EXPRESSION(LispParser.IF_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_EXPRESSION}
	 * labeled alternative in {@link LispParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIF_EXPRESSION(LispParser.IF_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHEN_EXPRESSION}
	 * labeled alternative in {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 */
	void enterWHEN_EXPRESSION(LispParser.WHEN_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHEN_EXPRESSION}
	 * labeled alternative in {@link LispParser#when_expression}.
	 * @param ctx the parse tree
	 */
	void exitWHEN_EXPRESSION(LispParser.WHEN_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNLESS_EXPRESSION}
	 * labeled alternative in {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 */
	void enterUNLESS_EXPRESSION(LispParser.UNLESS_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNLESS_EXPRESSION}
	 * labeled alternative in {@link LispParser#unless_expression}.
	 * @param ctx the parse tree
	 */
	void exitUNLESS_EXPRESSION(LispParser.UNLESS_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COND_EXPRESSION}
	 * labeled alternative in {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOND_EXPRESSION(LispParser.COND_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COND_EXPRESSION}
	 * labeled alternative in {@link LispParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOND_EXPRESSION(LispParser.COND_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COND_CLAUSE}
	 * labeled alternative in {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void enterCOND_CLAUSE(LispParser.COND_CLAUSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COND_CLAUSE}
	 * labeled alternative in {@link LispParser#cond_clause}.
	 * @param ctx the parse tree
	 */
	void exitCOND_CLAUSE(LispParser.COND_CLAUSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CASE_EXPRESSION}
	 * labeled alternative in {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCASE_EXPRESSION(LispParser.CASE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CASE_EXPRESSION}
	 * labeled alternative in {@link LispParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCASE_EXPRESSION(LispParser.CASE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CASE_CLAUSE}
	 * labeled alternative in {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCASE_CLAUSE(LispParser.CASE_CLAUSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CASE_CLAUSE}
	 * labeled alternative in {@link LispParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCASE_CLAUSE(LispParser.CASE_CLAUSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VALUE_LIST}
	 * labeled alternative in {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterVALUE_LIST(LispParser.VALUE_LISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VALUE_LIST}
	 * labeled alternative in {@link LispParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitVALUE_LIST(LispParser.VALUE_LISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NESTED_LIST}
	 * labeled alternative in {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 */
	void enterNESTED_LIST(LispParser.NESTED_LISTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NESTED_LIST}
	 * labeled alternative in {@link LispParser#nested_list}.
	 * @param ctx the parse tree
	 */
	void exitNESTED_LIST(LispParser.NESTED_LISTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEFAULT_CLAUSE}
	 * labeled alternative in {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDEFAULT_CLAUSE(LispParser.DEFAULT_CLAUSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEFAULT_CLAUSE}
	 * labeled alternative in {@link LispParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDEFAULT_CLAUSE(LispParser.DEFAULT_CLAUSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_OPERATORS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_OPERATORS(LispParser.LOGICAL_OPERATORSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_OPERATORS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_OPERATORS(LispParser.LOGICAL_OPERATORSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT_EXPRESSION}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterNOT_EXPRESSION(LispParser.NOT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT_EXPRESSION}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitNOT_EXPRESSION(LispParser.NOT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_OPERATIONS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_OPERATIONS(LispParser.LOGICAL_OPERATIONSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_OPERATIONS}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_OPERATIONS(LispParser.LOGICAL_OPERATIONSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EVEN_ODD}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterEVEN_ODD(LispParser.EVEN_ODDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EVEN_ODD}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitEVEN_ODD(LispParser.EVEN_ODDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ZERO_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterZERO_CHECK(LispParser.ZERO_CHECKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ZERO_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitZERO_CHECK(LispParser.ZERO_CHECKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOUND_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterBOUND_CHECK(LispParser.BOUND_CHECKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOUND_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitBOUND_CHECK(LispParser.BOUND_CHECKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPE_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterTYPE_CHECK(LispParser.TYPE_CHECKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPE_CHECK}
	 * labeled alternative in {@link LispParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitTYPE_CHECK(LispParser.TYPE_CHECKContext ctx);
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
	 * Enter a parse tree produced by the {@code TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void enterTYPE_EXPRESSION(LispParser.TYPE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void exitTYPE_EXPRESSION(LispParser.TYPE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGICAL_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOGICAL_TYPE_EXPRESSION(LispParser.LOGICAL_TYPE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGICAL_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#types_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOGICAL_TYPE_EXPRESSION(LispParser.LOGICAL_TYPE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_ARITHMETIC}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_ARITHMETIC(LispParser.NUMERIC_ARITHMETICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_ARITHMETIC}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_ARITHMETIC(LispParser.NUMERIC_ARITHMETICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_IDENTIFIER}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_IDENTIFIER(LispParser.NUMERIC_IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_IDENTIFIER}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_IDENTIFIER(LispParser.NUMERIC_IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_LITERAL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_LITERAL(LispParser.NUMERIC_LITERALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_LITERAL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_LITERAL(LispParser.NUMERIC_LITERALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PI}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterPI(LispParser.PIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PI}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitPI(LispParser.PIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERIC_FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNUMERIC_FUNCTION_CALL(LispParser.NUMERIC_FUNCTION_CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERIC_FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNUMERIC_FUNCTION_CALL(LispParser.NUMERIC_FUNCTION_CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOLIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterDOLIST_EXPRESSION(LispParser.DOLIST_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOLIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitDOLIST_EXPRESSION(LispParser.DOLIST_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOTIMES_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterDOTIMES_EXPRESSION(LispParser.DOTIMES_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOTIMES_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitDOTIMES_EXPRESSION(LispParser.DOTIMES_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLOOP_EXPRESSION(LispParser.LOOP_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP_EXPRESSION}
	 * labeled alternative in {@link LispParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLOOP_EXPRESSION(LispParser.LOOP_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOLIST_LOOP}
	 * labeled alternative in {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 */
	void enterDOLIST_LOOP(LispParser.DOLIST_LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOLIST_LOOP}
	 * labeled alternative in {@link LispParser#dolist_expr}.
	 * @param ctx the parse tree
	 */
	void exitDOLIST_LOOP(LispParser.DOLIST_LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOTIMES_LOOP}
	 * labeled alternative in {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 */
	void enterDOTIMES_LOOP(LispParser.DOTIMES_LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOTIMES_LOOP}
	 * labeled alternative in {@link LispParser#dotimes_expr}.
	 * @param ctx the parse tree
	 */
	void exitDOTIMES_LOOP(LispParser.DOTIMES_LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void enterLOOP_STATEMENT(LispParser.LOOP_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void exitLOOP_STATEMENT(LispParser.LOOP_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP_WITH_CLAUSES}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void enterLOOP_WITH_CLAUSES(LispParser.LOOP_WITH_CLAUSESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP_WITH_CLAUSES}
	 * labeled alternative in {@link LispParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void exitLOOP_WITH_CLAUSES(LispParser.LOOP_WITH_CLAUSESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FOR_LOOP_IN}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void enterFOR_LOOP_IN(LispParser.FOR_LOOP_INContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FOR_LOOP_IN}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void exitFOR_LOOP_IN(LispParser.FOR_LOOP_INContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FOR_LOOP_RANGE}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void enterFOR_LOOP_RANGE(LispParser.FOR_LOOP_RANGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FOR_LOOP_RANGE}
	 * labeled alternative in {@link LispParser#loop_clause}.
	 * @param ctx the parse tree
	 */
	void exitFOR_LOOP_RANGE(LispParser.FOR_LOOP_RANGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIST_FORM_ID}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void enterLIST_FORM_ID(LispParser.LIST_FORM_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIST_FORM_ID}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void exitLIST_FORM_ID(LispParser.LIST_FORM_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIST_FORM_EXPRESSION}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void enterLIST_FORM_EXPRESSION(LispParser.LIST_FORM_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIST_FORM_EXPRESSION}
	 * labeled alternative in {@link LispParser#listForm}.
	 * @param ctx the parse tree
	 */
	void exitLIST_FORM_EXPRESSION(LispParser.LIST_FORM_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIST_FORM_CONTENT}
	 * labeled alternative in {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 */
	void enterLIST_FORM_CONTENT(LispParser.LIST_FORM_CONTENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIST_FORM_CONTENT}
	 * labeled alternative in {@link LispParser#listForm_content}.
	 * @param ctx the parse tree
	 */
	void exitLIST_FORM_CONTENT(LispParser.LIST_FORM_CONTENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURN_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterRETURN_EXPRESSION(LispParser.RETURN_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURN_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitRETURN_EXPRESSION(LispParser.RETURN_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BLOCK_EXPRESSION}
	 * labeled alternative in {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBLOCK_EXPRESSION(LispParser.BLOCK_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BLOCK_EXPRESSION}
	 * labeled alternative in {@link LispParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBLOCK_EXPRESSION(LispParser.BLOCK_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURN_FROM_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 */
	void enterRETURN_FROM_EXPRESSION(LispParser.RETURN_FROM_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURN_FROM_EXPRESSION}
	 * labeled alternative in {@link LispParser#return_from_expression}.
	 * @param ctx the parse tree
	 */
	void exitRETURN_FROM_EXPRESSION(LispParser.RETURN_FROM_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_EXPRESSION}
	 * labeled alternative in {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 */
	void enterERROR_EXPRESSION(LispParser.ERROR_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_EXPRESSION}
	 * labeled alternative in {@link LispParser#error_handling_expression}.
	 * @param ctx the parse tree
	 */
	void exitERROR_EXPRESSION(LispParser.ERROR_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_HANDLING}
	 * labeled alternative in {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void enterERROR_HANDLING(LispParser.ERROR_HANDLINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_HANDLING}
	 * labeled alternative in {@link LispParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void exitERROR_HANDLING(LispParser.ERROR_HANDLINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_PRINT_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_PRINT_FUNCTION(LispParser.LISP_PRINT_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_PRINT_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_PRINT_FUNCTION(LispParser.LISP_PRINT_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_WRITE_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_WRITE_FUNCTION(LispParser.LISP_WRITE_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_WRITE_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_WRITE_FUNCTION(LispParser.LISP_WRITE_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_COMPLEX}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_COMPLEX(LispParser.LISP_COMPLEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_COMPLEX}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_COMPLEX(LispParser.LISP_COMPLEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_FLOAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_FLOAT(LispParser.LISP_FLOATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_FLOAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_FLOAT(LispParser.LISP_FLOATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_TRIGONOMETRIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_TRIGONOMETRIC(LispParser.LISP_TRIGONOMETRICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_TRIGONOMETRIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_TRIGONOMETRIC(LispParser.LISP_TRIGONOMETRICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_HYPERBOLIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_HYPERBOLIC(LispParser.LISP_HYPERBOLICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_HYPERBOLIC}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_HYPERBOLIC(LispParser.LISP_HYPERBOLICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_LCM}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_LCM(LispParser.LISP_LCMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_LCM}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_LCM(LispParser.LISP_LCMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_GCD}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_GCD(LispParser.LISP_GCDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_GCD}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_GCD(LispParser.LISP_GCDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_CEIL}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_CEIL(LispParser.LISP_CEILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_CEIL}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_CEIL(LispParser.LISP_CEILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_FLOOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_FLOOR(LispParser.LISP_FLOORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_FLOOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_FLOOR(LispParser.LISP_FLOORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_MODULO}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_MODULO(LispParser.LISP_MODULOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_MODULO}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_MODULO(LispParser.LISP_MODULOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_FORMAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_FORMAT(LispParser.LISP_FORMATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_FORMAT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_FORMAT(LispParser.LISP_FORMATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_VARIABLE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_VARIABLE_DEFINITION(LispParser.LISP_VARIABLE_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_VARIABLE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_VARIABLE_DEFINITION(LispParser.LISP_VARIABLE_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_CONSTANT_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_CONSTANT_DEFINITION(LispParser.LISP_CONSTANT_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_CONSTANT_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_CONSTANT_DEFINITION(LispParser.LISP_CONSTANT_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_PARAMETER_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_PARAMETER_DEFINITION(LispParser.LISP_PARAMETER_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_PARAMETER_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_PARAMETER_DEFINITION(LispParser.LISP_PARAMETER_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_LIST_STRUCTURE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_LIST_STRUCTURE(LispParser.LISP_LIST_STRUCTUREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_LIST_STRUCTURE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_LIST_STRUCTURE(LispParser.LISP_LIST_STRUCTUREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_VECTOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_VECTOR(LispParser.LISP_VECTORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_VECTOR}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_VECTOR(LispParser.LISP_VECTORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_ARRAY}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_ARRAY(LispParser.LISP_ARRAYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_ARRAY}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_ARRAY(LispParser.LISP_ARRAYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_CONS}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_CONS(LispParser.LISP_CONSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_CONS}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_CONS(LispParser.LISP_CONSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_SETQ}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_SETQ(LispParser.LISP_SETQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_SETQ}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_SETQ(LispParser.LISP_SETQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_FUNCTION_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_FUNCTION_DEFINITION(LispParser.LISP_FUNCTION_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_FUNCTION_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_FUNCTION_DEFINITION(LispParser.LISP_FUNCTION_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_MACRO_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_MACRO_DEFINITION(LispParser.LISP_MACRO_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_MACRO_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_MACRO_DEFINITION(LispParser.LISP_MACRO_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_STRUCTURE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_STRUCTURE_DEFINITION(LispParser.LISP_STRUCTURE_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_STRUCTURE_DEFINITION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_STRUCTURE_DEFINITION(LispParser.LISP_STRUCTURE_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_REVERSE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_REVERSE(LispParser.LISP_REVERSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_REVERSE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_REVERSE(LispParser.LISP_REVERSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_APPEND}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_APPEND(LispParser.LISP_APPENDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_APPEND}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_APPEND(LispParser.LISP_APPENDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_INTERSECTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_INTERSECTION(LispParser.LISP_INTERSECTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_INTERSECTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_INTERSECTION(LispParser.LISP_INTERSECTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_SUBSET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_SUBSET(LispParser.LISP_SUBSETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_SUBSET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_SUBSET(LispParser.LISP_SUBSETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_MEMBER}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_MEMBER(LispParser.LISP_MEMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_MEMBER}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_MEMBER(LispParser.LISP_MEMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_UNION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_UNION(LispParser.LISP_UNIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_UNION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_UNION(LispParser.LISP_UNIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_DIFFERENCE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_DIFFERENCE(LispParser.LISP_DIFFERENCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_DIFFERENCE}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_DIFFERENCE(LispParser.LISP_DIFFERENCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_CHARACTER_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_CHARACTER_FUNCTION(LispParser.LISP_CHARACTER_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_CHARACTER_FUNCTION}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_CHARACTER_FUNCTION(LispParser.LISP_CHARACTER_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_SORT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_SORT(LispParser.LISP_SORTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_SORT}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_SORT(LispParser.LISP_SORTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_ARRAY_REF}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_ARRAY_REF(LispParser.LISP_ARRAY_REFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_ARRAY_REF}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_ARRAY_REF(LispParser.LISP_ARRAY_REFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_POP}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_POP(LispParser.LISP_POPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_POP}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_POP(LispParser.LISP_POPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_PUSH}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_PUSH(LispParser.LISP_PUSHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_PUSH}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_PUSH(LispParser.LISP_PUSHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_PROGN}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_PROGN(LispParser.LISP_PROGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_PROGN}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_PROGN(LispParser.LISP_PROGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LISP_LET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterLISP_LET(LispParser.LISP_LETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LISP_LET}
	 * labeled alternative in {@link LispParser#pre_define_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitLISP_LET(LispParser.LISP_LETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterPRINT_FUNCTION_EXPRESSION(LispParser.PRINT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#print_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitPRINT_FUNCTION_EXPRESSION(LispParser.PRINT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WRITE_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterWRITE_FUNCTION_EXPRESSION(LispParser.WRITE_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WRITE_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#write_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitWRITE_FUNCTION_EXPRESSION(LispParser.WRITE_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPLEX_EXPRESSION}
	 * labeled alternative in {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPLEX_EXPRESSION(LispParser.COMPLEX_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPLEX_EXPRESSION}
	 * labeled alternative in {@link LispParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPLEX_EXPRESSION(LispParser.COMPLEX_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOAT_EXPRESSION}
	 * labeled alternative in {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 */
	void enterFLOAT_EXPRESSION(LispParser.FLOAT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOAT_EXPRESSION}
	 * labeled alternative in {@link LispParser#float_expression}.
	 * @param ctx the parse tree
	 */
	void exitFLOAT_EXPRESSION(LispParser.FLOAT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRIGONOMETRIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void enterTRIGONOMETRIC_FUNCTION_EXPRESSION(LispParser.TRIGONOMETRIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRIGONOMETRIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void exitTRIGONOMETRIC_FUNCTION_EXPRESSION(LispParser.TRIGONOMETRIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARCTANGENT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void enterARCTANGENT_FUNCTION_EXPRESSION(LispParser.ARCTANGENT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARCTANGENT_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#trigonometric_expression}.
	 * @param ctx the parse tree
	 */
	void exitARCTANGENT_FUNCTION_EXPRESSION(LispParser.ARCTANGENT_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HYPERBOLIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 */
	void enterHYPERBOLIC_FUNCTION_EXPRESSION(LispParser.HYPERBOLIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HYPERBOLIC_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#hyperbolic_expression}.
	 * @param ctx the parse tree
	 */
	void exitHYPERBOLIC_FUNCTION_EXPRESSION(LispParser.HYPERBOLIC_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GCD_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 */
	void enterGCD_FUNCTION_EXPRESSION(LispParser.GCD_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GCD_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#gcd_expression}.
	 * @param ctx the parse tree
	 */
	void exitGCD_FUNCTION_EXPRESSION(LispParser.GCD_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LCM_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 */
	void enterLCM_FUNCTION_EXPRESSION(LispParser.LCM_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LCM_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lcm_expression}.
	 * @param ctx the parse tree
	 */
	void exitLCM_FUNCTION_EXPRESSION(LispParser.LCM_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOOR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 */
	void enterFLOOR_FUNCTION_EXPRESSION(LispParser.FLOOR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOOR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#floor_expression}.
	 * @param ctx the parse tree
	 */
	void exitFLOOR_FUNCTION_EXPRESSION(LispParser.FLOOR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CEIL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 */
	void enterCEIL_FUNCTION_EXPRESSION(LispParser.CEIL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CEIL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#ceil_expression}.
	 * @param ctx the parse tree
	 */
	void exitCEIL_FUNCTION_EXPRESSION(LispParser.CEIL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MODULO_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 */
	void enterMODULO_FUNCTION_EXPRESSION(LispParser.MODULO_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MODULO_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#modulo_expression}.
	 * @param ctx the parse tree
	 */
	void exitMODULO_FUNCTION_EXPRESSION(LispParser.MODULO_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMAT_STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void enterFORMAT_STRING_EXPRESSION(LispParser.FORMAT_STRING_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMAT_STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#format_expression}.
	 * @param ctx the parse tree
	 */
	void exitFORMAT_STRING_EXPRESSION(LispParser.FORMAT_STRING_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMAT_STRING}
	 * labeled alternative in {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 */
	void enterFORMAT_STRING(LispParser.FORMAT_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMAT_STRING}
	 * labeled alternative in {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 */
	void exitFORMAT_STRING(LispParser.FORMAT_STRINGContext ctx);
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
	 * Enter a parse tree produced by the {@code VARIABLE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE_DEFINITION_EXPRESSION(LispParser.VARIABLE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#variable_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE_DEFINITION_EXPRESSION(LispParser.VARIABLE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTANT_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterCONSTANT_DEFINITION_EXPRESSION(LispParser.CONSTANT_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTANT_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#constant_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitCONSTANT_DEFINITION_EXPRESSION(LispParser.CONSTANT_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARAMETER_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterPARAMETER_DEFINITION_EXPRESSION(LispParser.PARAMETER_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARAMETER_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitPARAMETER_DEFINITION_EXPRESSION(LispParser.PARAMETER_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LIST_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 */
	void enterLIST_STRUCTURE_EXPRESSION(LispParser.LIST_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LIST_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#list_structure_expression}.
	 * @param ctx the parse tree
	 */
	void exitLIST_STRUCTURE_EXPRESSION(LispParser.LIST_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VECTOR_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void enterVECTOR_STRUCTURE_EXPRESSION(LispParser.VECTOR_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VECTOR_STRUCTURE_EXPRESSION}
	 * labeled alternative in {@link LispParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void exitVECTOR_STRUCTURE_EXPRESSION(LispParser.VECTOR_STRUCTURE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_EXPRESSION(LispParser.ARRAY_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_EXPRESSION(LispParser.ARRAY_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_ELEMENT_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_ELEMENT_TYPE_EXPRESSION(LispParser.ARRAY_ELEMENT_TYPE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_ELEMENT_TYPE_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_ELEMENT_TYPE_EXPRESSION(LispParser.ARRAY_ELEMENT_TYPE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_INITIAL_ELEMENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_INITIAL_ELEMENT_EXPRESSION(LispParser.ARRAY_INITIAL_ELEMENT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_INITIAL_ELEMENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_INITIAL_ELEMENT_EXPRESSION(LispParser.ARRAY_INITIAL_ELEMENT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_INITIAL_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_INITIAL_CONTENT_EXPRESSION(LispParser.ARRAY_INITIAL_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_INITIAL_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_INITIAL_CONTENT_EXPRESSION(LispParser.ARRAY_INITIAL_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADJUSTABLE_ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterADJUSTABLE_ARRAY_EXPRESSION(LispParser.ADJUSTABLE_ARRAY_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADJUSTABLE_ARRAY_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitADJUSTABLE_ARRAY_EXPRESSION(LispParser.ADJUSTABLE_ARRAY_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILL_POINTER_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void enterFILL_POINTER_EXPRESSION(LispParser.FILL_POINTER_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILL_POINTER_EXPRESSION}
	 * labeled alternative in {@link LispParser#array_key_argument}.
	 * @param ctx the parse tree
	 */
	void exitFILL_POINTER_EXPRESSION(LispParser.FILL_POINTER_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONS_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 */
	void enterCONS_EXPRESSION_EXPRESSION(LispParser.CONS_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONS_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#cons_expression}.
	 * @param ctx the parse tree
	 */
	void exitCONS_EXPRESSION_EXPRESSION(LispParser.CONS_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SETQ_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 */
	void enterSETQ_EXPRESSION_EXPRESSION(LispParser.SETQ_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SETQ_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#setq_expression}.
	 * @param ctx the parse tree
	 */
	void exitSETQ_EXPRESSION_EXPRESSION(LispParser.SETQ_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_DEFINITION_EXPRESSION(LispParser.FUNCTION_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_DEFINITION_EXPRESSION(LispParser.FUNCTION_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MACRO_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterMACRO_DEFINITION_EXPRESSION(LispParser.MACRO_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MACRO_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#macro_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitMACRO_DEFINITION_EXPRESSION(LispParser.MACRO_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRUCTURE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 */
	void enterSTRUCTURE_DEFINITION_EXPRESSION(LispParser.STRUCTURE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRUCTURE_DEFINITION_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_definition_expression}.
	 * @param ctx the parse tree
	 */
	void exitSTRUCTURE_DEFINITION_EXPRESSION(LispParser.STRUCTURE_DEFINITION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRUCTURE_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 */
	void enterSTRUCTURE_CONTENT_EXPRESSION(LispParser.STRUCTURE_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRUCTURE_CONTENT_EXPRESSION}
	 * labeled alternative in {@link LispParser#structure_content}.
	 * @param ctx the parse tree
	 */
	void exitSTRUCTURE_CONTENT_EXPRESSION(LispParser.STRUCTURE_CONTENT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARAMETER_LIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterPARAMETER_LIST_EXPRESSION(LispParser.PARAMETER_LIST_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARAMETER_LIST_EXPRESSION}
	 * labeled alternative in {@link LispParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitPARAMETER_LIST_EXPRESSION(LispParser.PARAMETER_LIST_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIFFERENCE_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 */
	void enterDIFFERENCE_EXPRESSION_EXPRESSION(LispParser.DIFFERENCE_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIFFERENCE_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#difference_expression}.
	 * @param ctx the parse tree
	 */
	void exitDIFFERENCE_EXPRESSION_EXPRESSION(LispParser.DIFFERENCE_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void enterUNION_EXPRESSION_EXPRESSION(LispParser.UNION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#union_expression}.
	 * @param ctx the parse tree
	 */
	void exitUNION_EXPRESSION_EXPRESSION(LispParser.UNION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MEMBER_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void enterMEMBER_EXPRESSION_EXPRESSION(LispParser.MEMBER_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MEMBER_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void exitMEMBER_EXPRESSION_EXPRESSION(LispParser.MEMBER_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBSET_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 */
	void enterSUBSET_EXPRESSION_EXPRESSION(LispParser.SUBSET_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBSET_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#subset_expression}.
	 * @param ctx the parse tree
	 */
	void exitSUBSET_EXPRESSION_EXPRESSION(LispParser.SUBSET_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTERSECTION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 */
	void enterINTERSECTION_EXPRESSION_EXPRESSION(LispParser.INTERSECTION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTERSECTION_EXPRESSION_EXPRESSION}
	 * labeled alternative in {@link LispParser#intersection_expression}.
	 * @param ctx the parse tree
	 */
	void exitINTERSECTION_EXPRESSION_EXPRESSION(LispParser.INTERSECTION_EXPRESSION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPEND_EXPRESSION}
	 * labeled alternative in {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 */
	void enterAPPEND_EXPRESSION(LispParser.APPEND_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPEND_EXPRESSION}
	 * labeled alternative in {@link LispParser#append_expression}.
	 * @param ctx the parse tree
	 */
	void exitAPPEND_EXPRESSION(LispParser.APPEND_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REVERSE_EXPRESSION}
	 * labeled alternative in {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 */
	void enterREVERSE_EXPRESSION(LispParser.REVERSE_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REVERSE_EXPRESSION}
	 * labeled alternative in {@link LispParser#reverse_expression}.
	 * @param ctx the parse tree
	 */
	void exitREVERSE_EXPRESSION(LispParser.REVERSE_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHARACTER_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 */
	void enterCHARACTER_FUNCTION_EXPRESSION(LispParser.CHARACTER_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHARACTER_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#character_function_expression}.
	 * @param ctx the parse tree
	 */
	void exitCHARACTER_FUNCTION_EXPRESSION(LispParser.CHARACTER_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SORT_EXPRESSION}
	 * labeled alternative in {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 */
	void enterSORT_EXPRESSION(LispParser.SORT_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SORT_EXPRESSION}
	 * labeled alternative in {@link LispParser#sort_expression}.
	 * @param ctx the parse tree
	 */
	void exitSORT_EXPRESSION(LispParser.SORT_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HASH_COMPARISON}
	 * labeled alternative in {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 */
	void enterHASH_COMPARISON(LispParser.HASH_COMPARISONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HASH_COMPARISON}
	 * labeled alternative in {@link LispParser#hashcomparison}.
	 * @param ctx the parse tree
	 */
	void exitHASH_COMPARISON(LispParser.HASH_COMPARISONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_REF_EXPRESSION}
	 * labeled alternative in {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_REF_EXPRESSION(LispParser.ARRAY_REF_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_REF_EXPRESSION}
	 * labeled alternative in {@link LispParser#arrayref_expression}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_REF_EXPRESSION(LispParser.ARRAY_REF_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PUSH_EXPRESSION}
	 * labeled alternative in {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void enterPUSH_EXPRESSION(LispParser.PUSH_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PUSH_EXPRESSION}
	 * labeled alternative in {@link LispParser#push_expression}.
	 * @param ctx the parse tree
	 */
	void exitPUSH_EXPRESSION(LispParser.PUSH_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POP_EXPRESSION}
	 * labeled alternative in {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 */
	void enterPOP_EXPRESSION(LispParser.POP_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POP_EXPRESSION}
	 * labeled alternative in {@link LispParser#pop_expression}.
	 * @param ctx the parse tree
	 */
	void exitPOP_EXPRESSION(LispParser.POP_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_CALL(LispParser.FUNCTION_CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_CALL}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_CALL(LispParser.FUNCTION_CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_CALL_FUNCTION(LispParser.FUNCTION_CALL_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_CALL_FUNCTION(LispParser.FUNCTION_CALL_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPLY_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterAPPLY_CALL_FUNCTION(LispParser.APPLY_CALL_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPLY_CALL_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitAPPLY_CALL_FUNCTION(LispParser.APPLY_CALL_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MAPCAR_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterMAPCAR_FUNCTION(LispParser.MAPCAR_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MAPCAR_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitMAPCAR_FUNCTION(LispParser.MAPCAR_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LAMBDA_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterLAMBDA_FUNCTION(LispParser.LAMBDA_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LAMBDA_FUNCTION}
	 * labeled alternative in {@link LispParser#function_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitLAMBDA_FUNCTION(LispParser.LAMBDA_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_CALL_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_CALL_EXPRESSION(LispParser.FUNCTION_CALL_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_CALL_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_CALL_EXPRESSION(LispParser.FUNCTION_CALL_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_CALL_FUNCTION_EXPRESSION(LispParser.FUNCTION_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#function_call_function}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_CALL_FUNCTION_EXPRESSION(LispParser.FUNCTION_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPLY_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 */
	void enterAPPLY_CALL_FUNCTION_EXPRESSION(LispParser.APPLY_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPLY_CALL_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#apply_call_function}.
	 * @param ctx the parse tree
	 */
	void exitAPPLY_CALL_FUNCTION_EXPRESSION(LispParser.APPLY_CALL_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MAPCAR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 */
	void enterMAPCAR_FUNCTION_EXPRESSION(LispParser.MAPCAR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MAPCAR_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#mapcar_function}.
	 * @param ctx the parse tree
	 */
	void exitMAPCAR_FUNCTION_EXPRESSION(LispParser.MAPCAR_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROGN_EXPRESSION}
	 * labeled alternative in {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 */
	void enterPROGN_EXPRESSION(LispParser.PROGN_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROGN_EXPRESSION}
	 * labeled alternative in {@link LispParser#progn_expression}.
	 * @param ctx the parse tree
	 */
	void exitPROGN_EXPRESSION(LispParser.PROGN_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LET_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void enterLET_EXPRESSION(LispParser.LET_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LET_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void exitLET_EXPRESSION(LispParser.LET_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LET_BINDING_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 */
	void enterLET_BINDING_EXPRESSION(LispParser.LET_BINDING_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LET_BINDING_EXPRESSION}
	 * labeled alternative in {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 */
	void exitLET_BINDING_EXPRESSION(LispParser.LET_BINDING_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LAMBDA_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLAMBDA_FUNCTION_EXPRESSION(LispParser.LAMBDA_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LAMBDA_FUNCTION_EXPRESSION}
	 * labeled alternative in {@link LispParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLAMBDA_FUNCTION_EXPRESSION(LispParser.LAMBDA_FUNCTION_EXPRESSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSTRING_EXPRESSION(LispParser.STRING_EXPRESSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING_EXPRESSION}
	 * labeled alternative in {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSTRING_EXPRESSION(LispParser.STRING_EXPRESSIONContext ctx);
}