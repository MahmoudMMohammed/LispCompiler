lexer grammar LispLexer;

// Skip tokens
LINE_COMMENT: ';' ~[\r\n]* -> skip;
COMMENT: ';;' ~[\r\n]* -> skip;
WHITESPACE: [ \t\r\n]+ -> skip;

// Specific tokens
LPAREN: '(';
RPAREN: ')';
QUOTE: '\'';
BACKSLASH: '\\';

STRING: '"' ( ESC_SEQ | ~('\\'|'"') )* '"';

NUMBER: [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;

// Operators
ADDITION: '+';
SUBTRACTION: '-';
MULTIPLICATION: '*';
DIVISION: '/';
LESS_THAN: '<';
LESS_EQUAL: '<=';
GREATER_THAN: '>';
GREATER_EQUAL: '>=';
EQUALS: '=';
NOT_EQUAL: '/=';

// Underscore (separate lexeme to include in identifiers)
UNDERSCORE: '_';

// Fragments for reusable components
fragment DIGIT: '0'..'9';
fragment LETTER: 'a'..'z' | 'A'..'Z';
fragment ESC_SEQ: '\\' [btnfr"'\\];

// Keywords
DEFUN: 'defun';
SETQ: 'setq';
LET: 'let';
IF: 'if';
EXP: 'exp';
EXPT: 'expt';
LAMBDA: 'lambda';
PROGN: 'progn';
LOOP: 'loop';
RETURN: 'return';
COND: 'cond';
EVENP: 'evenp';
ODDP: 'oddp';
CASE: 'case';
OTHERWISE: 'otherwise';
AND: 'and';
OR: 'or';
NOT: 'not';
QUOTEQ: 'quote';
DEFVAR: 'defvar';
DEFPARAMETER: 'defparameter';
DEFMACRO: 'defmacro';
FUNCTION: 'function';
MAPCAR: 'mapcar';
APPLY: 'apply';
FUNCALL: 'funcall';
EVAL: 'eval';
LOAD: 'load';
PRINT: 'print';
READ: 'read';
FORMAT: 'format';
CONS: 'cons';
CAR: 'car';
CDR: 'cdr';
LIST: 'list';
APPEND: 'append';
LENGTH: 'length';
REVERSE: 'reverse';
MEMBER: 'member';
ASSOC: 'assoc';
REMOVE: 'remove';
FIND: 'find';
POSITION: 'position';
SUBSTRING: 'substring';
CONCATENATE: 'concatenate';
CHAR: 'char';
AREF: 'aref';
SORT: 'sort';
MERGE: 'merge';
SUBSETP: 'subsetp';
REDUCE: 'reduce';
FILTER: 'filter';
EVERY: 'every';
SOME: 'some';
NULL: 'null';
TYPEOF: 'type_of';
EQUAL: 'equal';
EQ: 'eq';
EQL: 'eql';
EQUALP: 'equalp';
TYPEP: 'typep';
SUBTYPEP: 'subtypep';
COERCE: 'coerce';
DECLARE: 'declare';
THE: 'the';
BLOCK: 'block';
RETURN_FROM: 'return_from';
CATCH: 'catch';
THROW: 'throw';
TAGBODY: 'tagbody';
GO: 'go';
DEFCLASS: 'defclass';
DEFMETHOD: 'defmethod';
DEFGENERIC: 'defgeneric';
INTERSECTION: 'intersection';
UNION: 'union';
SET_DIFFERENCE: 'set-difference';
SIGNAL: 'signal';
ERROR: 'error';
WARN: 'warn';
BREAK: 'break';
CONTINUE: 'continue';
STORE_VALUE: 'store_value';
USE_VALUE: 'use_value';
ABORT: 'abort';
TYPECASE: 'typecase';
ETYPECASE: 'etypecase';
CTYPECASE: 'ctypecase';
PROG: 'prog';
PROG1: 'prog1';
PROG2: 'prog2';
DO: 'do';
DOLIST: 'dolist';
DOTIMES: 'dotimes';
NEXT_METHOD_P: 'next_method_p';
WHEN: 'when';
UNLESS: 'unless';
NIL: 'nil';
PUSH: 'push';
POP: 'pop';
FACT: 'fact';
OPTIONAL: '&optional';
RESET: '&rest';
KEY: '&key';
MAKE_ARRAY: 'make-array';
DEFSTRUCT: 'defstruct';
SETF: 'setf';
INCF: 'incf';
STAR2: '**';
STAR3: '***';

// Symbols and identifiers
SYMBOL: [a-zA-Z*+/\-<>=?&$%!_][a-zA-Z0-9*+/\-<>=?&$%!_]*;

// Error handling
UNEXPECTED_CHAR: . {System.err.println("Lexical error at line " + getLine() + ":" + getCharPositionInLine() + " - unrecognized character: " + getText());};