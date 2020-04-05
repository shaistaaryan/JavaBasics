package com.class24;

public class ComputerTest {

	public static void main(String[] args) {

		Computer [] comps= {new Apple("Apple Macbook"), new HP("HP"),new Lenovo("Lenovo")};
		
		for(Computer c:comps) {
			c.run();
			c.save();
			c.storahe();
			c.transfer();
			System.out.println("-------     ---------");
		}
	
		Apple app=new Apple("Apple");
		app.safe();
		
		//donwncasting
		//Apple computer=new Computer("Comp");
		Apple apple =new Computer("Computer");
		
	
		
	
	}

}
