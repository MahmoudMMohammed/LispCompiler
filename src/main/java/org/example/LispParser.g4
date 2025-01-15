parser grammar LispParser;

options {
    tokenVocab = LispLexer;
}

// Root rule: A Lisp program is a sequence of s-expressions
program: s_expr* EOF;

// An s-expression is either an atom or a list
s_expr
    : atom
    | list
    | comparison_expr
    ;


// A list is a sequence of s-expressions enclosed in parentheses
list
    : LPAREN special_form       RPAREN
    | LPAREN function_call      RPAREN
    | LPAREN arithmetic_expr    RPAREN
    | LPAREN comparison_expr    RPAREN
    | LPAREN logical_expr       RPAREN
    | LPAREN list_operation     RPAREN
    | LPAREN format_expr        RPAREN
    | LPAREN other_expressions  RPAREN
    | LPAREN s_expr*            RPAREN
    ;

// An atom is a number, symbol, string, or quoted expression
atom
    : NUMBER
    | SYMBOL
    | STRING
    | MULTIPLICATION
    | STAR2
    | STAR3
    | QUOTE s_expr
    ;

// Function call: (function-name arg1 arg2 ...)
function_call
    : SYMBOL s_expr*
    ;

// Special forms
special_form
    : if_form
    | defun_form
    | defparameter_form
    | let_form
    | lambda_form
    | quote_form
    | setq_form
    | funcall_form
    | cond_form
    | when_form
    | unless_form
    | evenp_form
    | oddp_form
    | case_form
    | progn_form
    | loop_form
    | return_form
    | mapcar_form
    | apply_form
    | member_form
    | assoc_form
    | remove_form
    | find_form
    | position_form
    | substring_form
    | concatenate_form
    | char_form
    | aref_form
    | sort_form
    | merge_form
    | subsetp_form
    | reduce_form
    | filter_form
    | every_form
    | some_form
    | null_form
    | typeof_form
    | eq_form
    | eql_form
    | equalp_form
    | typep_form
    | subtypep_form
    | coerce_form
    | declare_form
    | the_form
    | block_form
    | return_from_form
    | catch_form
    | throw_form
    | tagbody_form
    | go_form
    | defclass_form
    | defmethod_form
    | defgeneric_form
    | intersection_form
    | union_form
    | set_difference_form
    | signal_form
    | error_form
    | warn_form
    | break_form
    | continue_form
    | store_value_form
    | use_value_form
    | abort_form
    | typecase_form
    | etypecase_form
    | ctypecase_form
    | prog_form
    | prog1_form
    | prog2_form
    | do_form
    | dolist_form
    | dotimes_form
    | next_method_p_form
    | push_form
    | pop_form
    | fact_form
    | optional_form
    | reset_form
    | key_form
    | make_array_form
    | defstruct_form
    | setf_form
    | incf_form
    ;

// if special form: (if condition then-expr else-expr)
if_form
    : IF s_expr s_expr s_expr?          #IfSpecialForm
    ;

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
arithmetic_expr: (ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION) s_expr+    #ArithmeticExpression;

// Comparison expressions: (> x y), (= a b), etc.
comparison_expr: (LESS_THAN | LESS_EQUAL | EQUALS | EQUAL | GREATER_THAN | GREATER_EQUAL | NOT_EQUAL) s_expr+  #ComparisonExpression;

// Logical expressions: (and x y), (or a b), (not c)
logical_expr: (AND | OR | NOT) s_expr+                        #LogicalExpression;

// List operations: (car list), (cdr list), (cons x y), etc.
list_operation: (CAR | CDR | CONS | LIST | APPEND | LENGTH | REVERSE) s_expr+  #ListOperation;

format_expr
    : FORMAT (t_or_nil | stream) format_string (s_expr)*        #FormatExpression // Handles "format" with arguments
    ;

t_or_nil
    : T             // Output to terminal
    | NIL           // Return a formatted string
    ;

stream
    : SYMBOL        // A stream (e.g., file, terminal, or other destination)
    ;

format_string
    : STRING_WITH_DIRECTIVES (directive)* // Allows string followed by parsed directives
    ;

directive
    : DIRECTIVE_NEWLINE             // Newline
    | DIRECTIVE_OBJECT              // General Lisp object
    | DIRECTIVE_INTEGER             // Integer
    | DIRECTIVE_LITERAL_TILDE       // Literal `~`
    | DIRECTIVE_COND_NEWLINE        // Conditional newline
    | DIRECTIVE_JUSTIFY_START       // Justification start
    | DIRECTIVE_JUSTIFY_END         // Justification end
    | DIRECTIVE_AESTHETIC           // Aesthetic representation
    | DIRECTIVE_TABULATION          // Tabulation
    | DIRECTIVE_ROMAN               // Roman numeral representation
    | DIRECTIVE_FIXED               // Fixed-point format
    | DIRECTIVE_EXPONENTIAL         // Exponential format
    | DIRECTIVE_GENERAL             // General format (either ~F or ~E)
    | DIRECTIVE_PLURALIZE           // Pluralize ("s" for non-singular)
    | DIRECTIVE_CHARACTER           // Character representation
    | DIRECTIVE_CONDITIONAL         // Conditional expression
    | DIRECTIVE_COND_NEWLINE        // Conditional newline
    ;


