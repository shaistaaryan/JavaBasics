package com.class20;

public class Student {

	/*
	 * Write program as a Student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method
	 */

	String name, address;

	Student(String name, String address) {

		this.name = name;
		this.address = address;

	}

	void displayInfo() {
		System.out.println(this.name + " john " + this.address + " Fairfax");

	}
	public static void main(String[] args) {
		
		Student st = new Student("Student","lives in 9897 le-H");
		
		st.displayInfo();
		
	}

}
