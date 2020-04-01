package com.class20;

public class Recap {
	
	Recap(){
		System.out.println("I am a construcater with no arguments");
	}

	Recap(int num){
		System.out.println("Construacteo with 1 prameter");
	}    //------------>this is the constructor syantax

    public static void main(String[] args) {
	
    	Recap obj =new Recap(2);   //----->after the syantax must be create object
    	//Recap obj1=new Recap ("hi"); // CE: constructor is undefined
}

}
