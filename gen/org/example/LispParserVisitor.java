// Generated from C:/Users/DELL/IdeaProjects/compilerProject/src/main/java/org/example/LispParser.g4 by ANTLR 4.13.2
package org.example;
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
	 * Visit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LispParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#s_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_expr(LispParser.S_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LispParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LispParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#special_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_form(LispParser.Special_formContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfSpecialForm}
	 * labeled alternative in {@link LispParser#if_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSpecialForm(LispParser.IfSpecialFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defun_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun_form(LispParser.Defun_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defparameter_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparameter_form(LispParser.Defparameter_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#let_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_form(LispParser.Let_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#let_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_binding(LispParser.Let_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#lambda_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_form(LispParser.Lambda_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote_form(LispParser.Quote_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setq_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetq_form(LispParser.Setq_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#funcall_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncall_form(LispParser.Funcall_formContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link LispParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(LispParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LispParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LispParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link LispParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(LispParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOperation}
	 * labeled alternative in {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOperation(LispParser.ListOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormatExpression}
	 * labeled alternative in {@link LispParser#format_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatExpression(LispParser.FormatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#t_or_nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_or_nil(LispParser.T_or_nilContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(LispParser.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#format_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_string(LispParser.Format_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(LispParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#other_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_expressions(LispParser.Other_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expr(LispParser.Print_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalExpression}
	 * labeled alternative in {@link LispParser#eval_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalExpression(LispParser.EvalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoadExpression}
	 * labeled alternative in {@link LispParser#load_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadExpression(LispParser.LoadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link LispParser#read_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpression(LispParser.ReadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cond_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_form(LispParser.Cond_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#when_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_form(LispParser.When_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#unless_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless_form(LispParser.Unless_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#evenp_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvenp_form(LispParser.Evenp_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#oddp_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOddp_form(LispParser.Oddp_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#case_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_form(LispParser.Case_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#progn_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgn_form(LispParser.Progn_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#loop_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_form(LispParser.Loop_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_form(LispParser.Return_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#mapcar_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapcar_form(LispParser.Mapcar_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#apply_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply_form(LispParser.Apply_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#member_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_form(LispParser.Member_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#assoc_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_form(LispParser.Assoc_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#remove_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove_form(LispParser.Remove_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#find_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind_form(LispParser.Find_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#position_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_form(LispParser.Position_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#substring_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring_form(LispParser.Substring_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#concatenate_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate_form(LispParser.Concatenate_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#char_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_form(LispParser.Char_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#aref_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAref_form(LispParser.Aref_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#sort_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_form(LispParser.Sort_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#merge_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_form(LispParser.Merge_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#subsetp_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsetp_form(LispParser.Subsetp_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#reduce_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduce_form(LispParser.Reduce_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#filter_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_form(LispParser.Filter_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#every_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_form(LispParser.Every_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#some_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_form(LispParser.Some_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#null_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_form(LispParser.Null_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#typeof_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeof_form(LispParser.Typeof_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#eq_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_form(LispParser.Eq_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#eql_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEql_form(LispParser.Eql_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#equalp_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualp_form(LispParser.Equalp_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#typep_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypep_form(LispParser.Typep_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#subtypep_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtypep_form(LispParser.Subtypep_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#coerce_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerce_form(LispParser.Coerce_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#declare_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_form(LispParser.Declare_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#the_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_form(LispParser.The_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#block_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_form(LispParser.Block_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#return_from_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_from_form(LispParser.Return_from_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#catch_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_form(LispParser.Catch_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#throw_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_form(LispParser.Throw_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#tagbody_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagbody_form(LispParser.Tagbody_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#go_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_form(LispParser.Go_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defclass_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefclass_form(LispParser.Defclass_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defmethod_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefmethod_form(LispParser.Defmethod_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defgeneric_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefgeneric_form(LispParser.Defgeneric_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#intersection_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection_form(LispParser.Intersection_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#union_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_form(LispParser.Union_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#set_difference_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_difference_form(LispParser.Set_difference_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#signal_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_form(LispParser.Signal_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#error_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_form(LispParser.Error_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#warn_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarn_form(LispParser.Warn_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#break_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_form(LispParser.Break_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#continue_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_form(LispParser.Continue_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#store_value_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_value_form(LispParser.Store_value_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#use_value_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_value_form(LispParser.Use_value_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#abort_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_form(LispParser.Abort_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#typecase_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecase_form(LispParser.Typecase_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#etypecase_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtypecase_form(LispParser.Etypecase_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#ctypecase_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtypecase_form(LispParser.Ctypecase_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#prog_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_form(LispParser.Prog_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#prog1_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg1_form(LispParser.Prog1_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#prog2_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg2_form(LispParser.Prog2_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#do_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_form(LispParser.Do_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#dolist_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDolist_form(LispParser.Dolist_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#dotimes_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotimes_form(LispParser.Dotimes_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#next_method_p_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_method_p_form(LispParser.Next_method_p_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#push_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_form(LispParser.Push_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#pop_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop_form(LispParser.Pop_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#fact_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact_form(LispParser.Fact_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#optional_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_form(LispParser.Optional_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#reset_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_form(LispParser.Reset_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#key_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_form(LispParser.Key_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#make_array_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake_array_form(LispParser.Make_array_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#defstruct_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstruct_form(LispParser.Defstruct_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#setf_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetf_form(LispParser.Setf_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#incf_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncf_form(LispParser.Incf_formContext ctx);
}