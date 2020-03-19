package com.class10;

public class MoreExmpleOfArray {

	public static void main(String[] args) {
		// Array are fixed in size
		// if we add more values than we declared---> ArrayIndexOutOfBoundsException
		String[] students = new String[3];
		students[0] = "Hassna";
		students[1] = "shaista";
		students[2] = "Aaron";
		
		// students[3]="kemal"; ---->during run time java machine will give
		// ArrayIndexOutOfBoundsException:
		// System.out.println(students[3]);
		
		//if we store less elemenet than we declared
		//comiler will add default values
		String[] inClassStudents = new String[5];
		
		inClassStudents[1] = "tetteh";
		inClassStudents[2] = "tetteh";
		inClassStudents[3] = "tetteh";
		inClassStudents[4] = "tetteh";
		//inClassStudents[5] = "tetteh";
		
		System.out.println(inClassStudents[0]);

	}

}
