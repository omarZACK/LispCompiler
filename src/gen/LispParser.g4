parser grammar LispParser;

options {
    tokenVocab = LispLexer;
}

lisp
    : expression+ EOF
    ;

expression
    : ID
    | NUMBERDEF
    | STRINGDEF
    | TRUE
    | FALSE
    | list
    ;


list
    : OPEN list_content CLOSE
    | OPEN CLOSE
    | literals_expression
    | hashed_expression
    ;

hashed_expression
    : hashvector_expression
    | complex_number_definetion
    ;

hashvector_expression
    : HASH OPEN expression* CLOSE
    ;

literals_expression
    : QUOTE expression
    | listForm
    ;


list_content
    : arithmetic_expression
    | comparison_expression
    | conditional_expression
    | logical_expression
    | loop_expression
    | return_expression
    | return_from_expression
    | block_expression
    | error_handling_expression
    | pre_define_function_expression
    | function_call_expression
    ;

number_expression
    : (numeric_expression | complex_expression | complex_number_definetion)
    ;

complex_number_definetion
    : HASHCOMPLEX OPEN NUMBERDEF NUMBERDEF? CLOSE
    ;

arithmetic_expression
    : ((MINUS | DIVIDE) number_expression+)
    | ((MULTIPLY | PLUS) number_expression*)
    | ((INCF |DECF) ID numeric_expression)
    | (EXP | CONJUGATE | ABS) number_expression
    | EXPT number_expression number_expression
    | LOG number_expression number_expression?
    | SQRT number_expression
    | ISQRT numeric_expression
    ;

comparison_expression
    : NUMEQUAL number_expression+
    | (LTE | GTE | LT | GT | MIN | MAX) (numeric_expression)+
    | EQUAL expression+
    ;

conditional_expression
    : if_expression
    | when_expression
    | cond_expression
    | case_expression
    | unless_expression
    ;

if_expression
    : IF expression expression (expression)?
    ;

when_expression
    : WHEN expression expression+
    ;

unless_expression
    : UNLESS expression expression+
    ;

cond_expression
    : COND cond_clause*
    ;

cond_clause
    : OPEN expression expression* CLOSE
    ;

case_expression
    : CASE expression case_clause* (default_clause)?
    ;

case_clause
    : OPEN value_list expression* CLOSE
    ;

value_list
    : (expression | nested_list)+
    ;

nested_list
    : OPEN value_list CLOSE
    ;

default_clause
    : OPEN OTHERWISE expression* CLOSE
    ;

logical_expression
    : (AND | OR) expression+
    | NOT expression
    | (LOGAND |LOGIOR |LOGXOR |LOGNOR |LOGEQV) numeric_expression*
    | (EVEN | ODD ) numeric_expression
    | ZERO number_expression
    | (BOUND) QUOTE ID
    | (TYPE) expression QUOTE types_expression
    ;

types: (FIXNUM|BIGNUM|RATION|FLOAT|COMPLEX|LIST|REAL|INTEGER|NUMBER|VECTOR|STRING|BOOLEAN|TRUE|FALSE);

types_expression
    : types
    | OPEN ((NOT types)| (AND | OR) types+) CLOSE
    ;

numeric_expression
    : OPEN arithmetic_expression CLOSE
    | ID
    | NUMBERDEF
    | PI
    | function_call_expression
    ;

loop_expression
    : dolist_expr
    | dotimes_expr
    | loop_expr
    ;


dolist_expr
    :
    DOLIST OPEN ID  listForm (expression | QUOTE expression)?  CLOSE expression*
    ;
dotimes_expr
    :
    DOTIMES OPEN (ID (ID|NUMBERDEF) expression?) CLOSE expression*
    ;

loop_expr
    : LOOP expression*
    | LOOP loop_clause (DO_LOOP expression*)?
    ;

loop_clause
    : FOR ID IN listForm
    | FOR ID ((FROM numeric_expression) (TO numeric_expression)? (BY numeric_expression)? |
              (TO numeric_expression) (BY numeric_expression)? | (BY numeric_expression))
    ;

listForm
    : QUOTE? ID
    | QUOTE OPEN (listForm_content| expression)* CLOSE
    ;

listForm_content
    :OPEN expression* CLOSE
    ;

return_expression
    :
    RETURN expression?
    ;

block_expression
    : BLOCK ID expression*
    ;

return_from_expression
    : RETURN_FROM ID (expression)?
    ;

error_handling_expression
    : error_expression
    ;

error_expression
    : ERROR format_string  expression*
    ;

pre_define_function_expression
    : print_function_expression
    | write_function_expression
    | complex_expression
    | float_expression
    | trigonometric_expression
    | hyperbolic_expression
    | lcm_expression
    | gcd_expression
    | ceil_expression
    | floor_expression
    | modulo_expression
    | format_expression
    | variable_definition_expression
    | constant_definition_expression
    | parameter_definition_expression
    | list_structure_expression
    | vector_expression
    | array_expression
    | cons_expression
    | setq_expression
    | function_definition
    | macro_definition_expression
    | structure_definition_expression
    | reverse_expression
    | append_expression
    | intersection_expression
    | subset_expression
    | member_expression
    | union_expression
    | difference_expression
    | character_function_expression
    | sort_expression
    | arrayref_expression
    | pop_expression
    | push_expression
    | progn_expression
    | let_expression
    ;

