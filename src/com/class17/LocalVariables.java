package com.class17;

public class LocalVariables {

	void nameInside() {

		String name = "john"; // local variable taht visisable only withn method it was declared
//	    System.out.println(obj);
	}

	public static void main(String[] args) {

		// System.out.println(name); CE: name be visiable to another method
		// since its scope only within nameInside method1

		LocalVariables obj = new LocalVariables();
		obj.nameInside();

		boolean flag = true;

		if (flag) {
			String answer = "Yes";
		}

		// System.out.println(answer); CE: scope of variable answer is not vi
	for(int i =1; i<=5; i++) {
		System.out.println(i);
	}
	
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	}
	
	String name="Gulbahar";
	}

}
