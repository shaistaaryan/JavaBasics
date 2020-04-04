package com.class23;

public class Employee {
	
	double salary;
	 
	void getPaid() {
		System.out.println("Emloyee gets paid " +salary);
 
	}

	void work() {
		System.out.println("Employee works ");
	}
}
	
class fullTimeEmployee extends Employee{
	
	}

	class ParTimeEmployee extends Employee{
		
	}
	
	class Construactor extends  Employee {
		
		double hourlyRate;
		
		void getPaid() {
			System.out.println("Contractor gets paid " +hourlyRate);
			
		}
	}


