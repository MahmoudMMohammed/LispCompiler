lexer grammar LispLexer;

// Keywords: Separate lexeme for each keyword
DEFUN: 'defun';       // Function definition
IF: 'if';             // Conditional
LAMBDA: 'lambda';     // Anonymous function
LET: 'let';           // Local variable binding
QUOTE: 'quote';       // Quote expression
SETQ: 'setq';         // Assign value to variable
CONS: 'cons';         // Construct list
CAR: 'car';           // First element of a list
CDR: 'cdr';           // Rest of the list
LIST: 'list';         // Create a list

// Underscore (separate lexeme to include in identifiers)
UNDERSCORE: '_'; // Underscore as a valid lexeme

// Identifiers: User-defined variables and functions
IDENTIFIER: (LETTER | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE)*; // Combines letters, digits, and underscores

// Parentheses for grouping
OP: '(';  // Opening parenthesis
CP: ')';  // Closing parenthesis

// Operators
PLUS: '+';        // Addition
MINUS: '-';       // Subtraction
MULT: '*';        // Multiplication
DIV: '/';         // Division
LT: '<';          // Less than
LE: '<=';         // Less than or equal to
GT: '>';          // Greater than
GE: '>=';         // Greater than or equal to
EQ: '=';          // Equality

// Numbers
NUMBER: DIGIT+ ('.' DIGIT+)?; // Matches integers and floating-point numbers

// Strings
STRING: '"' .*? '"';  // Strings enclosed in double quotes

// Boolean Values
BOOLEAN: '#t' | '#f'; // Boolean literals (#t for true, #f for false)

// Comments
COMMENT: ';' ~[\r\n]* -> skip; // Single-line comments, ignored during tokenization

// Whitespace
WHITESPACE: [ \t\r\n]+ -> skip; // Skip spaces, tabs, and newlines

// Invalid Characters (Lexical Errors)
LEXICAL_ERROR: .; // Matches any unrecognized character

// Fragments for reusable components
fragment DIGIT: '0'..'9';          // Numeric digits
fragment LETTER: 'a'..'z' | 'A'..'Z'; // Alphabetic characters (lowercase and uppercase)
fragment SYMBOL_CHAR: [!#$%&'*+,-./:;<=>?@^`|~]; // Special characters for symbols
