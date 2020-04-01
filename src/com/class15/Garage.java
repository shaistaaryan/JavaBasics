package com.class15;

public class Garage {

	public static void main(String[] args) {

		// build individual object
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "blue";

		System.out.println(car1.make);
		// accesing behavior/method of car with car2
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "m5";
		car2.year = 2019;
		car2.color = "pink";

		Car car3 = new Car();
		car3.make = "123";
		car3.speed = 200;

		// print BMW
		System.out.println(car1.make);

		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();

		// accesing behavior/method of car with car2
		car2.drive();
		car2.stop();
		car2.makeNoise();
		car2.accelerate();

		System.out.println("I  drive " + car2.color);
		// car2.breaking(
		;

		// I drive pink bmw

		System.out.println("I drive pink " + "" + car2.make);

	}

}
