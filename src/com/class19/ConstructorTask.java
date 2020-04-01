package com.class19;

public class ConstructorTask {

	/*
	 * 1.Write a program that will have a constructor: one with parameters and
	 * second without any parameters. Create a separate Test class where you will
	 * execute both of the constructors.
	 * 
	 * 2.Write a java program of Class Students that takes students name and 3
	 * subject grades. Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please use
	 * different names for instance and local variables.
	 */

	ConstructorTask() {

		System.out.println("I am  Constructor Task");
	}

	public static void main(String[] args) {

		ConstructorTask task = new ConstructorTask();
		System.out.println("Codded after Constructor Task");

		task.Task();

	}

	void Task() {
		System.out.println("Constructor Task done");
	}
}
