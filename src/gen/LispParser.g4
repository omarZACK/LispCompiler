parser grammar LispParser;

options {
    tokenVocab = LispLexer;
}

lisp
    : expression+ EOF                                                                           # LISP_EXPRESSION
    ;

expression
    : ID                                                                                        # VARIABLE
    | NUMBERDEF                                                                                 # NUMBER
    | string                                                                                    # STRING
    | TRUE                                                                                      # TRUE
    | FALSE                                                                                     # FALSE
    | list                                                                                      # LIST
    ;

list
    : OPEN list_content CLOSE                                                                   # NON_EMPTYLIST
    | OPEN CLOSE                                                                                # EMPTYLIST
    | literals_expression                                                                       # LITERALEXPRESSION
    | hashed_expression                                                                         # LISP_HASHED
    ;

hashed_expression
    : hashvector_expression                                                                     # LISP_HASHVECTOR
    | complex_number_definetion                                                                 # COMPLEXNUMBERDEFINITION
    ;

hashvector_expression
    : HASH OPEN expression* CLOSE                                                               # HASHVECTOR
    ;

literals_expression
    : QUOTE expression                                                                          # QUOTED_EXPRESSION
    | listForm                                                                                  # LISTFORM
    ;

list_content
    : arithmetic_expression                                                                     # LISP_ARITHMETIC
    | comparison_expression                                                                     # LISP_COMPARISON
    | conditional_expression                                                                    # LISP_CONDITIONAL
    | logical_expression                                                                        # LISP_LOGICAL
    | loop_expression                                                                           # LISP_LOOPS
    | return_expression                                                                         # LISP_RETURN
    | return_from_expression                                                                    # LISP_RETURNFROM
    | block_expression                                                                          # LISP_BLOCK
    | error_handling_expression                                                                 # LISP_ERRORHANDLING
    | pre_define_function_expression                                                            # LISP_PREDEFINEDFUNCTION
    | function_call_expression                                                                  # LISP_FUNCTIONCALL
    ;

number_expression
    : (numeric_expression | complex_expression | complex_number_definetion)                     # NUMBER_EXPRESSION
    ;

complex_number_definetion
    : HASHCOMPLEX OPEN NUMBERDEF NUMBERDEF? CLOSE                                               # HASHCOMPLEX_NUMBER_DEFINITION
    ;

arithmetic_expression
    : MINUS number_expression+                                                                  # SUBTRACTION
    | DIVIDE number_expression+                                                                 # DIVIDION
    | MULTIPLY number_expression*                                                               # MULTIPLICATION
    | PLUS number_expression*                                                                   # ADDITION
    | INCF ID numeric_expression                                                                # INCREMENT
    | DECF ID numeric_expression                                                                # DECREMENT
    | EXP number_expression                                                                     # EXPONENTIAL
    | ABS number_expression                                                                     # ABSOLUTE
    | CONJUGATE  number_expression                                                              # CONJUGATE
    | EXPT number_expression number_expression                                                  # EXPONENTIATION
    | LOG number_expression number_expression?                                                  # LOGARITHM
    | SQRT number_expression                                                                    # SQUARE_ROOT
    | ISQRT numeric_expression                                                                  # INTEGER_SQUARE_ROOT
    ;

comparison_expression
    : NUMEQUAL number_expression+                                                               # NUMERIC_EQUALITY
    | (LTE | GTE | LT | GT | MIN | MAX) (numeric_expression)+                                   # NUMERIC_COMPARISON
    | EQUAL expression+                                                                         # GENERAL_EQUALITY
    ;

conditional_expression
    : if_expression                                                                             # IF_CONDITION
    | when_expression                                                                           # WHEN_CONDITION
    | cond_expression                                                                           # COND_CONDITION
    | case_expression                                                                           # CASE_CONDITION
    | unless_expression                                                                         # UNLESS_CONDITION
    ;

if_expression
    : IF expression expression (expression)?                                                    # IF_EXPRESSION
    ;

when_expression
    : WHEN expression expression+                                                               # WHEN_EXPRESSION
    ;

unless_expression
    : UNLESS expression expression+                                                             # UNLESS_EXPRESSION
    ;

cond_expression
    : COND cond_clause*                                                                         # COND_EXPRESSION
    ;

cond_clause
    : OPEN expression expression* CLOSE                                                         # COND_CLAUSE
    ;

case_expression
    : CASE expression case_clause* (default_clause)?                                            # CASE_EXPRESSION
    ;

case_clause
    : OPEN value_list expression* CLOSE                                                         # CASE_CLAUSE
    ;

value_list
    : (expression | nested_list)+                                                               # VALUE_LIST
    ;

