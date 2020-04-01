package com.class18_1;

import com.class18.Employee;

public class AccessingMembersOfDifferentClass {

	public static void main(String[] args) {
	
	Employee emp=new Employee();
	Employee.title="QA Engineer";
	emp.name="Ahmad";
	//emp.lastName-->this is also not aviavble bcz it is in protected 
	//emp.salary---->-->default) this is also not accessible bcz its double
	//emp.ssn------->private
	
	Employee.method1();
	emp.method1(); //not prefferable
	//below method not available due to restrictions
//	emp.method2();-->Protect
//	emp.method3();-->default
//	emp.method4();-->private
//	
//	
//	
	
	
	
	}
}
