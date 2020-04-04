package com.class21;

public class Car {
	// super keyword - used to refer to immediate parent class instance memeber
	// a call using this() of current class constructor

	String make, model;

	public Car() {
		System.out.println("Iam parent class consturctor");
	}

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
}

class Mercedes extends Car {

	String sportModel;

	public Mercedes() {
		// super(); //compiler add super( by default
		System.out.println("I am child class cosntrutor");
	}

	public Mercedes(String make, String model, String sportModel) {
		//super(make, model);
		this.sportModel = sportModel;
	}

	public void display() {
		System.out.println("I have " + make + " " + model + " " + sportModel);
	}
}
