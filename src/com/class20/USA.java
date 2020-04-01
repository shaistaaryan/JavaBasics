package com.class20;

public class USA {

	String state, stateCapital;

	public USA(String state, String stateCapital) {

		this.state = state;
		this.stateCapital = stateCapital;
	}

	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);
	}

	// can i call 1 method inside another method?---> yes
	public void displayInfo() {
		this.displayState();
		displayState(); //by default constructor add this keyword to a method
		displayStateCapital();
	}

	public static void main(String[] args) {

		USA state1 = new USA("Texa", "Austin");
		state1.displayInfo();

	}

}
