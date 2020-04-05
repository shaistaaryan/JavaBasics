package com.class23;

public class Degree {

	/*
	 * create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To
	 * get a degree you need high school diploma”“. Class ‘Degree’ has 2 subclasses
	 * namely ‘Bachelors’ and Masters’. In Masters class override method
	 * ‘getPrerequisite’. Call the method by creating an object of each of the three
	 * classes. Create a class CreditCard and define variable balance and interest.
	 * Create an instance method that will calculate interest based on the given
	 * balance.
	 */

	String degree;

	void getPrerequisite() {
		System.out.println("To get degree you need High School" + degree);

	}

	void degree() {
		System.out.println("he has a deploma " + degree);

	}

}

class Masters extends Degree {

}

class CreditCard extends Degree {

}

class instance extends Degree {

	String PHD;

	void getPhd() {
		System.out.print("Interst " + PHD);

	}
}