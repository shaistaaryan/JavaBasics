package com.class30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Questions {

	public static void main(String[] args) {
		// how to remove duplicates from arraylist
		List<String> aList = new ArrayList<>();
		aList.add("john");
		aList.add("jene");
		aList.add("jasaine");
		aList.add("jane");
		aList.add("james");

		Set<String> set = new LinkedHashSet<>();
		set.addAll(aList);
		System.out.println(set);
		set.add("Alijan");
		set.add("Usman");
		// how to get only 1 value from set?
		if (set.contains("jasmine")) {
			System.out.println("we have jasmine");
		}
		// 1 convert to list
		List<String> list = new ArrayList<>(set);
		String name = list.get(4);
		System.out.println(name);
		aList.add("jane");
		aList.add("jane");
		aList.add("jane");
		System.out.println(list);

		// 2 convert to array
		Object[] array = set.toArray();
		System.out.println(array[5]);
		//array is a utility class that have method to work with 
		
		//to sort element of any collection 
       //collections is utility class that have methods to work with collections
		Collections.sort(list);
		System.out.println(list);

	}

}
