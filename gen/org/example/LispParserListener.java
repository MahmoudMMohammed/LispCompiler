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
}