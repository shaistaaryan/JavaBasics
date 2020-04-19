package com.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lets create a grocery map item , quantity in which we do not care about the order
		
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 13);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		
		//create a map of items to buy (item, quantity)in wich we want save the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("face mask", 9);
		household.put("tiolet paper", 10);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping=new TreeMap<>(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys using loop
		for (String key:shopping.keySet()) {
			System.out.println("key: "+key);
		}
		
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("key="+it.next());
		}
		
		//get all values
		for(int val:shopping.values()) {
			System.out.println("value:"+val);
		}
		
		//get all values using iterator
		Iterator<Integer> iterator=shopping.values().iterator();
		while(iterator.hasNext()) {
			System.out.println("value ="+iterator.next());
		}
	
	}

}
