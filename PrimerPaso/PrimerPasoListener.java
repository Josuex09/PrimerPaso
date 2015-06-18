// Generated from PrimerPaso.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrimerPasoParser}.
 */
public interface PrimerPasoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PrimerPasoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PrimerPasoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PrimerPasoParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PrimerPasoParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PrimerPasoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PrimerPasoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#id_decl}.
	 * @param ctx the parse tree
	 */
	void enterId_decl(PrimerPasoParser.Id_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#id_decl}.
	 * @param ctx the parse tree
	 */
	void exitId_decl(PrimerPasoParser.Id_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(PrimerPasoParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(PrimerPasoParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#var_call}.
	 * @param ctx the parse tree
	 */
	void enterVar_call(PrimerPasoParser.Var_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#var_call}.
	 * @param ctx the parse tree
	 */
	void exitVar_call(PrimerPasoParser.Var_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(PrimerPasoParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(PrimerPasoParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(PrimerPasoParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(PrimerPasoParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(PrimerPasoParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(PrimerPasoParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(PrimerPasoParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(PrimerPasoParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#type_int}.
	 * @param ctx the parse tree
	 */
	void enterType_int(PrimerPasoParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#type_int}.
	 * @param ctx the parse tree
	 */
	void exitType_int(PrimerPasoParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#type_char}.
	 * @param ctx the parse tree
	 */
	void enterType_char(PrimerPasoParser.Type_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#type_char}.
	 * @param ctx the parse tree
	 */
	void exitType_char(PrimerPasoParser.Type_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#type_bool}.
	 * @param ctx the parse tree
	 */
	void enterType_bool(PrimerPasoParser.Type_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#type_bool}.
	 * @param ctx the parse tree
	 */
	void exitType_bool(PrimerPasoParser.Type_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#type_string}.
	 * @param ctx the parse tree
	 */
	void enterType_string(PrimerPasoParser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#type_string}.
	 * @param ctx the parse tree
	 */
	void exitType_string(PrimerPasoParser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#type_void}.
	 * @param ctx the parse tree
	 */
	void enterType_void(PrimerPasoParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#type_void}.
	 * @param ctx the parse tree
	 */
	void exitType_void(PrimerPasoParser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(PrimerPasoParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(PrimerPasoParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional(PrimerPasoParser.If_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional(PrimerPasoParser.If_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PrimerPasoParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PrimerPasoParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PrimerPasoParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PrimerPasoParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PrimerPasoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PrimerPasoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#dowhile_def}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_def(PrimerPasoParser.Dowhile_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#dowhile_def}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_def(PrimerPasoParser.Dowhile_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#while_def}.
	 * @param ctx the parse tree
	 */
	void enterWhile_def(PrimerPasoParser.While_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#while_def}.
	 * @param ctx the parse tree
	 */
	void exitWhile_def(PrimerPasoParser.While_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#do_def}.
	 * @param ctx the parse tree
	 */
	void enterDo_def(PrimerPasoParser.Do_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#do_def}.
	 * @param ctx the parse tree
	 */
	void exitDo_def(PrimerPasoParser.Do_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#for_def}.
	 * @param ctx the parse tree
	 */
	void enterFor_def(PrimerPasoParser.For_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#for_def}.
	 * @param ctx the parse tree
	 */
	void exitFor_def(PrimerPasoParser.For_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PrimerPasoParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PrimerPasoParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#isDigit_def}.
	 * @param ctx the parse tree
	 */
	void enterIsDigit_def(PrimerPasoParser.IsDigit_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#isDigit_def}.
	 * @param ctx the parse tree
	 */
	void exitIsDigit_def(PrimerPasoParser.IsDigit_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#sortAsc_def}.
	 * @param ctx the parse tree
	 */
	void enterSortAsc_def(PrimerPasoParser.SortAsc_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#sortAsc_def}.
	 * @param ctx the parse tree
	 */
	void exitSortAsc_def(PrimerPasoParser.SortAsc_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#sortDes_def}.
	 * @param ctx the parse tree
	 */
	void enterSortDes_def(PrimerPasoParser.SortDes_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#sortDes_def}.
	 * @param ctx the parse tree
	 */
	void exitSortDes_def(PrimerPasoParser.SortDes_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#higher_def}.
	 * @param ctx the parse tree
	 */
	void enterHigher_def(PrimerPasoParser.Higher_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#higher_def}.
	 * @param ctx the parse tree
	 */
	void exitHigher_def(PrimerPasoParser.Higher_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#less_def}.
	 * @param ctx the parse tree
	 */
	void enterLess_def(PrimerPasoParser.Less_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#less_def}.
	 * @param ctx the parse tree
	 */
	void exitLess_def(PrimerPasoParser.Less_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#divide_def}.
	 * @param ctx the parse tree
	 */
	void enterDivide_def(PrimerPasoParser.Divide_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#divide_def}.
	 * @param ctx the parse tree
	 */
	void exitDivide_def(PrimerPasoParser.Divide_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#change_def}.
	 * @param ctx the parse tree
	 */
	void enterChange_def(PrimerPasoParser.Change_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#change_def}.
	 * @param ctx the parse tree
	 */
	void exitChange_def(PrimerPasoParser.Change_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#replace_def}.
	 * @param ctx the parse tree
	 */
	void enterReplace_def(PrimerPasoParser.Replace_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#replace_def}.
	 * @param ctx the parse tree
	 */
	void exitReplace_def(PrimerPasoParser.Replace_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#contains_def}.
	 * @param ctx the parse tree
	 */
	void enterContains_def(PrimerPasoParser.Contains_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#contains_def}.
	 * @param ctx the parse tree
	 */
	void exitContains_def(PrimerPasoParser.Contains_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#isEmpty_def}.
	 * @param ctx the parse tree
	 */
	void enterIsEmpty_def(PrimerPasoParser.IsEmpty_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#isEmpty_def}.
	 * @param ctx the parse tree
	 */
	void exitIsEmpty_def(PrimerPasoParser.IsEmpty_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#compareString_def}.
	 * @param ctx the parse tree
	 */
	void enterCompareString_def(PrimerPasoParser.CompareString_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#compareString_def}.
	 * @param ctx the parse tree
	 */
	void exitCompareString_def(PrimerPasoParser.CompareString_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#amount_def}.
	 * @param ctx the parse tree
	 */
	void enterAmount_def(PrimerPasoParser.Amount_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#amount_def}.
	 * @param ctx the parse tree
	 */
	void exitAmount_def(PrimerPasoParser.Amount_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#main_def}.
	 * @param ctx the parse tree
	 */
	void enterMain_def(PrimerPasoParser.Main_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#main_def}.
	 * @param ctx the parse tree
	 */
	void exitMain_def(PrimerPasoParser.Main_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#length_def}.
	 * @param ctx the parse tree
	 */
	void enterLength_def(PrimerPasoParser.Length_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#length_def}.
	 * @param ctx the parse tree
	 */
	void exitLength_def(PrimerPasoParser.Length_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#power_def}.
	 * @param ctx the parse tree
	 */
	void enterPower_def(PrimerPasoParser.Power_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#power_def}.
	 * @param ctx the parse tree
	 */
	void exitPower_def(PrimerPasoParser.Power_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#print_def}.
	 * @param ctx the parse tree
	 */
	void enterPrint_def(PrimerPasoParser.Print_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#print_def}.
	 * @param ctx the parse tree
	 */
	void exitPrint_def(PrimerPasoParser.Print_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#uppercase_def}.
	 * @param ctx the parse tree
	 */
	void enterUppercase_def(PrimerPasoParser.Uppercase_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#uppercase_def}.
	 * @param ctx the parse tree
	 */
	void exitUppercase_def(PrimerPasoParser.Uppercase_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PrimerPasoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PrimerPasoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(PrimerPasoParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(PrimerPasoParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#string_sentence}.
	 * @param ctx the parse tree
	 */
	void enterString_sentence(PrimerPasoParser.String_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#string_sentence}.
	 * @param ctx the parse tree
	 */
	void exitString_sentence(PrimerPasoParser.String_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimerPasoParser#array_sentence}.
	 * @param ctx the parse tree
	 */
	void enterArray_sentence(PrimerPasoParser.Array_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimerPasoParser#array_sentence}.
	 * @param ctx the parse tree
	 */
	void exitArray_sentence(PrimerPasoParser.Array_sentenceContext ctx);
}