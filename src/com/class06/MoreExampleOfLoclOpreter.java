package com.class06;

public class MoreExampleOfLoclOpreter {

	public static void main(String[] args) {
		/*we have totle 7 day in week 
		 * if day is 2,3-->SDLC calss
		 * if day 6,7 --> Java calss 
		 * if day is 1,5 --> off day 
		 * if day is 4--> review class
		*/
          int day=6;
          day=7; 
          // to compare 2 number we use equals
          if (day==2 && day==3) {
        	   System.out.println("Today is SDLC class");
           }else if (day==6 && day==7) {
        	   System.out.println("Today is java class");
           }else if (day==1 && day==5){
              System.out.println("Today is no calss, it is day off");
           }else if(day==4) {
        	   System.out.println("Todayy is reiew calss with Elion");
           }else {
        	   System.out.println("Invalid day");
           }
	
	       System.out.println("----------------using String--------------");
	       // to compare string use equals
	       String day1="Saturday";
	       
	       if(day1.equals("Tuesday") || day1.equals("Wednesday")) {
	    	   System.out.println("Today is SDLC class");
	       }else if (day1.equals("Saturday") || day1.equals("Sunday")) {
	    	  System.out.println("Today is java class");   
	       }else if (day1.equals("Monday")||day1.equals("friday")) {
	    	   System.out.println("Today is no calss, it is day off");
	       }else if (day1.equals ("Thursday")) {
	    	   System.out.println("Todayy is reiew calss with Elion");
	       }else {
	    	   System.out.println("Invalid day");
	       }
	
	
	
	
	
	
	
	}	
	
}
