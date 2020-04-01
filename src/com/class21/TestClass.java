package com.class21;

public class TestClass {

	public static void main(String[] args) {
		
		
		Employee obj=new Employee();
		obj.empNumber=12345;
		obj.salary=11000.00;
		obj.getPaid();
		ScrumTeam obj1=new ScrumTeam();
		obj1.ceremonies="Standup meeting";
		obj1.attendMeetings();
		Tester obj2=new Tester();
		obj2.test();
	}

	}


