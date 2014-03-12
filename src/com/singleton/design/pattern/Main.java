package com.singleton.design.pattern;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon ton = SingleTon.getSingleTonObject();
		System.out.println(ton.getProperties().get("name"));
		System.out.println(ton.getProperties().get("blogname"));
		System.out.println(ton.getProperties().get("email"));
		ton.getProperties().setProperty("email", "something@gmail.com");
		System.out.println(ton.getProperties().get("email"));

		}
}
