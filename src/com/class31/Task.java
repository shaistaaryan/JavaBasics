package com.class31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task {

	public static void main(String[] args) {

		Map<Integer, String> building = new LinkedHashMap<>();
		// entries with duplicate keys and value;
		building.put(1, "Google");
		building.put(2, "Syantax");
		building.put(3, "Google");
		building.put(4, "Amazone");
		building.put(5, "Amazone");
		building.put(6, "Hp");
		building.put(7, "MIcrosofat");

		System.out.println(building.size());
		System.out.println(building);

		// how to get all keys
		Set<Integer> keys = building.keySet();
		System.out.println(building.keySet());// print set

		System.out.println("_---------geting keys using iterator-----");
		Iterator<Integer> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			int key = keysIt.next();
			// key is 1 and its value is google
			System.out.println("Key is " + key + " its value is " + building.get(key));
		}

		System.out.println("----getting keys using for each loop-----");
		for (int k : keys) {
			System.out.println("key form building map= " + k + ":" + building.get(k));
		}

		// how to get all values
		Collection<String> values = building.values();// Iterable=collection

		System.out.println("----getting all values using for each loop----");
		for (String v : values) {
			System.out.println("Value form collectaion " + v);
		}

		System.out.println("------------getting all values using itertor------");
		Iterator<String> valuesIt = values.iterator();
		while (valuesIt.hasNext()) {
			System.out.println("Map values: " + valuesIt.next());
		}
	}

}
