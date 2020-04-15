package com.class26;

public interface Drivable {// interface in java is the collation of public,
							// static,final,
	// compiler by default adds public static final
	boolean MOVE_FAST = true;

	// compiler by default adds public abstract
	void drive();
}

abstract class Vehicle {

	abstract void stop();
}

//Achieving multiple inheritance
class Cars extends Vehicle implements Drivable {

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");

	}

}