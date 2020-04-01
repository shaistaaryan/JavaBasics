package com.class19;

public class BastCar {
	String make, model, color;
	int year, door, wheels;

	public void printDetails() {

		System.out.println("I have " + year + " " + make + " " + model + " in " + color + " color");
		System.out.println(make + " has " + door + " doors and " + wheels + " wheels");
	}

	BastCar(String carMake, String carModel, String carColor, int carYear, int carDoor, int carWheels) {
		String make =carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		door = carDoor;
		wheels = carWheels;
	}

	public static void main(String[] args) {
		// once we create our own constructor compiler will not be creating a default
		// constructor for you!!
		// BestCar car=new BwstCar(); CE

		BastCar car = new BastCar("BMW", "m5", "Grey", 2020, 4, 5);
		car.make = "BMW";
		car.printDetails();

	
	}
}
