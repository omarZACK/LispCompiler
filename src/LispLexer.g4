lexer grammar LispLexer;

//----------------------------------------------------------------
// Basic Symbols
//----------------------------------------------------------------
OPEN            : '(';
CLOSE           : ')';
QUOTE           : '\'';

//----------------------------------------------------------------
// Whitespace and Comments
//----------------------------------------------------------------
WS: [ \t\r\n]+ -> skip;
COMMENT_START: ';' -> pushMode(COMMENT_MODE);
MULTILINE_COMMENT_START: '#|' -> pushMode(COMMENT_MODE);
STRING_START: '"' -> pushMode(STRING_MODE);
//----------------------------------------------------------------
// Boolean Values
//----------------------------------------------------------------
TRUE            : 't';
FALSE           : 'nil';

//----------------------------------------------------------------
// Arithmetic Operators
//----------------------------------------------------------------
PLUS            : '+';
MINUS           : '-';
MULTIPLY        : '*';
DIVIDE          : '/';

//----------------------------------------------------------------
// Comparison Operators
//----------------------------------------------------------------
EQUAL           : '=' | 'equal' | 'eq' | 'eql';
LT              : '<';
GT              : '>';
LTE             : '<=';
GTE             : '>=';

//----------------------------------------------------------------
// Logical Operators
//----------------------------------------------------------------
AND             : 'and';
OR              : 'or';
NOT             : 'not';

//----------------------------------------------------------------
// Mathematical Functions
//----------------------------------------------------------------
MIN             : 'min';
MAX             : 'max';
INCF            : 'incf';
DECF            : 'decf';
LOGAND          : 'logand';
LOGIOR          : 'logior';
LOGXOR          : 'logxor';
LOGNOR          : 'lognor';
LOGEQV          : 'logeqv';
EVEN            : 'evenp';

//----------------------------------------------------------------
// Control Structures
//----------------------------------------------------------------
COND            : 'cond';
IF              : 'if';
WHEN            : 'when';
UNLESS          : 'unless';
CASE            : 'case';
DOLIST          : 'dolist';
DOTIMES         : 'dotimes';
LOOP            : 'loop';
FOR             : 'for';
DO_LOOP         : 'do';
ERROR           : 'error';
BLOCK           : 'block';

//----------------------------------------------------------------
// Function and Variable Definitions
//----------------------------------------------------------------
FUNCALL         : 'funcall';
APPLY           : 'apply';
MAPCAR          : 'mapcar';
LAMBDA          : 'lambda';
VECTOR          : 'vector';
CHARACTER       : 'char';
STRING          : 'string';
ARRAY           : 'make-array';
MARCO           : 'defmacro';
SETQ            : 'setq';
FUNCTION        : 'defun';
STRUCT          : 'defstruct';
PRINT           : 'print';
DEFPARAM        : 'defparameter';
VARIABLE        : 'defvar';
WRITE           : 'write';
FORMAT          : 'format' -> pushMode(FORMAT_MODE);
LET             : 'let';
PROGN           : 'prog';
CONSTANT        : 'defconstant';
BOUNDP          : 'boundp';
LIST            : 'list';
CONS            : 'cons';

//----------------------------------------------------------------
// Numeric Types and Functions
//----------------------------------------------------------------
FIXNUM          : 'fixnum';
BIGNUM          : 'bignum';
RATION          : 'ratio';
FLOAT           : 'float';
COMPLEX         : 'complex';
SIN             : 'sin';
COS             : 'cos';
TAN             : 'tan';
ASIN            : 'asin';
ACOS            : 'acos';
ATAN            : 'atan';
SINH            : 'sinh';
COSH            : 'cosh';
TANH            : 'tanh';
EXP             : 'exp';
EXPT            : 'expt';
SQRT            : 'sqrt';
LOG             : 'log';
CONJUGATE       : 'conjugate';
ABS             : 'abs';
GCD             : 'gcd';
LCM             : 'lcm';
ISQRT           : 'isqrt';
FLOOR           : 'floor';
CEIL            : 'ceiling';
MODULO          : 'mod' | 'rem';

//----------------------------------------------------------------
// List Operations
//----------------------------------------------------------------
PUSH            : 'push';
POP             : 'pop';
ARRAYREF        : 'aref';
SORT            : 'sort';
APPEND          : 'append';
REVERSE         : 'reverse';
MEMBERS         : 'member';
SUBSET          : 'subsetp';
INTERSECT       : 'intersection';
UNION           : 'union';
DIFFERENT       : 'set-difference';

//----------------------------------------------------------------
// Identifiers and Numbers
//----------------------------------------------------------------
KEYWORD         : ':' LETTER + ('-' (LETTER+ | DIGIT+))*;
ID : ('*'? LETTER (LETTER | DIGIT | '-')* '*'?);

INTEGERNUMBERDEF: [+-]? DIGIT+;
FLOATNUMBERDEF  : [+-]? DIGIT+ '.' DIGIT+;
SCIENCENUMBERDEF: [+-]? DIGIT+ '.' DIGIT+ [eE] DIGIT? DIGIT+;
NUMBERDEF       : INTEGERNUMBERDEF | FLOATNUMBERDEF | SCIENCENUMBERDEF;
COMPLEXNUMBERDEF: '#c' OPEN NUMBERDEF (' ' + NUMBERDEF)* CLOSE;
STRINGDEF       : '"' (~["\\] | '\\' .)* '"';

//----------------------------------------------------------------
// Fragments
//----------------------------------------------------------------
fragment DIGIT  : [0-9];
fragment LETTER : [a-zA-Z];
fragment ESC    : '\\' [btnr"'\\];


//--------------------------------------------
// COMMENT_MODE (Handles all types of comments)
//--------------------------------------------
mode COMMENT_MODE;

MULTILINE_COMMENT: .*? '|#' -> skip,popMode;
SINGLELINECOMMENT: ~[\n]+ ->skip,popMode;

//--------------------------------------------
// STRING_MODE (Handles string literals)
//--------------------------------------------
mode STRING_MODE;

STRING_CONTENT: ~["\\] | '\\' .;
STRING_END: '"' -> popMode;

//--------------------------------------------
// STRING_MODE (Handles Formatted strings)
//--------------------------------------------
mode FORMAT_MODE;
FORMAT_STRING_BEGIN : '"' -> pushMode(STRING_FORMAT_MODE);
FORMAT_ARG : ~[")\t\r\n]+ | ID;

FORMAT_END : ')' -> popMode;


mode STRING_FORMAT_MODE;

TILDE_A : '~a';
TILDE_S : '~s';
TILDE_PERCENT : '~%';
TILDE_AMPERSAND : '~&';
TILDE_D : '~d';
TILDE_F : '~f';
FORMAT_STRING_CONTENT : ~["\\~]+;

FORMAT_STRING_END : '"' -> popMode;