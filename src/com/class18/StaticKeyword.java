package com.class18;

public class StaticKeyword {

	// create template for a phone
	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	// Return type, name, parameters
	static void displayGeneralinfo() {
		System.out.println("We are building " + brand + " with touch screen=" + touchScreen);

	}
//instance members of class can access all static members 
	void displaySpecifications() {
		System.out.println("we are building phone with " + memory + "GB memory in " + color + " color");
	}

	public static void main(String[] args) {

		brand = "iPhone";
		touchScreen = true;
		// accessing instance variables in static
		StaticKeyword obj = new StaticKeyword();
		obj.color = "grey";
		obj.memory = 64;

		// accessing static method in a static way
		displayGeneralinfo();

		// accessing static method in non static way/through instance
		obj.displaySpecifications();

	}
}