nested_list
    : OPEN value_list CLOSE                                                                     # NESTED_LIST
    ;

default_clause
    : OPEN OTHERWISE expression* CLOSE                                                          # DEFAULT_CLAUSE
    ;

logical_expression
    : (AND | OR) expression+                                                                    # LOGICAL_OPERATORS
    | NOT expression                                                                            # NOT_EXPRESSION
    | (LOGAND |LOGIOR |LOGXOR |LOGNOR |LOGEQV) numeric_expression*                              # LOGICAL_OPERATIONS
    | (EVEN | ODD ) numeric_expression                                                          # EVEN_ODD
    | ZERO number_expression                                                                    # ZERO_CHECK
    | (BOUND) QUOTE ID                                                                          # BOUND_CHECK
    | (TYPE) expression QUOTE types_expression                                                  # TYPE_CHECK
    ;

types: (FIXNUM|BIGNUM|RATION|FLOAT|COMPLEX|LIST|REAL|INTEGER|NUMBER|VECTOR|STRING|BOOLEAN|TRUE|FALSE);

types_expression
    : types                                                                                     # TYPE_EXPRESSION
    | OPEN ((NOT types)| (AND | OR) types+) CLOSE                                               # LOGICAL_TYPE_EXPRESSION
    ;

numeric_expression
    : OPEN arithmetic_expression CLOSE                                                          # NUMERIC_ARITHMETIC
    | ID                                                                                        # NUMERIC_IDENTIFIER
    | NUMBERDEF                                                                                 # NUMERIC_LITERAL
    | PI                                                                                        # PI
    | function_call_expression                                                                  # NUMERIC_FUNCTION_CALL
    ;

loop_expression
    : dolist_expr                                                                               # DOLIST_EXPRESSION
    | dotimes_expr                                                                              # DOTIMES_EXPRESSION
    | loop_expr                                                                                 # LOOP_EXPRESSION
    ;

dolist_expr
    : DOLIST OPEN ID  listForm (expression | QUOTE expression)?  CLOSE expression*              # DOLIST_LOOP
    ;

dotimes_expr
    : DOTIMES OPEN (ID (ID|NUMBERDEF) expression?) CLOSE expression*                            # DOTIMES_LOOP
    ;

loop_expr
    : LOOP expression*                                                                          # LOOP_STATEMENT
    | LOOP loop_clause (DO_LOOP expression*)?                                                   # LOOP_WITH_CLAUSES
    ;

loop_clause
    : FOR ID IN listForm                                                                        # FOR_LOOP_IN
    | FOR ID ((FROM numeric_expression) (TO numeric_expression)? (BY numeric_expression)? |
              (TO numeric_expression) (BY numeric_expression)? | (BY numeric_expression))       # FOR_LOOP_RANGE
    ;

listForm
    : QUOTE? ID                                                                                 # LIST_FORM_ID
    | QUOTE OPEN (listForm_content| expression)* CLOSE                                          # LIST_FORM_EXPRESSION
    ;

listForm_content
    : OPEN expression* CLOSE                                                                    # LIST_FORM_CONTENT
    ;

return_expression
    : RETURN expression?                                                                        # RETURN_EXPRESSION
    ;

block_expression
    : BLOCK ID expression*                                                                      # BLOCK_EXPRESSION
    ;

return_from_expression
    : RETURN_FROM ID (expression)?                                                              # RETURN_FROM_EXPRESSION
    ;

error_handling_expression
    : error_expression                                                                          # ERROR_EXPRESSION
    ;

error_expression
    : ERROR format_string expression*                                                           # ERROR_HANDLING
    ;

