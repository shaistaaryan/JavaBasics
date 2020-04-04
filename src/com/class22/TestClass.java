package com.class22;

public class TestClass {

	public static void main(String[] args) {
		
		MathTeacher mt = new MathTeacher("brain","Quishbert");
		System.out.println(mt.name);
		
		MathTeacher mt1 = new MathTeacher("Sarmed","Halab");
		System.out.println(mt1.lastName);
		
		JavaTeacher jt = new JavaTeacher("Anna","Smith","Java 8");
		System.out.println(jt.name);
	}
}
