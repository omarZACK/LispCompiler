lexer grammar LispLexer;
tokens{
    COMMENT
}
//----------------------------------------------------------------
// Basic Symbols
//----------------------------------------------------------------
OPEN            : '(';
CLOSE           : ')';
QUOTE           : '\'';
HASH            : '#';
HASHCOMPLEX     : HASH'c';

REST            : '&rest';
OPTIONAL        : '&optional';

//----------------------------------------------------------------
// Whitespace and Comments
//----------------------------------------------------------------
WS: [ \t\r\n]+ -> channel(HIDDEN);
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
ERROR           : 'error';//done
//----------------------------------------------------------------
// Function and Variable Definitions  **
//----------------------------------------------------------------
FUNCALL         : 'funcall';//done
APPLY           : 'apply';//done
MAPCAR          : 'mapcar';//done
LAMBDA          : 'lambda';//done
VECTOR          : 'vector';//done
CHARACTER       : 'char';//done
ARRAY           : 'make-array';//done
MARCO           : 'defmacro';//done
SETQ            : 'setq';//done
FUNCTION        : 'defun';//done
STRUCT          : 'defstruct';//done
PRINT           : 'print';//done
PRIN1           : 'prin1';//done
PRINC           : 'princ';//done
DEFPARAM        : 'defparameter';//done
VARIABLE        : 'defvar';//done
WRITE           : 'write';//done
FORMAT          : 'format' -> pushMode(STRING_FORMAT_MODE);//done
LET             : 'let';//done
PROGN           : 'prog';//done
CONSTANT        : 'defconstant';//done
LIST            : 'list';//done
CONS            : 'cons';//done

//----------------------------------------------------------------
// Numeric Types and Functions
//----------------------------------------------------------------
FIXNUM          : 'fixnum';//done Type
CHARLESSP       : 'char-lessp';//done Type
STRINGLESSP     : 'string-lessp';//done Type
STRING          : 'string';//done Type
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
PUSH            : 'push';//done
POP             : 'pop';//done
ARRAYREF        : 'aref';//done
SORT            : 'sort';//done
APPEND          : 'append';//done
REVERSE         : 'reverse';//done
MEMBERS         : 'member';//done
SUBSET          : 'subsetp';//done
INTERSECT       : 'intersection';//done
UNION           : 'union';//done
DIFFERENT       : 'set-difference';//done

//----------------------------------------------------------------
// Identifiers and Numbers
//----------------------------------------------------------------
NUMBERDEF       : [+-]? (INTEGERNUMBERDEF | FLOATNUMBERDEF | SCIENCENUMBERDEF);
ID              : ('*'? (LETTER|'_') ('_'|LETTER | DIGIT | '-')* '*'?);
STRINGDEF       : '"' (~["\\] | '\\' .)* '"';

//----------------------------------------------------------------
// Keyword Arguments
//----------------------------------------------------------------

//make-array keyword argument
ELEMENTTYPE   : COLON 'element-type';
INTIALELEMENT : COLON 'initial-element';
INTIALCONTENT : COLON 'initial-contents';
ADJUSTABLE    : COLON 'adjustable';
FILLPOINTER   : COLON 'fill-pointer';
//defstrucr keyword argument
TYPEST            : COLON 'type';
READONLY            : COLON 'read-only';

//----------------------------------------------------------------

//----------------------------------------------------------------
// Fragments
//----------------------------------------------------------------
fragment DIGIT           : [0-9];
fragment LETTER          : [a-zA-Z];
fragment INTEGERNUMBERDEF: DIGIT+;
fragment FLOATNUMBERDEF  : (DIGIT+ '.' DIGIT*) | (DIGIT* '.' DIGIT+);
fragment SCIENCENUMBERDEF: (INTEGERNUMBERDEF | FLOATNUMBERDEF) [eE] DIGIT? DIGIT+;
fragment COLON           : ':';
//--------------------------------------------
// COMMENT_MODE (Handles all types of comments)
//--------------------------------------------
mode COMMENT_MODE;

MULTILINE_COMMENT: .*? '|#' -> skip,popMode;
SINGLELINECOMMENT: ~[\n]+ ->skip,popMode;

//--------------------------------------------
// STRING_MODE (Handles Formatted strings)
//--------------------------------------------

mode STRING_FORMAT_MODE;
FORMAT_DESTINATION  : TRUE| FALSE;
FORMAT_STRING_BEGIN : '"' -> pushMode(FORMAT_STRING_CONTENT_MODE);

mode FORMAT_STRING_CONTENT_MODE;
TILDE_F             : '~' DIGIT* 'f';
TILDE_A             : '~a';
TILDE_S             : '~s';
TILDE_PERCENT       : '~%';
TILDE_AMPERSAND     : '~&';
TILDE_D             : '~' DIGIT* 'd';
FORMAT_STRING_CONTENT : ~["\\~]+ | '\\' .;
FORMAT_STRING_END : '"' -> popMode, popMode;