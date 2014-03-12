package com.factory.design.pattern;

public class GetObject{
	public Object getMyTravelObject(String travelType){
		Object travelObject = null;
		if("Bus".equalsIgnoreCase(travelType)){
		System.out.println("travel type:"+travelType);
		travelObject = new BusTravel();
		}else if("Train".equalsIgnoreCase(travelType)){
		System.out.println("travel type:"+travelType);
		travelObject = new TrainTravel();
		}
		return travelObject;
		}
		}