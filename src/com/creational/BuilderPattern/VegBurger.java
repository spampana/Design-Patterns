package com.creational.BuilderPattern;

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
