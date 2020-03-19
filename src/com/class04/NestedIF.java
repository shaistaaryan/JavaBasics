package com.class04;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isBeautiful = true;
		boolean isEducated = true;

		if (isBeautiful) {
			
			if (isEducated) {
				System.out.println("I will marry");
			} else {
				System.out.println("Maybe if I don't find one");
			}
		}else {
			System.err.println("NOOOOO");
		}
	}

}
