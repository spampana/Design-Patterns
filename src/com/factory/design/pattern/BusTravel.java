package com.factory.design.pattern;

public class BusTravel {
	
		String passengerName;
		String origin;
		String destination;

		public boolean confirmTravel(){
		if(this.passengerName!=null && this.origin!=null && this.destination!=null){
		//DB query here to check seats availability and if it return true
		System.out.println("Passenger choose Bus Travel");
		return true;
		}else{
		//DB query here to check seats availability and if it return false
		return false;
		}
		}
		public String getPassengerName() {
		return passengerName;
		}
		public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
		}
		public String getDestination() {
		return destination;
		}
		public void setDestination(String destination) {
		this.destination = destination;
		}
		public String getOrigin() {
		return origin;
		}
		public void setOrigin(String origin) {
		this.origin = origin;
		}
		public String toString(){
		return "BusObject";
		}
		}