pre_define_function_expression
    : print_function_expression                                                                 # LISP_PRINT_FUNCTION
    | write_function_expression                                                                 # LISP_WRITE_FUNCTION
    | complex_expression                                                                        # LISP_COMPLEX
    | float_expression                                                                          # LISP_FLOAT
    | trigonometric_expression                                                                  # LISP_TRIGONOMETRIC
    | hyperbolic_expression                                                                     # LISP_HYPERBOLIC
    | lcm_expression                                                                            # LISP_LCM
    | gcd_expression                                                                            # LISP_GCD
    | ceil_expression                                                                           # LISP_CEIL
    | floor_expression                                                                          # LISP_FLOOR
    | modulo_expression                                                                         # LISP_MODULO
    | format_expression                                                                         # LISP_FORMAT
    | variable_definition_expression                                                            # LISP_VARIABLE_DEFINITION
    | constant_definition_expression                                                            # LISP_CONSTANT_DEFINITION
    | parameter_definition_expression                                                           # LISP_PARAMETER_DEFINITION
    | list_structure_expression                                                                 # LISP_LIST_STRUCTURE
    | vector_expression                                                                         # LISP_VECTOR
    | array_expression                                                                          # LISP_ARRAY
    | cons_expression                                                                           # LISP_CONS
    | setq_expression                                                                           # LISP_SETQ
    | function_definition                                                                       # LISP_FUNCTION_DEFINITION
    | macro_definition_expression                                                               # LISP_MACRO_DEFINITION
    | structure_definition_expression                                                           # LISP_STRUCTURE_DEFINITION
    | reverse_expression                                                                        # LISP_REVERSE
    | append_expression                                                                         # LISP_APPEND
    | intersection_expression                                                                   # LISP_INTERSECTION
    | subset_expression                                                                         # LISP_SUBSET
    | member_expression                                                                         # LISP_MEMBER
    | union_expression                                                                          # LISP_UNION
    | difference_expression                                                                     # LISP_DIFFERENCE
    | character_function_expression                                                             # LISP_CHARACTER_FUNCTION
    | sort_expression                                                                           # LISP_SORT
    | arrayref_expression                                                                       # LISP_ARRAY_REF
    | pop_expression                                                                            # LISP_POP
    | push_expression                                                                           # LISP_PUSH
    | progn_expression                                                                          # LISP_PROGN
    | let_expression                                                                            # LISP_LET
    ;

print_function_expression
    : (PRINT |PRIN1 | PRINC) expression                                                         # PRINT_FUNCTION_EXPRESSION
    ;

write_function_expression
    : WRITE expression                                                                          # WRITE_FUNCTION_EXPRESSION
    ;

complex_expression
    : COMPLEX numeric_expression+                                                               # COMPLEX_EXPRESSION
    ;

float_expression
    : FLOAT numeric_expression numeric_expression?                                              # FLOAT_EXPRESSION
    ;

trigonometric_expression
    : (SIN | COS | ASIN | ACOS | TAN) number_expression                                         # TRIGONOMETRIC_FUNCTION_EXPRESSION
    | ATAN number_expression numeric_expression?                                                # ARCTANGENT_FUNCTION_EXPRESSION
    ;

hyperbolic_expression
    : (SINH | COSH | TANH) number_expression                                                    # HYPERBOLIC_FUNCTION_EXPRESSION
    ;

gcd_expression
    : GCD numeric_expression*                                                                   # GCD_FUNCTION_EXPRESSION
    ;

lcm_expression
    : LCM numeric_expression*                                                                   # LCM_FUNCTION_EXPRESSION
    ;

floor_expression
    : FLOOR numeric_expression numeric_expression                                               # FLOOR_FUNCTION_EXPRESSION
    ;

ceil_expression
    : CEIL numeric_expression numeric_expression                                                # CEIL_FUNCTION_EXPRESSION
    ;

modulo_expression
    : MODULO numeric_expression numeric_expression                                              # MODULO_FUNCTION_EXPRESSION
    ;

format_expression
     : FORMAT FORMAT_DESTINATION format_string expression*                                      # FORMAT_STRING_EXPRESSION
     ;

format_string
     : STRING_BEGIN (STRING_CONTENT |string_format_argument| ESCAPE)* STRING_END                # FORMAT_STRING
     ;

string_format_argument
     : TILDE_F | TILDE_A | TILDE_S | TILDE_PERCENT | TILDE_AMPERSAND | TILDE_D                  # STRING_FORMAT_ARGUMENT
     ;

variable_definition_expression
    : VARIABLE ID expression expression?                                                        # VARIABLE_DEFINITION_EXPRESSION
    ;

constant_definition_expression
    : CONSTANT ID expression expression?                                                        # CONSTANT_DEFINITION_EXPRESSION
    ;

parameter_definition_expression
    : DEFPARAM ID expression expression?                                                        # PARAMETER_DEFINITION_EXPRESSION
    ;

list_structure_expression
    : LIST expression*                                                                          # LIST_STRUCTURE_EXPRESSION
    ;

vector_expression
    : VECTOR expression*                                                                        # VECTOR_STRUCTURE_EXPRESSION
    ;

array_expression
    : ARRAY (NUMBERDEF| listForm) array_key_argument*                                           # ARRAY_EXPRESSION
    ;

array_key_argument
    : ELEMENTTYPE   types                                                                       # ARRAY_ELEMENT_TYPE_EXPRESSION
    | INTIALELEMENT number_expression                                                           # ARRAY_INITIAL_ELEMENT_EXPRESSION
    | INTIALCONTENT listForm                                                                    # ARRAY_INITIAL_CONTENT_EXPRESSION
    | ADJUSTABLE (TRUE|FALSE)                                                                   # ADJUSTABLE_ARRAY_EXPRESSION
    | FILLPOINTER   NUMBERDEF                                                                   # FILL_POINTER_EXPRESSION
    ;

