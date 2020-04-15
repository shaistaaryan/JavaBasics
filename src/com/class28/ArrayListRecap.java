package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		// lets arraylist that store Double types of objects
		// generic arraylist
		ArrayList<Double> alist = new ArrayList<>();
		alist.add(10.99);
		alist.add(12.99);
		alist.add(100.99);

		// replace element
		alist.set(1, 13.99);
		System.out.println(alist);

		// remove element
		alist.remove(13.99);
		System.out.println(alist);

		// retrieve single element
		System.out.println(alist.get(1));

		// retrieve all elements from collection

		for (double a : alist) {
			System.out.println(a);
		}

		// 2. for loop
		for (int i = 0; i < alist.size(); i++) {
			double d = alist.get(i);
			System.out.println(d);
		}

		// 3. Iterator
		Iterator<Double> iterator = alist.iterator();
		while (iterator.hasNext()) {
			double d = iterator.next();
			System.out.println(d);
		}

		System.out.println("-------Non generic coolection-------");

		// 2. non generic collection/ arraylist
		ArrayList obj = new ArrayList();
		obj.add("hello"); // store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(alist); // store collection object

		System.out.println(obj);

	}

}
