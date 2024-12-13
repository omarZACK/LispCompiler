lexer grammar LispLexer;
tokens{
    COMMENT,FSTRING_START,FSTRING_CONTENT,FSTRING_END
}
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
COMMENT_START: ';' -> pushMode(COMMENT_MODE) ,channel(HIDDEN),type(COMMENT);
MULTILINE_COMMENT_START: '#|' -> pushMode(COMMENT_MODE),channel(HIDDEN),type(COMMENT);
//----------------------------------------------------------------
// Boolean Values
//----------------------------------------------------------------
TRUE            : 't';//done
FALSE           : 'nil';//done

//----------------------------------------------------------------
// Arithmetic Operators
//----------------------------------------------------------------
PLUS            : '+';//done
MINUS           : '-';//done
MULTIPLY        : '*';//done
DIVIDE          : '/';//done

//----------------------------------------------------------------
// Comparison Operators
//----------------------------------------------------------------
NUMEQUAL        : '=';//done
EQUAL           : 'equal' | 'eq' | 'eql';//done
LT              : '<';//done
GT              : '>';//done
LTE             : '<=';//done
GTE             : '>=';//done

//----------------------------------------------------------------
// Logical Operators
//----------------------------------------------------------------
AND             : 'and';//done
OR              : 'or';//done
NOT             : 'not';//done

//----------------------------------------------------------------
// Mathematical Functions
//----------------------------------------------------------------
MIN             : 'min';//done
MAX             : 'max';//done
INCF            : 'incf';//done
DECF            : 'decf';//done
LOGAND          : 'logand';//done
LOGIOR          : 'logior';//done
LOGXOR          : 'logxor';//done
LOGNOR          : 'lognor';//done
LOGEQV          : 'logeqv';//done
EVEN            : 'evenp';//done
ODD             : 'oddp';//done
ZERO            : 'zerop';//done
BOUND           : 'boundp';//done
TYPE            : 'typep';//done
//----------------------------------------------------------------
// Control Structures
//----------------------------------------------------------------
COND            : 'cond';//done
IF              : 'if';//done
WHEN            : 'when';//done
UNLESS          : 'unless';//done
CASE            : 'case';//done
OTHERWISE       : 'otherwise';//done
DOLIST          : 'dolist';//done
DOTIMES         : 'dotimes';//done
LOOP            : 'loop';//done
FOR             : 'for';//done
DO_LOOP         : 'do';//done
BLOCK           : 'block';//done
RETURN          : 'return';//done
RETURN_FROM     : 'return-from';//done
IN              : 'in';//done
FROM            : 'from';//done
TO              : 'to';//done
BY              : 'by';//done

//----------------------------------------------------------------
// ERROR HANDLING Structures
//----------------------------------------------------------------
ERROR           : 'error';//
HANDLER_CASE    : 'handler-case';//
HANDLER_BIND    : 'handler-bind';//
RESTART_CASE    : 'restart-case';//
SIGNAL          : 'signal';//

//----------------------------------------------------------------
// Function and Variable Definitions  **
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
PRIN1           : 'prin1';
PRINC           : 'princ';
DEFPARAM        : 'defparameter';
VARIABLE        : 'defvar';
WRITE           : 'write';
FORMAT          : 'format' -> pushMode(FORMAT_MODE);
LET             : 'let';
PROGN           : 'prog';
CONSTANT        : 'defconstant';
LIST            : 'list';
CONS            : 'cons';

//----------------------------------------------------------------
// Numeric Types and Functions
//----------------------------------------------------------------
FIXNUM          : 'fixnum';//done Type
BIGNUM          : 'bignum';//done Type
NUMBER          : 'number';//done Type
REAL            : 'real';//done Type
INTEGER         : 'integer';//done Type
RATION          : 'ratio';//done Type
FLOAT           : 'float';//done Type and function
COMPLEX         : 'complex';//done Type and function
BOOLEAN         : 'boolean';//done Type
PI              : 'pi';//done function
SIN             : 'sin';//done function
COS             : 'cos';//done function
TAN             : 'tan';//done function
ASIN            : 'asin';//done function
ACOS            : 'acos';//done function
ATAN            : 'atan';//done function
SINH            : 'sinh';//done function
COSH            : 'cosh';//done function
TANH            : 'tanh';//done function
EXP             : 'exp';//done function
EXPT            : 'expt';//done function
SQRT            : 'sqrt';//done function
LOG             : 'log';//done function
CONJUGATE       : 'conjugate';//done function
ABS             : 'abs';//done function
GCD             : 'gcd';//done function
LCM             : 'lcm';//done function
ISQRT           : 'isqrt';//done function
FLOOR           : 'floor';//done function
CEIL            : 'ceiling';//done function
MODULO          : 'mod' | 'rem';//done function

//----------------------------------------------------------------
// List Operations  **
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
ID              : ('*'? (LETTER|'_') ('_'|LETTER | DIGIT | '-')* '*'?);
NUMBERDEF       : [+-]? (INTEGERNUMBERDEF | FLOATNUMBERDEF | SCIENCENUMBERDEF);
COMPLEXNUMBERDEF: '#c' WS* OPEN WS* NUMBERDEF WS+ NUMBERDEF WS* CLOSE;
STRINGDEF       : '"' (~["\\] | '\\' .)* '"';

//----------------------------------------------------------------
// Fragments
//----------------------------------------------------------------
fragment DIGIT           : [0-9];
fragment LETTER          : [a-zA-Z];
fragment INTEGERNUMBERDEF: DIGIT+;
fragment FLOATNUMBERDEF  : DIGIT+ '.' DIGIT+;
fragment SCIENCENUMBERDEF: DIGIT+ '.' DIGIT+ [eE] DIGIT? DIGIT+;
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