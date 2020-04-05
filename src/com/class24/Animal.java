package com.class24;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}

	public void sleep() {
		System.out.println("Animal sleep");
	}
}

class Bird extends Animal {

	// we are not overriding 
	public static void whoAmI() {
		System.out.println("I am a brid ");
	}

	public void sleep() {
		System.out.println("Brid can sleep");
	}
}