grammar PrimerPaso;

expression
    : element
    | OPERATOR_NEG expression
    | <assoc=right> expression OPERATOR_POW expression
    | expression ( OPERATOR_MULT | OPERATOR_DIV ) expression
    | expression(OPERATOR_ADD|OPERATOR_NEG)expression
    | expression(OPERATOR_GRT | OPERATOR_LOT | OPERATOR_GRE | OPERATOR_LOE | OPERATOR_EQU | OPERATOR_DIFF) expression
    | OPERATOR_NOT expression
    | expression OPERATOR_AND expression
    | expression OPERATOR_OR expression
    | (ID|STRING)string_sentence
    | (ID|ARRAY)array_sentence  
;

element
    : '(' expression ')'
    | func_call
    | literal
    ;


literal
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    | ID
    ;

id_decl: data_type ID;


//call a function  
func_call
    : ID '(' inputs? ')' (DELIMITER)? 
;

var_call
    : ID OPERATOR_ASSIG expression DELIMITER
;
inputs 
    : input  (',' input)*
;

input
    : expression
    ;


//Variable declarations

var_decl
    : id_decl OPERATOR_ASSIG expression DELIMITER
    ;


//Data types   
data_type
    : (type_int | type_char | type_bool | type_string| type_void)
; 

type_int: 'entero';
type_char: 'letra';
type_bool: 'bool';
type_string: 'hilera';
type_void: 'nada';


//Return
result 
    : RETURN expression DELIMITER
;


//Conditionals
if_conditional 
    : IF '(' expression ')' block (ELSE block)?
    ;


params
    : param (COMMA param )*
;

param
    : id_decl
    ;

//Block code
block
    : L_BRACE sentence* R_BRACE
;

//Do while cycle code

dowhile_def
    :
    do_def DOWHILE '('expression')' DELIMITER
    ;


//While cycle codeh

while_def
    :   
    WHILE  '('expression')' block
    ;


do_def
    :
    DO block 
    ;
for_def
    :
    FOR '(' expression ';' expression ';' expression ')' block
    ;

//Function definition
function_def
    :id_decl  '(' params? ')' block
; 

isDigit_def
    : FUNC_ISDIGIT '(' id_decl ')' DELIMITER
;


sortAsc_def
    : FUNC_SORTASC '('')' DELIMITER
;

sortDes_def
    : FUNC_SORTDES '('')' DELIMITER
;

higher_def
    : FUNC_HIGHER '('')' DELIMITER
;

less_def
    : FUNC_LESS '('')' DELIMITER
;

divide_def
    : FUNC_DIVIDE '(' expression  ',' expression ')' DELIMITER
;
change_def
    : FUNC_CHANGE'(' expression ',' expression ')' DELIMITER
;
 
replace_def
    : FUNC_REPLACE '(' expression ',' expression ')' DELIMITER
;

contains_def
    : FUNC_CONTAINS '(' expression ')' DELIMITER
;

isEmpty_def
    : FUNC_ISEMPTY '(' expression ')' DELIMITER
;

compareString_def
    : FUNC_COMPARESTRING '(' expression  ',' expression ')' DELIMITER
;



amount_def
    : FUNC_AMOUNT '(' expression ',' type_char ID')' DELIMITER
;

//Main function definition
main_def
    : data_type FUNC_MAIN  '(' ')' block
;

//Length function definition
length_def
    : FUNC_LEN '(' expression ')' DELIMITER
;

//Power function definition
power_def
    : FUNC_POW  '(' expression',' expression ')' DELIMITER
;


// Print function definition
print_def
    : FUNC_PRINT '(' expression ')' DELIMITER
;

uppercase_def
    : FUNC_UPPERCASE '('')'
;




program
    : function_def* main_def
    ;

sentence
    : var_decl 
    | if_conditional 
    | print_def 
    | power_def
    | result
    | dowhile_def
    | do_def
    | while_def
    | for_def
    | isDigit_def
    | replace_def
    | compareString_def
    | var_call
    | func_call
;

string_sentence
    : contains_def
    | change_def
    | uppercase_def
    | length_def
    | isEmpty_def
;

array_sentence
    : sortAsc_def
    | divide_def
    | sortDes_def
    | higher_def
    | less_def
    | amount_def
;
//Lexer Tokens//


OPERATOR_NOT
    :   '!'
    ;

OPERATOR_AND
    :   'y'
    ;

OPERATOR_OR
    :   'o'
    ;

OPERATOR_EQU
    :   '=='
    ;

OPERATOR_DIFF
    :   '!='
    ;

OPERATOR_GRT
    :   '>'
    ;

OPERATOR_LOT
    :   '<'
    ;

OPERATOR_GRE
    :   '<='
    ;

OPERATOR_LOE
    :   '>='
    ;
OPERATOR_POW
    :   '^'
    ;

OPERATOR_MULT
    :   '*'
    ;

OPERATOR_DIV
    :   '/'
    ;
OPERATOR_NEG
    :   '-'
    ;
OPERATOR_ADD
    :   '+'
    ;



L_PARENTHESIS: '(';
R_PARENTHESIS: ')';
L_BRACE: '{';
R_BRACE: '}';
L_BRACKET: '[';
R_BRACKET: ']';
DELIMITER: ';';
COMMA: ',';
FUNC_UPPERCASE: '.mayuscula';
FUNC_LEN: '.largo';
FUNC_AMOUNT: '.cantidad';
FUNC_TOSTRING: '.aHilera';
FUNC_TOINT: '.aNumero';
FUNC_PRINT: 'imprimir';
FUNC_MAIN: 'principal';
FUNC_POW: 'potencia';
FUNC_ISDIGIT: 'esDigito';
FUNC_SORTASC: '.ordenarAsc';
FUNC_SORTDES: '.ordenarDes';
FUNC_CHARAT: '.caracterEn';
FUNC_HIGHER: '.mayor';
FUNC_LESS : '.menor';
FUNC_DIVIDE: '.dividir';
FUNC_CHANGE: '.cambiar';
FUNC_REPLACE: '.reemplazar';
FUNC_CONTAINS: '.contiene';
FUNC_ISEMPTY: '.esVacia';
FUNC_COMPARESTRING: 'compararHileras';
FUNC_COMPARECHAR: 'compararLetra';
VOID: 'nada';
RETURN: 'retorna';
IF: 'si';
ELSE: 'sino';
DO: 'haga';
DOWHILE: 'mientras';
WHILE: 'por mientras';
FOR: 'para cada';
OPERATOR_ASSIG: '=';
fragment COMILLA: '\'';
ID: ([a-z]|[A-Z])'_'? ([a-z]|[A-Z])*;
INLINE_COMMENT: '&&' (.)*? '\n' -> skip;
WS : [' '\t\r\n]+ -> skip ;




CHARACTER
    : '\''(.)'\''
    ;

STRING
    : '"'(.)*? '"'
    ;

INTEGER: [0]|OPERATOR_NEG?([1-9][0-9]*);

BOOLEAN: ('verdadero'|'falso');

ARRAY: ID L_BRACKET [0]|([1-9][0-9]*) R_BRACKET;