package com.creational.BuilderPattern;

public abstract class ColdDrink implements Item{

	
	public abstract String name() ;
	
	@Override
	public Packing packing() {
		
		return new Bottle();
	}

	public abstract float price() ;
	

}
