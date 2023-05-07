package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]
%{
    public String lexemas;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

{espacio} {return espacio;}
/* create */
( "create" ) {lexemas=yytext(); return create;}
/* database */
( "database" ) {lexemas=yytext(); return database;}
/* table */
( "table" ) {lexemas=yytext(); return table;}
/* use */
( "use" ) {lexemas=yytext(); return use;}
( "varchar" ) {lexemas=yytext(); return varchar;}
( "insert" ) {lexemas=yytext(); return insert;}
( "into" ) {lexemas=yytext(); return into;}
( "values" ) {lexemas=yytext(); return values;}
( "update" ) {lexemas=yytext(); return update;}
( "set" ) {lexemas=yytext(); return set;}
( "=" ) {lexemas=yytext(); return igual;}
( "where" ) {lexemas=yytext(); return where;}
( "delete" ) {lexemas=yytext(); return delete;}
( "from" ) {lexemas=yytext(); return from;}
( "int" ) {lexemas=yytext(); return inte;}
( "char" ) {lexemas=yytext(); return charac;}
( "select" ) {lexemas=yytext(); return select;}
( "drop" ) {lexemas=yytext(); return drop;}
/* P_coma */
";" {lexemas=yytext(); return P_coma;}
"\n" {lexemas=yytext(); return line;}
"(" {lexemas=yytext(); return P_apertura;}
")" {lexemas=yytext(); return P_cierre;}
"\"" {lexemas=yytext(); return comas;}
"*" {lexemas=yytext(); return est;}
"{" {lexemas=yytext(); return ll_apertura;}
"}" {lexemas=yytext(); return ll_cierre;}
"+" {lexemas=yytext(); return mas;}
"," {lexemas=yytext(); return coma;}


/* Identificador */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return INT;}
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}
 . {return ERROR;}