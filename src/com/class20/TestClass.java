package com.class20;

public class TestClass {

	public static void main(String[] args) {

		Dog dog = new Dog();
		// access variables form own class
		dog.breed = "Husky";
		// access variables from parent class
		dog.color = "Gray";
		dog.fur = "Too much";
		dog.size = "Big";

		// access method from own class
		dog.bark();
		// access methods from parent class
		dog.bewild();
		dog.eat();
		dog.sleep();

		Animals animal = new Animals();
		//can access only features define within it 
		animal.color = "Any";
		animal.size = "Any";
		animal.fur = "Auy";

		animal.sleep();
		animal.eat();
		animal.bewild();
	}

}
