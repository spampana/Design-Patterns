package com.behavior.VisitorDesignPattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}