package com.class07;

public class SwitchStatment {
public static void main(String[] args) {
	/* witch case is another conditional statement it also
	 *  test multiple condition
	 */
	
	 int day=4;
	String dayName;
	
	if (day==1) {
		 dayName="Monday";
	 }else if (day==2) {
		 dayName="tuesday";
	 }else if (day==3) {
		 dayName="wednesday";
	 }else if (day==4) {
		 dayName="thursday";
     }else if (day==5) {
    	 dayName="friday";
     }else if (day==6) {
    	 dayName="saturday";
     }else if (day==7) {
    	 dayName="sunday";
     }else {
    	 dayName ="Invalid";
     }
    	
	System.out.println(" Today is " + dayName);
	System.out.println("-------using switch---------");
	
	String today;
	switch (day) {
	
	case 1:
		today="monday";
		break;
	case 2:
		today="tuesday";
		break;
	case 3:
		today="wendnesday";
		break;
	case 4:
		today="thursday";
		break;
	case 5:
		today="friday";
		break;
	case 6:
		today="saturday";
		break;
	case 7:
		today="sunday";
		break;
	default:
	    today ="invalid";
	
	}	
	System.out.println("today is " + dayName);
	
    
}
	
}
