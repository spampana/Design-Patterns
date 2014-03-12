package com.factory.design.pattern;

public class MyTravel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetObject getObject = new GetObject();
		Object travelType = getObject.getMyTravelObject(args[0]);
		System.out.println("Travel request type :"+args[0]);


		if(travelType instanceof BusTravel){
		System.out.println("Yes Bus object instatiated");
		}else if(travelType instanceof TrainTravel){
		System.out.println("Yes Train object instatiated");
		}else{
		System.out.println("Pass the travel parameter correctly");
		}
	}
}
/*
 Factory Design pattern explains about how get the desired object 
 from the factory based on the requirement.
 
MyTravel : is the client class which take the travel type like : Bus or Train or Flight
GetObject : is a generic class which will instantiate the Bus or Train and it returns the             
                  generic object.
BusTravel : is POJO with the passenger name, Origin, destination parameters
TrainTravel : is the POJO with the passenger name, Origin , destination parameters.
*/