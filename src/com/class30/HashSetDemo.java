package com.class30;

public class HashSetDemo {

	public static void main(String[] args) {
		//Create a collation that store only unique object c and we  do not care a bout the order

		HashSet<String> breakfast = new HashSet<>();
		breakfast.add("egg");
		breakfast.add("brad");
		breakfast.add("tea");
		breakfast.add("cream chease");
		breakfast.add("eggs");
		breakfast.aa("coffe");

		// how may elmet in the set
		int size = breakfast.size();
		System.out.println(size);
		// order is not maintained
		System.out.println(breakfast);

		// we need to recive an element --> not get method a vailable

		// we can retieve all elements!
		Iterator<String> myIterator = breakfast.iterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
	}
	
		System.out.println("---------------------");
		

	}
}
