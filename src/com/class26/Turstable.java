package com.class26;


class Financing{
public void financing() {
	System.out.println("Dealing with financing");
}
}


public interface Turstable {
//by default compiler will make method to be public and abstract 
	void Turst();

}

interface Bank extends Turstable {
//by default compiler will make method to be public and 	
	void deposit();

	void withdraw();
}

class BOA extends Finance implements Bank, CreditUnion{

	@Override
	public void Turst() {
		System.out.println("BOA is Turstable ");
	}

	@Override
	public void deposit() {
		System.out.println("You can a depposit at BOA");
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw you monay at BOA ");
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA give a cretid");
		
	}
}

interface CreditUnion{
	
	void giveCredit() {
		System.out.println("BOA give credit");
	}
}

class Finance{
	publilc void financing() {
		System.out.println("Dealing with credit");
	}
}
