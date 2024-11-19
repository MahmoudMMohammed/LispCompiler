lexer grammar LispLexer;

// Tokens
LINE_COMMENT: ';' ~[\r\n]* -> skip;

COMMENT: ';;' ~[\r\n]* -> skip;

STRING: '"' ( ESC_SEQ | ~('\\'|'"') )* '"';

SYMBOL: [a-zA-Z*+/\-<>=?&$%!_][a-zA-Z0-9*+/\-<>=?&$%!_]*;

NUMBER: [0-9]+ ('.' [0-9]+)?;

WHITESPACE: [ \t\r\n]+ -> skip;

LPAREN: '(';

RPAREN: ')';

QUOTE: '\'';

BACKSLASH: '\\';

// Helper rules

fragment
ESC_SEQ: '\\' [btnfr"'\\];

ERROR: (~[a-zA-Z*+/\-<>=?&$%!_0-9()'\\ \t\r\n";])+ {System.err.println("Lexical error at line " + getLine() + ":" + getCharPositionInLine() + " - unrecognized sequence: " + getText());};