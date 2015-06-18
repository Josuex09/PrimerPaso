// Generated from PrimerPaso.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrimerPasoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrimerPasoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PrimerPasoParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#replace_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_def(@NotNull PrimerPasoParser.Replace_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull PrimerPasoParser.ResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#string_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_sentence(@NotNull PrimerPasoParser.String_sentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#amount_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmount_def(@NotNull PrimerPasoParser.Amount_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#for_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_def(@NotNull PrimerPasoParser.For_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull PrimerPasoParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#contains_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains_def(@NotNull PrimerPasoParser.Contains_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(@NotNull PrimerPasoParser.SentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#type_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(@NotNull PrimerPasoParser.Type_intContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PrimerPasoParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#while_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_def(@NotNull PrimerPasoParser.While_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#array_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_sentence(@NotNull PrimerPasoParser.Array_sentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#sortAsc_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortAsc_def(@NotNull PrimerPasoParser.SortAsc_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#less_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_def(@NotNull PrimerPasoParser.Less_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#change_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_def(@NotNull PrimerPasoParser.Change_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#type_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_string(@NotNull PrimerPasoParser.Type_stringContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull PrimerPasoParser.Data_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#uppercase_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercase_def(@NotNull PrimerPasoParser.Uppercase_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#type_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(@NotNull PrimerPasoParser.Type_voidContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#divide_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_def(@NotNull PrimerPasoParser.Divide_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#type_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_char(@NotNull PrimerPasoParser.Type_charContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#power_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_def(@NotNull PrimerPasoParser.Power_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#higher_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_def(@NotNull PrimerPasoParser.Higher_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull PrimerPasoParser.ElementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#print_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_def(@NotNull PrimerPasoParser.Print_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#sortDes_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDes_def(@NotNull PrimerPasoParser.SortDes_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_conditional(@NotNull PrimerPasoParser.If_conditionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(@NotNull PrimerPasoParser.Function_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#id_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_decl(@NotNull PrimerPasoParser.Id_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull PrimerPasoParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull PrimerPasoParser.Var_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#var_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_call(@NotNull PrimerPasoParser.Var_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#isDigit_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDigit_def(@NotNull PrimerPasoParser.IsDigit_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#dowhile_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_def(@NotNull PrimerPasoParser.Dowhile_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#do_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_def(@NotNull PrimerPasoParser.Do_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull PrimerPasoParser.InputContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(@NotNull PrimerPasoParser.InputsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull PrimerPasoParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PrimerPasoParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#length_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength_def(@NotNull PrimerPasoParser.Length_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#compareString_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareString_def(@NotNull PrimerPasoParser.CompareString_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#isEmpty_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEmpty_def(@NotNull PrimerPasoParser.IsEmpty_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#type_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(@NotNull PrimerPasoParser.Type_boolContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#main_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_def(@NotNull PrimerPasoParser.Main_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link PrimerPasoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull PrimerPasoParser.LiteralContext ctx);
}