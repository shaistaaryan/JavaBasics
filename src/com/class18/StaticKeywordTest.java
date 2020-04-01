package com.class18;

public class StaticKeywordTest {

	public static void main(String[] args) {

		//access static members of another class
		StaticKeyword.brand = "Andriod";
		StaticKeyword.touchScreen = true;
		StaticKeyword.displayGeneralinfo();

		//access instance members of another class
		StaticKeyword sk = new StaticKeyword();
		sk.color = "red";
		sk.memory = 128;
		sk.displaySpecifications();

		StaticKeyword sk1= new StaticKeyword();
		sk1.color = "red";
		sk1.memory = 128;
		
		StaticKeyword sk2 = new StaticKeyword();
		sk2.color = "red";
		sk2.memory = 128;
		sk2.brand="Nokia";
		
		//
		sk.displayGeneralinfo();
		sk1.displayGeneralinfo();
		sk.displayGeneralinfo();
	}

}
