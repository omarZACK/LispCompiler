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
    | COMPLEXNUMBERDEF
    | TRUE
    | FALSE
    | list
    | literals_expression
    ;


list
    : OPEN list_content CLOSE
    | OPEN CLOSE
    ;

literals_expression
    : QUOTE expression
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
    ;

number_expression
    : (numeric_expression | complex_expression | COMPLEXNUMBERDEF)
    ;

arithmetic_expression
    : ((MINUS | DIVIDE) number_expression+)
    | ((MULTIPLY | PLUS) number_expression*)
    | ((INCF |DECF) ID numeric_expression)
    | (EXP | CONJUGATE | ABS) number_expression
    | (EXPT| LOG) number_expression number_expression
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
    : LOOP loop_clause* expression*
    ;

loop_clause
    : FOR ID IN listForm
    | FOR ID ((FROM numeric_expression) (TO numeric_expression)? (BY numeric_expression)? |
              (TO numeric_expression) (BY numeric_expression)? | (BY numeric_expression))
    ;

listForm
    : QUOTE? ID
    | QUOTE OPEN expression* CLOSE
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
    : ERROR STRINGDEF expression*
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
//    | format_function_expression
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