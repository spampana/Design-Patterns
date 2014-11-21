package com.behavior.ObserverDesignPattern;

public abstract class Observer {
	
	protected Subject subject;

	public abstract void update();
}