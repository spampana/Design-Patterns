package com.creational.BuilderDesignPattern;

public class VegBurger extends Burger {

	@Override
	public String name() {
		
		return "veg Burger";
	}

	@Override
	public float price() {
		
		return 30.0f;
	}

}
