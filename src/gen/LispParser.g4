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
    | COMPLEXNUMBERDEF
    | STRINGDEF
    | TRUE
    | FALSE
    | list
    ;

list
    : OPEN list_content CLOSE
    | OPEN CLOSE
    ;


list_content
    : arithmetic_expression
    | comparison_expression
    | conditional_expression
    | logical_expression
    ;


arithmetic_expression
    : (PLUS | MINUS | MULTIPLY | DIVIDE) expression+
    ;

comparison_expression
    : (EQUAL | LTE | GTE | LT | GT) expression+
    ;

conditional_expression
    : if_expression
    | when_expression
    | cond_expression
    | case_expression
    ;

if_expression
    : IF expression expression (expression)?
    ;

when_expression
    : WHEN expression expression+
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
    ;


