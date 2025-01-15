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
	 * Visit a parse tree produced by {@link LispParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LispParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LispParser.ListContext ctx);
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
}