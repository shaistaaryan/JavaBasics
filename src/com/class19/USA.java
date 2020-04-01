package com.class19;

public class USA {
  //create variable to hold state and capital of the state
	String state, stateCapital;
	
	//create a method to display state and stateCapitale
	
	public  void display() {
		System.out.println(state+" and it is capital is "+stateCapital);
	}
//create a constructor that will initialize instance variable
	public USA (String state, String usaStateCapital) {
	   this. state=state;
	   this.stateCapital=usaStateCapital;
	}
	
	public static void main(String [] args) {
		
		USA usa=new USA("Virginia", "Richmond");
		usa.display();
	}

}
