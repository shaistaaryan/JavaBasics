package com.class18_1;

public class TaskOne1 {

	
		/*
		 * 1. Create a method that will accept an array as parameters and will return a sum
		 * of all elements from that array. Method should be visibly only within same
		 * package and accessible by the creating an instance of the class.
	    */


		static int array(int [] x) {
			int sum=0;
			for (int i=0;i<x.length;i++) {
				sum=sum+x[i];
			}
			return sum;
		}
		public static void main(String[] args) {
			
			TaskOne1 task1=new TaskOne1();
			int[] y= {2,6,12,20};
			int arr=task1.array(y);
			System.out.println("Sum of array element is "+arr);
		}
	}
	

	
