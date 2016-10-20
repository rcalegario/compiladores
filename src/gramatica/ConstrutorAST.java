package gramatica;

import java.util.List;

import org.antlr.v4.runtime.tree.*;

import ast.*;
import gramatica.gramaticaParser.*;

public class ConstrutorAST {

	public Program visitGoal(GoalContext gc){
		MainClass main = this.visitMain(gc.mainClass());
		ClassDeclList cdList = this.visitClassDeclList(gc.classDeclaration());
		return new Program(main, cdList);
	}

	private ClassDeclList visitClassDeclList(List<ClassDeclarationContext> listCD) {
		ClassDeclList cdList = new ClassDeclList();
		for(int i = 0; i < listCD.size(); i++){
			cdList.addElement(this.visitClassDecl(listCD.get(i)));
		}
		return cdList;
	}

	private ClassDecl visitClassDecl(ClassDeclarationContext cdc) {
		List<TerminalNode> tokens = cdc.IDENTIFIER();
		ClassDecl cd;
		if(tokens.size() < 2){
			cd = new ClassDeclSimple(new Identifier(tokens.get(0).toString()),this.visitVarDeclList(cdc.varDeclaration()), this.visitMethodDeclList(cdc.methodDeclaration()));
		}else{
		    cd = new ClassDeclExtends(new Identifier(tokens.get(0).toString()),new Identifier(tokens.get(3).toString()),this.visitVarDeclList(cdc.varDeclaration()), this.visitMethodDeclList(cdc.methodDeclaration()));
		}
		return cd;
	}

	private MethodDeclList visitMethodDeclList(List<MethodDeclarationContext> md) {
		MethodDeclList mdList = new MethodDeclList();
		for(int i = 0; i < md.size(); i++){
			mdList.addElement(this.visitMethodDecl(md.get(i)));
		}
		return mdList;
	}

	private MethodDecl visitMethodDecl(MethodDeclarationContext mdc) {
		List<TypeContext> type = mdc.type();
		List<TerminalNode> tokens = mdc.IDENTIFIER();
		FormalList args = new FormalList();
		Type tipoMetodo = this.visitType(type.get(0));
		Identifier nomeMetodo = new Identifier(tokens.get(0).toString());
		for(int i = 1; i< type.size();i++){
			args.addElement(new Formal(this.visitType(type.get(i)),new Identifier(tokens.get(i).toString())));
		}
		VarDeclList variaveis = this.visitVarDeclList(mdc.varDeclaration());
		StatementList statements = this.visitStatementList(mdc.statement());
		Exp exp = this.visitExp(mdc.expression());
		return new MethodDecl(tipoMetodo,nomeMetodo,args,variaveis,statements,exp);
	}

	private Exp visitExp(ExpressionContext expression) {
		// TODO Auto-generated method stub
		return null;
	}

	private StatementList visitStatementList(List<StatementContext> statement) {
		// TODO Auto-generated method stub
		return null;
	}

	private Type visitType(TypeContext typeContext) {
		// TODO Auto-generated method stub
		return null;
	}

	private VarDeclList visitVarDeclList(List<VarDeclarationContext> varDeclaration) {
		// TODO Auto-generated method stub
		return null;
	}

	private MainClass visitMain(MainClassContext mainClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
