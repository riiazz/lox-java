package com.lox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.lox.Expr.Assign;
import com.lox.Expr.Binary;
import com.lox.Expr.Call;
import com.lox.Expr.Grouping;
import com.lox.Expr.Literal;
import com.lox.Expr.Logical;
import com.lox.Expr.Unary;
import com.lox.Expr.Variable;
import com.lox.Stmt.Block;
import com.lox.Stmt.Expression;
import com.lox.Stmt.Function;
import com.lox.Stmt.If;
import com.lox.Stmt.Print;
import com.lox.Stmt.Return;
import com.lox.Stmt.Var;
import com.lox.Stmt.While;

class Resolver implements Expr.Visitor<Void>, Stmt.Visitor<Void> {
	private final Interpreter interpreter;
	private final Stack<Map<String, Boolean>> scopes = new Stack<>();

	Resolver(Interpreter interpreter) {
		this.interpreter = interpreter;
	}

	private void resolve(Stmt stmt) {
		stmt.accept(this);
	}

	private void resolve(Expr expr) {
		expr.accept(this);
	}

	void resolve(List<Stmt> statements) {
		for (Stmt statement : statements) {
			resolve(statement);
		}
	}

	private void beginScope() {
		scopes.push(new HashMap<String, Boolean>());
	}
	
	private void endScope() {
		scopes.pop();
	}

	@Override
	public Void visitBlockStmt(Block stmt) {
		beginScope();
		resolve(stmt.statements);
		endScope();
		return null;
	}

	@Override
	public Void visitExpressionStmt(Expression stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitExpressionStmt'");
	}

	@Override
	public Void visitFunctionStmt(Function stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitFunctionStmt'");
	}

	@Override
	public Void visitIfStmt(If stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitIfStmt'");
	}

	@Override
	public Void visitPrintStmt(Print stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitPrintStmt'");
	}

	@Override
	public Void visitReturnStmt(Return stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitReturnStmt'");
	}

	@Override
	public Void visitVarStmt(Var stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitVarStmt'");
	}

	@Override
	public Void visitWhileStmt(While stmt) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitWhileStmt'");
	}

	@Override
	public Void visitAssignExpr(Assign expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitAssignExpr'");
	}

	@Override
	public Void visitBinaryExpr(Binary expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitBinaryExpr'");
	}

	@Override
	public Void visitCallExpr(Call expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitCallExpr'");
	}

	@Override
	public Void visitGroupingExpr(Grouping expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitGroupingExpr'");
	}

	@Override
	public Void visitLiteralExpr(Literal expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitLiteralExpr'");
	}

	@Override
	public Void visitLogicalExpr(Logical expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitLogicalExpr'");
	}

	@Override
	public Void visitUnaryExpr(Unary expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitUnaryExpr'");
	}

	@Override
	public Void visitVariableExpr(Variable expr) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'visitVariableExpr'");
	}
}
