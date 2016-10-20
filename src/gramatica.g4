grammar gramatica;

goal : mainClass ( classDeclaration )* EOF;

mainClass : 'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';

classDeclaration : 'class' IDENTIFIER ( 'extends' IDENTIFIER )? '{' ( varDeclaration )* ( methodDeclaration )* '}';

varDeclaration : type IDENTIFIER;

methodDeclaration : 'public' type IDENTIFIER '(' ( type IDENTIFIER ( ',' type IDENTIFIER )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';

type : 'int' '[' ']' | 'boolean' | 'int' | IDENTIFIER;

statement : '{' ( statement )* '}'
		  | 'if' '(' expression ')'
		  | 'while' '(' expression ')' statement
		  | 'System.out.println' '(' expression ')' ';'
		  | IDENTIFIER '=' expression ';'
		  | IDENTIFIER '[' expression ']' '=' expression ';';
		  
expression : expression ('&&'|'<'|'+'|'-'|'*') expression
		   | expression '[' expression ']'
		   | expression '.' 'length'
		   | expression '.' IDENTIFIER '(' ( expression ( ',' expression )* )? ')'
		   | INTEGER_LITERAL
		   | 'true'
		   | 'false'
		   | IDENTIFIER
		   | 'this'
		   | 'new' 'int' '[' expression ']'
		   | 'new' IDENTIFIER '(' ')'
		   | '!' expression
		   | '(' expression ')';
		   
IDENTIFIER : [a-zA-Z]+ ;

INTEGER_LITERAL : ('-')? [0-9]+;
		   

		   