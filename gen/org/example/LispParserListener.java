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
	 * Enter a parse tree produced by {@link LispParser#if_form}.
	 * @param ctx the parse tree
	 */
	void enterIf_form(LispParser.If_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#if_form}.
	 * @param ctx the parse tree
	 */
	void exitIf_form(LispParser.If_formContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(LispParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(LispParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expr(LispParser.Comparison_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expr(LispParser.Comparison_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(LispParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(LispParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void enterList_operation(LispParser.List_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#list_operation}.
	 * @param ctx the parse tree
	 */
	void exitList_operation(LispParser.List_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#format_expr}.
	 * @param ctx the parse tree
	 */
	void enterFormat_expr(LispParser.Format_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#format_expr}.
	 * @param ctx the parse tree
	 */
	void exitFormat_expr(LispParser.Format_exprContext ctx);
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
	 * Enter a parse tree produced by {@link LispParser#eval_expr}.
	 * @param ctx the parse tree
	 */
	void enterEval_expr(LispParser.Eval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#eval_expr}.
	 * @param ctx the parse tree
	 */
	void exitEval_expr(LispParser.Eval_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#load_expr}.
	 * @param ctx the parse tree
	 */
	void enterLoad_expr(LispParser.Load_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#load_expr}.
	 * @param ctx the parse tree
	 */
	void exitLoad_expr(LispParser.Load_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void enterRead_expr(LispParser.Read_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void exitRead_expr(LispParser.Read_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#other_special_expr}.
	 * @param ctx the parse tree
	 */
	void enterOther_special_expr(LispParser.Other_special_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#other_special_expr}.
	 * @param ctx the parse tree
	 */
	void exitOther_special_expr(LispParser.Other_special_exprContext ctx);
}