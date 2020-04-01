package com.class19;

public class TaskTwo {

	String model, color;
	int price, ram;

	public void TaskTwo() {

		System.out.println("I want a cumputer" + " in " + color + " color " + "" + model + " " + "in price " + price
				+ " in ram" + ram);
	}

	public static void main(String[] args) {
		TaskTwo two = new TaskTwo();
		two.model = "Apple";
		two.color = "gray";
		two.price = 1500;
		two.ram = 4;

		two.TaskTwo();

	}
}