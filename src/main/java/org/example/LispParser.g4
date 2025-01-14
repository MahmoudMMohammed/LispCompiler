parser grammar LispParser;

options {
    tokenVocab = LispLexer;
}

// Root rule: A Lisp program is a sequence of s-expressions
program: s_expr* EOF;

// An s-expression is either an atom or a list
s_expr: atom | list;

// An atom is a number, symbol, string, or quoted expression
atom: NUMBER | SYMBOL | STRING | QUOTE s_expr;

// A list is a sequence of s-expressions enclosed in parentheses
list: LPAREN (special_form | function_call | arithmetic_expr | comparison_expr | logical_expr | list_operation | format_expr | other_expressions | s_expr*) RPAREN;

// Function call: (function-name arg1 arg2 ...)
function_call: SYMBOL s_expr*;

// Special forms
special_form:
    if_form
    | defun_form
    | defparameter_form
    | let_form
    | lambda_form
    | quote_form
    | setq_form
    | funcall_form;

// if special form: (if condition then-expr else-expr)
if_form: IF s_expr s_expr s_expr?;

// defun special form: (defun function-name (params) body)
defun_form: DEFUN SYMBOL LPAREN SYMBOL* RPAREN s_expr+;

// defparameter special form: (defparameter name value)
defparameter_form: DEFPARAMETER SYMBOL s_expr;

// let special form: (let ((var1 val1) (var2 val2) ...) body)
let_form: LET LPAREN (let_binding)* RPAREN s_expr+;
let_binding: LPAREN SYMBOL s_expr RPAREN;

// lambda special form: (lambda (params) body)
lambda_form: LAMBDA LPAREN SYMBOL* RPAREN s_expr+;

// quote special form: (quote s-expr)
quote_form: QUOTEQ s_expr;

// setq special form: (setq var value)
setq_form: SETQ SYMBOL s_expr;

// funcall special form: (funcall function arg1 arg2 ...)
funcall_form: FUNCALL s_expr s_expr*;

// Arithmetic expressions: (+ 1 2), (- x y), (* a b), (/ x y)
arithmetic_expr: (ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION) s_expr+;

// Comparison expressions: (> x y), (= a b), etc.
comparison_expr: (LESS_THAN | LESS_EQUAL | EQUALS | EQUAL | GRATER_THAN | GREATER_EQUAL | NOT_EQUAL) s_expr+;

// Logical expressions: (and x y), (or a b), (not c)
logical_expr: (AND | OR | NOT) s_expr+;

// List operations: (car list), (cdr list), (cons x y), etc.
list_operation: (CAR | CDR | CONS | LIST | APPEND | LENGTH | REVERSE) s_expr+;

format_expr
    : FORMAT (t_or_nil | stream) format_string (s_expr)* // Handles "format" with arguments
    ;

t_or_nil
    : T           // Output to terminal
    | NIL           // Return a formatted string
    ;

stream
    : SYMBOL        // A stream (e.g., file, terminal, or other destination)
    ;

format_string
    : STRING_WITH_DIRECTIVES (directive)* // Allows string followed by parsed directives
    ;

directive
    : DIRECTIVE_NEWLINE         // Newline
    | DIRECTIVE_OBJECT         // General Lisp object
    | DIRECTIVE_INTEGER         // Integer
    | DIRECTIVE_LITERAL_TILDE         // Literal `~`
    | DIRECTIVE_COND_NEWLINE         // Conditional newline
    | DIRECTIVE_JUSTIFY_START         // Justification start
    | DIRECTIVE_JUSTIFY_END         // Justification end
    | DIRECTIVE_AESTHETIC         // Aesthetic representation
    | DIRECTIVE_TABULATION         // Tabulation
    | DIRECTIVE_ROMAN         // Roman numeral representation
    | DIRECTIVE_FIXED        // Fixed-point format
    | DIRECTIVE_EXPONENTIAL         // Exponential format
    | DIRECTIVE_GENERAL         // General format (either ~F or ~E)
    | DIRECTIVE_PLURALIZE         // Pluralize ("s" for non-singular)
    | DIRECTIVE_CHARACTER        // Character representation
    | DIRECTIVE_CONDITIONAL     // Conditional expression
    | DIRECTIVE_COND_NEWLINE    // Conditional newline
    ;


// Other expressions: (print x), (eval s-expr), etc.
other_expressions
    : print_expr
    | eval_expr
    | load_expr
    | read_expr
    | other_special_expr
    ;

// Rule for print expression
print_expr
    : PRINT s_expr+
    ;

// Rule for eval expression
eval_expr
    : EVAL s_expr
    ;

// Rule for load expression
load_expr
    : LOAD STRING_WITH_DIRECTIVES
    ;

// Rule for read expression
read_expr
    : READ
    ;

// Rule for other special expressions (e.g., user-defined or format-like)
other_special_expr
    : SYMBOL s_expr*
    ;
