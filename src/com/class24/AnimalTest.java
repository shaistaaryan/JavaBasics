package com.class24;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Bird();
		animal.sleep();
		animal.whoAmI();
		Bird.whoAmI();
	}
}
