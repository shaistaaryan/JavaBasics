package com.class24;   //exmpls of polymoreohism

public class Car {

	String make;

	public Car(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("I have " + make);
	}

	public void start() {
		System.out.println(make + " starts by turing key");
	}
}

class BMW extends Car {
	public BMW(String make) {
		super(make);
	}

	public void start() {
		System.out.println(make + " starts by pushing button");
	}
}

class Mercedes extends Car {
	public Mercedes(String make) {
		super(make);
	}
}

class Tesla extends Car {

	public Tesla(String make) {
		super(make);
	}

}

class Honda extends Car {

	public Honda(String make) {
		super(make);
	}
}
