package Analizador;
import java_cup.runtime.Symbol;
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r \n]
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Salto, tabulacion y espacio */
( "\\n" | "\\t"  | "\\n") {/*Ignore*/}


/* Punto y coma */
(";") {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

("int") {return new Symbol(sym.inte, yychar, yyline, yytext());}
("char") {return new Symbol(sym.charac, yychar, yyline, yytext());}

("=") {return new Symbol(sym.igual, yychar, yyline, yytext());}


(",") {return new Symbol(sym.coma, yychar, yyline, yytext());}
("{") {return new Symbol(sym.ll_apertura, yychar, yyline, yytext());}
("}") {return new Symbol(sym.ll_cierre, yychar, yyline, yytext());}
(",") {return new Symbol(sym.coma, yychar, yyline, yytext());}
("+") {return new Symbol(sym.mas, yychar, yyline, yytext());}
("'") {return new Symbol(sym.comillas, yychar, yyline, yytext());}
/* Salto, tabulacion y espacio */
( "\\n" | "\\t" ) {/*Ignore*/}



/* CADENA 

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

*/

("(-"{D}+")")|{D}+ {return new Symbol(sym.INT, yychar, yyline, yytext());}


/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
 . {return new Symbol(sym.error, yychar, yyline, yytext());}