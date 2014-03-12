package com.frontController.design.pattern;

public class Main {
	public static void main(String[] args) {
	      FrontController frontController = new FrontController();
	      frontController.dispatchRequest("HOME");
	      frontController.dispatchRequest("STUDENT");
	   }
}
/*


You want to avoid duplicate control logic.
You want to apply common logic to multiple requests.
You want to separate system processing logic from the view.
You want to centralize controlled access points into your system.


*/