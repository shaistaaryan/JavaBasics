package com.class19;

public class Constructor {
	/*
	 * CE: saying invalid modifier static Constructor() {
	 * 
	 * }
	 */

	public Constructor() {
		System.out.println("public Constructor");
	}

	Constructor(int num) {
		System.out.println("Defult Constructor");
	}

	protected Constructor(int num, int num1) {
		System.out.println("Proteced Constructor");
	}

	private Constructor(String str) {
		System.out.println("private Constructor");
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(12);
		Constructor obj2 = new Constructor(12, 13);
		Constructor obj3 = new Constructor("Hi");
	}
}
