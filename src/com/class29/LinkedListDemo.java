package com.class29;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("yuns");// comes form collection
		llist.add(0, "Rehan");// comes from List
		llist.add("pavl");
		llist.add("Farida");

		int size = llist.size();
		System.out.println(size);
		
		//get all elements 1 by 1 in 3 different ways
        for (int x = 0; x < llist.size(); x++) {
        	System.out.println(llist.get(x));
        }
		
        for(String a : llist) {
        	System.out.println(a);
        }
	
        Iterator<String> it = llist.iterator();
        while (it.hasNext()){
        	String str = it.next();
        	System.out.println(str);
        	
        }
	
        //can we sotre object of usere defind class
        LinkedList<Food> food =new LinkedList<>();
        food.add(new Salad("Salad","tomato and cucmber", 100));
        
        
	}

}