print_function_expression
    : (PRINT |PRIN1 | PRINC) expression
    ;

write_function_expression
    : WRITE expression
    ;

complex_expression
    : COMPLEX numeric_expression+
    ;

float_expression
    : FLOAT numeric_expression numeric_expression?
    ;

trigonometric_expression
    : (SIN | COS | ASIN | ACOS | TAN) number_expression
    | ATAN number_expression numeric_expression?
    ;

hyperbolic_expression
    : (SINH | COSH | TANH) number_expression
    ;

gcd_expression
    : GCD numeric_expression*
    ;

lcm_expression
    : LCM numeric_expression*
    ;

floor_expression
    : FLOOR numeric_expression numeric_expression
    ;

ceil_expression
    : CEIL numeric_expression numeric_expression
    ;

modulo_expression
    : MODULO numeric_expression numeric_expression
    ;

format_expression
     : FORMAT FORMAT_DESTINATION format_string expression*
     ;

format_string
     : FORMAT_STRING_BEGIN (FORMAT_STRING_CONTENT |string_format_argument)* FORMAT_STRING_END
     ;

string_format_argument
     : TILDE_F | TILDE_A | TILDE_S | TILDE_PERCENT | TILDE_AMPERSAND | TILDE_D
     ;

variable_definition_expression
    : VARIABLE ID expression expression? // second expression is documentation also known as explanation wrote by me omar wawy not chatgpt
    ;

constant_definition_expression
    : CONSTANT ID expression expression? // second expression is documentation also known as explanation wrote by me omar wawy not chatgpt
    ;

parameter_definition_expression
    : DEFPARAM ID expression expression? // second expression is documentation also known as explanation wrote by me omar wawy not chatgpt
    ;

list_structure_expression
    : LIST expression*
    ;

vector_expression
    : VECTOR expression*
    ;

array_expression
    : ARRAY (NUMBERDEF| listForm) array_key_argument*
    ;

array_key_argument
    : ELEMENTTYPE   types
    | INTIALELEMENT number_expression
    | INTIALCONTENT listForm
    | ADJUSTABLE (TRUE|FALSE)
    | FILLPOINTER   NUMBERDEF
    ;

cons_expression
    : CONS expression expression
    ;

setq_expression
    : SETQ (ID expression)*
    ;

function_definition
    : FUNCTION ID OPEN parameter_list CLOSE expression*
    ;

macro_definition_expression
    : MARCO ID OPEN parameter_list CLOSE expression*
    ;

structure_definition_expression
    : STRUCT ID (ID | structure_content)*
    ;

structure_content
    : OPEN ID expression (TYPEST types)* (READONLY (TRUE|FALSE))? CLOSE
    ;

parameter_list
    : (ID | (REST|OPTIONAL) ID)*
    ;

difference_expression
    : DIFFERENT listForm listForm
    ;

union_expression
    : UNION listForm listForm
    ;

member_expression
    : MEMBERS listForm listForm
    ;

subset_expression
    : SUBSET listForm listForm
    ;

intersection_expression
    : INTERSECT listForm listForm
    ;

append_expression
    : APPEND expression*
    ;

reverse_expression
    : REVERSE (listForm|STRINGDEF)
    ;

character_function_expression
    : CHARACTER STRINGDEF NUMBERDEF
    ;

sort_expression
    : SORT (ID|listForm|STRINGDEF) hashcomparison
    ;

hashcomparison
    : HASH QUOTE (LT |GT |LTE| GTE|NUMEQUAL | PLUS |MINUS |MULTIPLY |DIVIDE | MIN | MAX | APPEND |CONS |ABS|STRINGLESSP | CHARLESSP )
    ;

arrayref_expression
    : ARRAYREF ID numeric_expression*
    ;

push_expression
    : PUSH expression (ID|listForm)
    ;

pop_expression
    : POP (ID|listForm)
    ;

function_call_expression
    : function_call
    | function_call_function
    | apply_call_function
    | mapcar_function
    | lambda_function
    ;

function_call
    : ID expression*
    ;

function_call_function
    : FUNCALL ((HASH? QUOTE)? ID | hashcomparison | OPEN lambda_function CLOSE) expression*
    ;

apply_call_function
    : APPLY (HASH? QUOTE ID | hashcomparison| OPEN lambda_function CLOSE) listForm
    ;

mapcar_function
    : MAPCAR (HASH? QUOTE ID | hashcomparison| OPEN lambda_function CLOSE) listForm
    ;

progn_expression
    : PROGN OPEN parameter_list CLOSE expression*
    ;

let_expression
    : LET OPEN let_binding* CLOSE expression+
    ;

let_binding
    : OPEN ID expression? CLOSE
    ;

lambda_function
    : LAMBDA OPEN parameter_list CLOSE expression+
    ;