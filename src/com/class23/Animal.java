package com.class23;

public class Animal {
	
	public void eat() {
		System.out.println("Animal eat");
	}

	
	public void sleep() {
		System.out.println("Animal sleep");
	}
}

class Tiger extends Animal{
	
	public void eat() {
		System.out.println("Tiger eats a lot");
	}
	
	public void run() {
		System.out.println("tiger run very fast");
	}
}