cons_expression
    : CONS expression expression                                                                # CONS_EXPRESSION_EXPRESSION
    ;

setq_expression
    : SETQ (ID expression)*                                                                     # SETQ_EXPRESSION_EXPRESSION
    ;

function_definition
    : FUNCTION ID OPEN parameter_list CLOSE expression*                                         # FUNCTION_DEFINITION_EXPRESSION
    ;

macro_definition_expression
    : MARCO ID OPEN parameter_list CLOSE expression*                                            # MACRO_DEFINITION_EXPRESSION
    ;

structure_definition_expression
    : STRUCT ID (ID | structure_content)*                                                       # STRUCTURE_DEFINITION_EXPRESSION
    ;

structure_content
    : OPEN ID expression (TYPEST types)* (READONLY (TRUE|FALSE))? CLOSE                         # STRUCTURE_CONTENT_EXPRESSION
    ;

parameter_list
    : (ID | (REST|OPTIONAL) ID)*                                                                # PARAMETER_LIST_EXPRESSION
    ;

difference_expression
    : DIFFERENT listForm listForm                                                               # DIFFERENCE_EXPRESSION_EXPRESSION
    ;

union_expression
    : UNION listForm listForm                                                                   # UNION_EXPRESSION_EXPRESSION
    ;

member_expression
    : MEMBERS listForm listForm                                                                 # MEMBER_EXPRESSION_EXPRESSION
    ;

subset_expression
    : SUBSET listForm listForm                                                                  # SUBSET_EXPRESSION_EXPRESSION
    ;

intersection_expression
    : INTERSECT listForm listForm                                                               # INTERSECTION_EXPRESSION_EXPRESSION
    ;

append_expression
    : APPEND expression*                                                                        # APPEND_EXPRESSION
    ;

reverse_expression
    : REVERSE (listForm|string)                                                                 # REVERSE_EXPRESSION
    ;

character_function_expression
    : CHARACTER string NUMBERDEF                                                                # CHARACTER_FUNCTION_EXPRESSION
    ;

sort_expression
    : SORT (ID|listForm|string) hashcomparison                                                  # SORT_EXPRESSION
    ;

hashcomparison
    : HASH QUOTE (LT |GT |LTE| GTE|NUMEQUAL | PLUS |MINUS |MULTIPLY |DIVIDE | MIN | MAX | APPEND |CONS |ABS|STRINGLESSP | CHARLESSP ) # HASH_COMPARISON
    ;

arrayref_expression
    : ARRAYREF ID numeric_expression*                                                           # ARRAY_REF_EXPRESSION
    ;

push_expression
    : PUSH expression (ID|listForm)                                                             # PUSH_EXPRESSION
    ;

pop_expression
    : POP (ID|listForm)                                                                         # POP_EXPRESSION
    ;

function_call_expression
    : function_call                                                                             # FUNCTION_CALL
    | function_call_function                                                                    # FUNCTION_CALL_FUNCTION
    | apply_call_function                                                                       # APPLY_CALL_FUNCTION
    | mapcar_function                                                                           # MAPCAR_FUNCTION
    | lambda_function                                                                           # LAMBDA_FUNCTION
    ;

function_call
    : ID expression*                                                                            # FUNCTION_CALL_EXPRESSION
    ;

function_call_function
    : FUNCALL ((HASH? QUOTE)? ID | hashcomparison | OPEN lambda_function CLOSE) expression*     # FUNCTION_CALL_FUNCTION_EXPRESSION
    ;

apply_call_function
    : APPLY (HASH? QUOTE ID | hashcomparison | OPEN lambda_function CLOSE) listForm             # APPLY_CALL_FUNCTION_EXPRESSION
    ;

mapcar_function
    : MAPCAR (HASH? QUOTE ID | hashcomparison | OPEN lambda_function CLOSE) listForm            # MAPCAR_FUNCTION_EXPRESSION
    ;

progn_expression
    : PROGN OPEN parameter_list CLOSE expression*                                               # PROGN_EXPRESSION
    ;

let_expression
    : LET OPEN let_binding* CLOSE expression+                                                   # LET_EXPRESSION
    ;

let_binding
    : OPEN ID expression? CLOSE                                                                 # LET_BINDING_EXPRESSION
    ;

lambda_function
    : LAMBDA OPEN parameter_list CLOSE expression+                                              # LAMBDA_FUNCTION_EXPRESSION
    ;

string
     : STRING_BEGIN (STRING_CONTENT | ESCAPE)* STRING_END                                       # STRING_EXPRESSION
     ;