// Other expressions: (print x), (eval s-expr), etc.
other_expressions
    : print_expr
    | eval_expr
    | load_expr
    | read_expr
    ;

// Rule for print expression
print_expr
    : PRINT s_expr+
    ;

// Rule for eval expression
eval_expr
    : EVAL s_expr                       #EvalExpression
    ;

// Rule for load expression
load_expr
    : LOAD STRING_WITH_DIRECTIVES       #LoadExpression
    ;

// Rule for read expression
read_expr
    : READ                              #ReadExpression
    ;

// Conditional expressions
cond_form: COND (s_expr s_expr+)+;
when_form: WHEN s_expr s_expr+;
unless_form: UNLESS s_expr s_expr+;

// Predicates
evenp_form: EVENP s_expr;
oddp_form: ODDP s_expr;

// Case expression
case_form: CASE s_expr (s_expr s_expr+)+ (OTHERWISE s_expr+)?;

// Control flow
progn_form: PROGN s_expr+;
loop_form: LOOP s_expr+;
return_form: RETURN s_expr?;

// List operations
mapcar_form: MAPCAR s_expr s_expr;
apply_form: APPLY s_expr s_expr;
member_form: MEMBER s_expr s_expr;
assoc_form: ASSOC s_expr s_expr;
remove_form: REMOVE s_expr s_expr;
find_form: FIND s_expr s_expr;
position_form: POSITION s_expr s_expr;
substring_form: SUBSTRING s_expr s_expr s_expr?;
concatenate_form: CONCATENATE s_expr s_expr+;
char_form: CHAR s_expr s_expr;
aref_form: AREF s_expr s_expr+;
sort_form: SORT s_expr s_expr;
merge_form: MERGE s_expr s_expr s_expr;
subsetp_form: SUBSETP s_expr s_expr;
reduce_form: REDUCE s_expr s_expr;
filter_form: FILTER s_expr s_expr;
every_form: EVERY s_expr s_expr;
some_form: SOME s_expr s_expr;
null_form: NULL s_expr;

// Type predicates and operations
typeof_form: TYPEOF s_expr;
eq_form: EQ s_expr s_expr;
eql_form: EQL s_expr s_expr;
equalp_form: EQUALP s_expr s_expr;
typep_form: TYPEP s_expr s_expr;
subtypep_form: SUBTYPEP s_expr s_expr;
coerce_form: COERCE s_expr s_expr;

// Declarations and blocks
declare_form: DECLARE s_expr+;
the_form: THE s_expr s_expr;
block_form: BLOCK s_expr s_expr+;
return_from_form: RETURN_FROM s_expr s_expr?;
catch_form: CATCH s_expr s_expr;
throw_form: THROW s_expr s_expr;
tagbody_form: TAGBODY s_expr+;
go_form: GO s_expr;

// Object-oriented programming
defclass_form: DEFCLASS SYMBOL s_expr+;
defmethod_form: DEFMETHOD SYMBOL s_expr+;
defgeneric_form: DEFGENERIC SYMBOL s_expr+;

// Set operations
intersection_form: INTERSECTION s_expr s_expr;
union_form: UNION s_expr s_expr;
set_difference_form: SET_DIFFERENCE s_expr s_expr;

// Error handling
signal_form: SIGNAL s_expr;
error_form: ERROR s_expr;
warn_form: WARN s_expr;
break_form: BREAK;
continue_form: CONTINUE;
store_value_form: STORE_VALUE s_expr;
use_value_form: USE_VALUE s_expr;
abort_form: ABORT;

// Type case expressions
typecase_form: TYPECASE s_expr (s_expr s_expr+)+;
etypecase_form: ETYPECASE s_expr (s_expr s_expr+)+;
ctypecase_form: CTYPECASE s_expr (s_expr s_expr+)+;

// Program constructs
prog_form: PROG s_expr+;
prog1_form: PROG1 s_expr+;
prog2_form: PROG2 s_expr+;
do_form: DO s_expr+;
dolist_form: DOLIST s_expr+;
dotimes_form: DOTIMES s_expr+;
next_method_p_form: NEXT_METHOD_P s_expr;

// Stack operations
push_form: PUSH s_expr s_expr;
pop_form: POP s_expr;

// Miscellaneous
fact_form: FACT s_expr;
optional_form: OPTIONAL s_expr+;
reset_form: RESET s_expr+;
key_form: KEY s_expr+;
make_array_form: MAKE_ARRAY s_expr+;
defstruct_form: DEFSTRUCT SYMBOL s_expr+;
setf_form: SETF s_expr s_expr;
incf_form: INCF s_expr s_expr?;