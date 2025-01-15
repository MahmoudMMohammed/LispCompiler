// Generated from C:/Users/DELL/IdeaProjects/compilerProject/src/main/java/org/example/LispParser.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LispParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#s_expr}.
	 * @param ctx the parse tree
	 */
	void enterS_expr(LispParser.S_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#s_expr}.
	 * @param ctx the parse tree
	 */
	void exitS_expr(LispParser.S_exprContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LispParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LispParser.AtomContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(LispParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(LispParser.Special_formContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfSpecialForm}
	 * labeled alternative in {@link LispParser#if_form}.
	 * @param ctx the parse tree
	 */
	void enterIfSpecialForm(LispParser.IfSpecialFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfSpecialForm}
	 * labeled alternative in {@link LispParser#if_form}.
	 * @param ctx the parse tree
	 */
	void exitIfSpecialForm(LispParser.IfSpecialFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defun_form}.
	 * @param ctx the parse tree
	 */
	void enterDefun_form(LispParser.Defun_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defun_form}.
	 * @param ctx the parse tree
	 */
	void exitDefun_form(LispParser.Defun_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defparameter_form}.
	 * @param ctx the parse tree
	 */
	void enterDefparameter_form(LispParser.Defparameter_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defparameter_form}.
	 * @param ctx the parse tree
	 */
	void exitDefparameter_form(LispParser.Defparameter_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#let_form}.
	 * @param ctx the parse tree
	 */
	void enterLet_form(LispParser.Let_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#let_form}.
	 * @param ctx the parse tree
	 */
	void exitLet_form(LispParser.Let_formContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#lambda_form}.
	 * @param ctx the parse tree
	 */
	void enterLambda_form(LispParser.Lambda_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lambda_form}.
	 * @param ctx the parse tree
	 */
	void exitLambda_form(LispParser.Lambda_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 */
	void enterQuote_form(LispParser.Quote_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#quote_form}.
	 * @param ctx the parse tree
	 */
	void exitQuote_form(LispParser.Quote_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setq_form}.
	 * @param ctx the parse tree
	 */
	void enterSetq_form(LispParser.Setq_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setq_form}.
	 * @param ctx the parse tree
	 */
	void exitSetq_form(LispParser.Setq_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#funcall_form}.
	 * @param ctx the parse tree
	 */
	void enterFuncall_form(LispParser.Funcall_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#funcall_form}.
	 * @param ctx the parse tree
	 */
	void exitFuncall_form(LispParser.Funcall_formContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link LispParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(LispParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpression}
	 * labeled alternative in {@link LispParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(LispParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LispParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LispParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LispParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LispParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link LispParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(LispParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpression}
	 * labeled alternative in {@link LispParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(LispParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListOperation}
	 * labeled alternative in {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void enterListOperation(LispParser.ListOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListOperation}
	 * labeled alternative in {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void exitListOperation(LispParser.ListOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatExpression}
	 * labeled alternative in {@link LispParser#format_expr}.
	 * @param ctx the parse tree
	 */
	void enterFormatExpression(LispParser.FormatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatExpression}
	 * labeled alternative in {@link LispParser#format_expr}.
	 * @param ctx the parse tree
	 */
	void exitFormatExpression(LispParser.FormatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#t_or_nil}.
	 * @param ctx the parse tree
	 */
	void enterT_or_nil(LispParser.T_or_nilContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#t_or_nil}.
	 * @param ctx the parse tree
	 */
	void exitT_or_nil(LispParser.T_or_nilContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#stream}.
	 * @param ctx the parse tree
	 */
	void enterStream(LispParser.StreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#stream}.
	 * @param ctx the parse tree
	 */
	void exitStream(LispParser.StreamContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(LispParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(LispParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#other_expressions}.
	 * @param ctx the parse tree
	 */
	void enterOther_expressions(LispParser.Other_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#other_expressions}.
	 * @param ctx the parse tree
	 */
	void exitOther_expressions(LispParser.Other_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(LispParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(LispParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvalExpression}
	 * labeled alternative in {@link LispParser#eval_expr}.
	 * @param ctx the parse tree
	 */
	void enterEvalExpression(LispParser.EvalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvalExpression}
	 * labeled alternative in {@link LispParser#eval_expr}.
	 * @param ctx the parse tree
	 */
	void exitEvalExpression(LispParser.EvalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadExpression}
	 * labeled alternative in {@link LispParser#load_expr}.
	 * @param ctx the parse tree
	 */
	void enterLoadExpression(LispParser.LoadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadExpression}
	 * labeled alternative in {@link LispParser#load_expr}.
	 * @param ctx the parse tree
	 */
	void exitLoadExpression(LispParser.LoadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link LispParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(LispParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpression}
	 * labeled alternative in {@link LispParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(LispParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cond_form}.
	 * @param ctx the parse tree
	 */
	void enterCond_form(LispParser.Cond_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cond_form}.
	 * @param ctx the parse tree
	 */
	void exitCond_form(LispParser.Cond_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#when_form}.
	 * @param ctx the parse tree
	 */
	void enterWhen_form(LispParser.When_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#when_form}.
	 * @param ctx the parse tree
	 */
	void exitWhen_form(LispParser.When_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#unless_form}.
	 * @param ctx the parse tree
	 */
	void enterUnless_form(LispParser.Unless_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#unless_form}.
	 * @param ctx the parse tree
	 */
	void exitUnless_form(LispParser.Unless_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#evenp_form}.
	 * @param ctx the parse tree
	 */
	void enterEvenp_form(LispParser.Evenp_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#evenp_form}.
	 * @param ctx the parse tree
	 */
	void exitEvenp_form(LispParser.Evenp_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#oddp_form}.
	 * @param ctx the parse tree
	 */
	void enterOddp_form(LispParser.Oddp_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#oddp_form}.
	 * @param ctx the parse tree
	 */
	void exitOddp_form(LispParser.Oddp_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#case_form}.
	 * @param ctx the parse tree
	 */
	void enterCase_form(LispParser.Case_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#case_form}.
	 * @param ctx the parse tree
	 */
	void exitCase_form(LispParser.Case_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#progn_form}.
	 * @param ctx the parse tree
	 */
	void enterProgn_form(LispParser.Progn_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#progn_form}.
	 * @param ctx the parse tree
	 */
	void exitProgn_form(LispParser.Progn_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#loop_form}.
	 * @param ctx the parse tree
	 */
	void enterLoop_form(LispParser.Loop_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#loop_form}.
	 * @param ctx the parse tree
	 */
	void exitLoop_form(LispParser.Loop_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_form}.
	 * @param ctx the parse tree
	 */
	void enterReturn_form(LispParser.Return_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_form}.
	 * @param ctx the parse tree
	 */
	void exitReturn_form(LispParser.Return_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#mapcar_form}.
	 * @param ctx the parse tree
	 */
	void enterMapcar_form(LispParser.Mapcar_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#mapcar_form}.
	 * @param ctx the parse tree
	 */
	void exitMapcar_form(LispParser.Mapcar_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#apply_form}.
	 * @param ctx the parse tree
	 */
	void enterApply_form(LispParser.Apply_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#apply_form}.
	 * @param ctx the parse tree
	 */
	void exitApply_form(LispParser.Apply_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#member_form}.
	 * @param ctx the parse tree
	 */
	void enterMember_form(LispParser.Member_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#member_form}.
	 * @param ctx the parse tree
	 */
	void exitMember_form(LispParser.Member_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#assoc_form}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_form(LispParser.Assoc_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#assoc_form}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_form(LispParser.Assoc_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#remove_form}.
	 * @param ctx the parse tree
	 */
	void enterRemove_form(LispParser.Remove_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#remove_form}.
	 * @param ctx the parse tree
	 */
	void exitRemove_form(LispParser.Remove_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#find_form}.
	 * @param ctx the parse tree
	 */
	void enterFind_form(LispParser.Find_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#find_form}.
	 * @param ctx the parse tree
	 */
	void exitFind_form(LispParser.Find_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#position_form}.
	 * @param ctx the parse tree
	 */
	void enterPosition_form(LispParser.Position_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#position_form}.
	 * @param ctx the parse tree
	 */
	void exitPosition_form(LispParser.Position_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#substring_form}.
	 * @param ctx the parse tree
	 */
	void enterSubstring_form(LispParser.Substring_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#substring_form}.
	 * @param ctx the parse tree
	 */
	void exitSubstring_form(LispParser.Substring_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#concatenate_form}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate_form(LispParser.Concatenate_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#concatenate_form}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate_form(LispParser.Concatenate_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#char_form}.
	 * @param ctx the parse tree
	 */
	void enterChar_form(LispParser.Char_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#char_form}.
	 * @param ctx the parse tree
	 */
	void exitChar_form(LispParser.Char_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#aref_form}.
	 * @param ctx the parse tree
	 */
	void enterAref_form(LispParser.Aref_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#aref_form}.
	 * @param ctx the parse tree
	 */
	void exitAref_form(LispParser.Aref_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#sort_form}.
	 * @param ctx the parse tree
	 */
	void enterSort_form(LispParser.Sort_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#sort_form}.
	 * @param ctx the parse tree
	 */
	void exitSort_form(LispParser.Sort_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#merge_form}.
	 * @param ctx the parse tree
	 */
	void enterMerge_form(LispParser.Merge_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#merge_form}.
	 * @param ctx the parse tree
	 */
	void exitMerge_form(LispParser.Merge_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#subsetp_form}.
	 * @param ctx the parse tree
	 */
	void enterSubsetp_form(LispParser.Subsetp_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#subsetp_form}.
	 * @param ctx the parse tree
	 */
	void exitSubsetp_form(LispParser.Subsetp_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#reduce_form}.
	 * @param ctx the parse tree
	 */
	void enterReduce_form(LispParser.Reduce_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#reduce_form}.
	 * @param ctx the parse tree
	 */
	void exitReduce_form(LispParser.Reduce_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#filter_form}.
	 * @param ctx the parse tree
	 */
	void enterFilter_form(LispParser.Filter_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#filter_form}.
	 * @param ctx the parse tree
	 */
	void exitFilter_form(LispParser.Filter_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#every_form}.
	 * @param ctx the parse tree
	 */
	void enterEvery_form(LispParser.Every_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#every_form}.
	 * @param ctx the parse tree
	 */
	void exitEvery_form(LispParser.Every_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#some_form}.
	 * @param ctx the parse tree
	 */
	void enterSome_form(LispParser.Some_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#some_form}.
	 * @param ctx the parse tree
	 */
	void exitSome_form(LispParser.Some_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#null_form}.
	 * @param ctx the parse tree
	 */
	void enterNull_form(LispParser.Null_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#null_form}.
	 * @param ctx the parse tree
	 */
	void exitNull_form(LispParser.Null_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#typeof_form}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_form(LispParser.Typeof_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#typeof_form}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_form(LispParser.Typeof_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#eq_form}.
	 * @param ctx the parse tree
	 */
	void enterEq_form(LispParser.Eq_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#eq_form}.
	 * @param ctx the parse tree
	 */
	void exitEq_form(LispParser.Eq_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#eql_form}.
	 * @param ctx the parse tree
	 */
	void enterEql_form(LispParser.Eql_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#eql_form}.
	 * @param ctx the parse tree
	 */
	void exitEql_form(LispParser.Eql_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#equalp_form}.
	 * @param ctx the parse tree
	 */
	void enterEqualp_form(LispParser.Equalp_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#equalp_form}.
	 * @param ctx the parse tree
	 */
	void exitEqualp_form(LispParser.Equalp_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#typep_form}.
	 * @param ctx the parse tree
	 */
	void enterTypep_form(LispParser.Typep_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#typep_form}.
	 * @param ctx the parse tree
	 */
	void exitTypep_form(LispParser.Typep_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#subtypep_form}.
	 * @param ctx the parse tree
	 */
	void enterSubtypep_form(LispParser.Subtypep_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#subtypep_form}.
	 * @param ctx the parse tree
	 */
	void exitSubtypep_form(LispParser.Subtypep_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#coerce_form}.
	 * @param ctx the parse tree
	 */
	void enterCoerce_form(LispParser.Coerce_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#coerce_form}.
	 * @param ctx the parse tree
	 */
	void exitCoerce_form(LispParser.Coerce_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#declare_form}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_form(LispParser.Declare_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#declare_form}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_form(LispParser.Declare_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#the_form}.
	 * @param ctx the parse tree
	 */
	void enterThe_form(LispParser.The_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#the_form}.
	 * @param ctx the parse tree
	 */
	void exitThe_form(LispParser.The_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#block_form}.
	 * @param ctx the parse tree
	 */
	void enterBlock_form(LispParser.Block_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#block_form}.
	 * @param ctx the parse tree
	 */
	void exitBlock_form(LispParser.Block_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#return_from_form}.
	 * @param ctx the parse tree
	 */
	void enterReturn_from_form(LispParser.Return_from_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#return_from_form}.
	 * @param ctx the parse tree
	 */
	void exitReturn_from_form(LispParser.Return_from_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#catch_form}.
	 * @param ctx the parse tree
	 */
	void enterCatch_form(LispParser.Catch_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#catch_form}.
	 * @param ctx the parse tree
	 */
	void exitCatch_form(LispParser.Catch_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#throw_form}.
	 * @param ctx the parse tree
	 */
	void enterThrow_form(LispParser.Throw_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#throw_form}.
	 * @param ctx the parse tree
	 */
	void exitThrow_form(LispParser.Throw_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#tagbody_form}.
	 * @param ctx the parse tree
	 */
	void enterTagbody_form(LispParser.Tagbody_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#tagbody_form}.
	 * @param ctx the parse tree
	 */
	void exitTagbody_form(LispParser.Tagbody_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#go_form}.
	 * @param ctx the parse tree
	 */
	void enterGo_form(LispParser.Go_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#go_form}.
	 * @param ctx the parse tree
	 */
	void exitGo_form(LispParser.Go_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defclass_form}.
	 * @param ctx the parse tree
	 */
	void enterDefclass_form(LispParser.Defclass_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defclass_form}.
	 * @param ctx the parse tree
	 */
	void exitDefclass_form(LispParser.Defclass_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defmethod_form}.
	 * @param ctx the parse tree
	 */
	void enterDefmethod_form(LispParser.Defmethod_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defmethod_form}.
	 * @param ctx the parse tree
	 */
	void exitDefmethod_form(LispParser.Defmethod_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defgeneric_form}.
	 * @param ctx the parse tree
	 */
	void enterDefgeneric_form(LispParser.Defgeneric_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defgeneric_form}.
	 * @param ctx the parse tree
	 */
	void exitDefgeneric_form(LispParser.Defgeneric_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#intersection_form}.
	 * @param ctx the parse tree
	 */
	void enterIntersection_form(LispParser.Intersection_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#intersection_form}.
	 * @param ctx the parse tree
	 */
	void exitIntersection_form(LispParser.Intersection_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#union_form}.
	 * @param ctx the parse tree
	 */
	void enterUnion_form(LispParser.Union_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#union_form}.
	 * @param ctx the parse tree
	 */
	void exitUnion_form(LispParser.Union_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#set_difference_form}.
	 * @param ctx the parse tree
	 */
	void enterSet_difference_form(LispParser.Set_difference_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#set_difference_form}.
	 * @param ctx the parse tree
	 */
	void exitSet_difference_form(LispParser.Set_difference_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#signal_form}.
	 * @param ctx the parse tree
	 */
	void enterSignal_form(LispParser.Signal_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#signal_form}.
	 * @param ctx the parse tree
	 */
	void exitSignal_form(LispParser.Signal_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#error_form}.
	 * @param ctx the parse tree
	 */
	void enterError_form(LispParser.Error_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#error_form}.
	 * @param ctx the parse tree
	 */
	void exitError_form(LispParser.Error_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#warn_form}.
	 * @param ctx the parse tree
	 */
	void enterWarn_form(LispParser.Warn_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#warn_form}.
	 * @param ctx the parse tree
	 */
	void exitWarn_form(LispParser.Warn_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#break_form}.
	 * @param ctx the parse tree
	 */
	void enterBreak_form(LispParser.Break_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#break_form}.
	 * @param ctx the parse tree
	 */
	void exitBreak_form(LispParser.Break_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#continue_form}.
	 * @param ctx the parse tree
	 */
	void enterContinue_form(LispParser.Continue_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#continue_form}.
	 * @param ctx the parse tree
	 */
	void exitContinue_form(LispParser.Continue_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#store_value_form}.
	 * @param ctx the parse tree
	 */
	void enterStore_value_form(LispParser.Store_value_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#store_value_form}.
	 * @param ctx the parse tree
	 */
	void exitStore_value_form(LispParser.Store_value_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#use_value_form}.
	 * @param ctx the parse tree
	 */
	void enterUse_value_form(LispParser.Use_value_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#use_value_form}.
	 * @param ctx the parse tree
	 */
	void exitUse_value_form(LispParser.Use_value_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#abort_form}.
	 * @param ctx the parse tree
	 */
	void enterAbort_form(LispParser.Abort_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#abort_form}.
	 * @param ctx the parse tree
	 */
	void exitAbort_form(LispParser.Abort_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#typecase_form}.
	 * @param ctx the parse tree
	 */
	void enterTypecase_form(LispParser.Typecase_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#typecase_form}.
	 * @param ctx the parse tree
	 */
	void exitTypecase_form(LispParser.Typecase_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#etypecase_form}.
	 * @param ctx the parse tree
	 */
	void enterEtypecase_form(LispParser.Etypecase_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#etypecase_form}.
	 * @param ctx the parse tree
	 */
	void exitEtypecase_form(LispParser.Etypecase_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#ctypecase_form}.
	 * @param ctx the parse tree
	 */
	void enterCtypecase_form(LispParser.Ctypecase_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#ctypecase_form}.
	 * @param ctx the parse tree
	 */
	void exitCtypecase_form(LispParser.Ctypecase_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#prog_form}.
	 * @param ctx the parse tree
	 */
	void enterProg_form(LispParser.Prog_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#prog_form}.
	 * @param ctx the parse tree
	 */
	void exitProg_form(LispParser.Prog_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#prog1_form}.
	 * @param ctx the parse tree
	 */
	void enterProg1_form(LispParser.Prog1_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#prog1_form}.
	 * @param ctx the parse tree
	 */
	void exitProg1_form(LispParser.Prog1_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#prog2_form}.
	 * @param ctx the parse tree
	 */
	void enterProg2_form(LispParser.Prog2_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#prog2_form}.
	 * @param ctx the parse tree
	 */
	void exitProg2_form(LispParser.Prog2_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#do_form}.
	 * @param ctx the parse tree
	 */
	void enterDo_form(LispParser.Do_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#do_form}.
	 * @param ctx the parse tree
	 */
	void exitDo_form(LispParser.Do_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dolist_form}.
	 * @param ctx the parse tree
	 */
	void enterDolist_form(LispParser.Dolist_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dolist_form}.
	 * @param ctx the parse tree
	 */
	void exitDolist_form(LispParser.Dolist_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#dotimes_form}.
	 * @param ctx the parse tree
	 */
	void enterDotimes_form(LispParser.Dotimes_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#dotimes_form}.
	 * @param ctx the parse tree
	 */
	void exitDotimes_form(LispParser.Dotimes_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#next_method_p_form}.
	 * @param ctx the parse tree
	 */
	void enterNext_method_p_form(LispParser.Next_method_p_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#next_method_p_form}.
	 * @param ctx the parse tree
	 */
	void exitNext_method_p_form(LispParser.Next_method_p_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#push_form}.
	 * @param ctx the parse tree
	 */
	void enterPush_form(LispParser.Push_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#push_form}.
	 * @param ctx the parse tree
	 */
	void exitPush_form(LispParser.Push_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#pop_form}.
	 * @param ctx the parse tree
	 */
	void enterPop_form(LispParser.Pop_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#pop_form}.
	 * @param ctx the parse tree
	 */
	void exitPop_form(LispParser.Pop_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#fact_form}.
	 * @param ctx the parse tree
	 */
	void enterFact_form(LispParser.Fact_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#fact_form}.
	 * @param ctx the parse tree
	 */
	void exitFact_form(LispParser.Fact_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#optional_form}.
	 * @param ctx the parse tree
	 */
	void enterOptional_form(LispParser.Optional_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#optional_form}.
	 * @param ctx the parse tree
	 */
	void exitOptional_form(LispParser.Optional_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#reset_form}.
	 * @param ctx the parse tree
	 */
	void enterReset_form(LispParser.Reset_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#reset_form}.
	 * @param ctx the parse tree
	 */
	void exitReset_form(LispParser.Reset_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#key_form}.
	 * @param ctx the parse tree
	 */
	void enterKey_form(LispParser.Key_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#key_form}.
	 * @param ctx the parse tree
	 */
	void exitKey_form(LispParser.Key_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#make_array_form}.
	 * @param ctx the parse tree
	 */
	void enterMake_array_form(LispParser.Make_array_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#make_array_form}.
	 * @param ctx the parse tree
	 */
	void exitMake_array_form(LispParser.Make_array_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#defstruct_form}.
	 * @param ctx the parse tree
	 */
	void enterDefstruct_form(LispParser.Defstruct_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#defstruct_form}.
	 * @param ctx the parse tree
	 */
	void exitDefstruct_form(LispParser.Defstruct_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#setf_form}.
	 * @param ctx the parse tree
	 */
	void enterSetf_form(LispParser.Setf_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#setf_form}.
	 * @param ctx the parse tree
	 */
	void exitSetf_form(LispParser.Setf_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#incf_form}.
	 * @param ctx the parse tree
	 */
	void enterIncf_form(LispParser.Incf_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#incf_form}.
	 * @param ctx the parse tree
	 */
	void exitIncf_form(LispParser.Incf_formContext ctx);
}