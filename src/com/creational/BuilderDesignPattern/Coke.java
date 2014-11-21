package com.creational.BuilderDesignPattern;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 12.0f;
	}

}
