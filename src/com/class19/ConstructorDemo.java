package com.class19;

public class ConstructorDemo {

	static String str = "Hello";

	ConstructorDemo() {
		System.out.println("I am your construtor");
		System.out.println("I am your argument costructor");
	}

	ConstructorDemo(String str) {
		System.out.println("I am a conustructor with 1 String pramaeter " + str);
	}

	ConstructorDemo(int num) {
		System.out.println("I am a conustructor with 1 unteger value="+num);
	}
	
	ConstructorDemo(String str, int num){
		System.out.println("I am a constructor with 2 parameters:"+str+"&"+num);
	}
	
	void ConstructorDemo() {//as soon as we add return type --> IT BECOMES method
		System.out.println("I do not knwo who am i");
	}
	
	public static void main(String[] args) {

		// ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj = new ConstructorDemo("Yes", 13);

		ConstructorDemo obj1 = new ConstructorDemo();
		obj1.ConstructorDemo();
	}
}
