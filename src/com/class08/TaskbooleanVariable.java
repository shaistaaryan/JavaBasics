package com.class08;

public class TaskbooleanVariable {
	public static void main(String[] args) {
		
		boolean WorkDay = true;
		int variableDay = 1;
		while (WorkDay) {
			if (variableDay < 6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("I do not a need day off anymore");
				WorkDay=false;
			}
		}variableDay++;
	}
		
		
		
		
		
		
		
		
		


}
