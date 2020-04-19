package com.class28;

import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		/*
		 * Create an arraylist of cars and retrieve all the values
		 *  using 3 different ways.
		 */

		ArrayList<String> cars =new ArrayList<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");
		cars.addAll(cars);
		
		System.out.println(cars);
		
		//2 way
		ArrayList<Double> car=new ArrayList<>();
		car.add(1.99);
		car.add(2.99);
		car.add(3.99);
		car.addAll(car);
		System.out.println(car);
		
		//replace element
		
		car.set(6, 10.99);
		System.out.println(car);
		
		//remove element
		
		
		
		
		
		
		
		
	}

}
