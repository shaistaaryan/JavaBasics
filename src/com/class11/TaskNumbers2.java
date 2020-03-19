package com.class11;

public class TaskNumbers2 {

	 //why we need array .. to store multiple value.
	
	public static void main(String[] args) {
		// 2.Create an array on integers and calculate the sum of all
		// integer elements in an array.

		int[] numbers = { 27, 43, 87, 322, 6, 32, 65, 85, 54, };
		int sum = 0;

		for (int i : numbers) {
			sum += i;
		}
		System.out.println("The sum of the numbers in this array is :" + sum);
		
		System.out.println("Using another loop----------------");
		
		int sum1 = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum1 += numbers[i];
		}
		System.out.println("The sum of the numbres in array is :" + sum1);

	}

}
