package com.class10;

public class MorePatterns {

	public static void main(String[] args) {
        /*12345
         * 12345
         * 12345
         * 12345
         */
		for(int i=1; i<5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
           System.out.println();	
		}
	
	System.out.println("-------PRIANT PATTERN-------");
	/*11111
	  22222
	  33333
	  44444
	  55555
	 */
	for(int i =1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			System.out.print(i);
		}
	   System.out.println();
	}
	
	System.out.println("-------PRIANT 5 ROWS OF 1-9 ------");
      
  for(int i= 1; i<=9; i++) {
	  for(int y=1; y<=9; y++) {
		  System.out.print(y);
	  }
  System.out.println();
  
  }
  System.out.println("-------PRIANT 5 ROWS OF   ------");
	
     for(int i =1; i<=5; i++) {
    	 for(int j =5; j>=1; j--) {
    		 System.out.print(j);
    	 }
    System.out.println();
     }
	System.out.println("PRINT 5 ROWS OF 55555 444444,33333.22222,11111");
	for(int i=5; i>=1; i--) {
		for(int j=5; j>=1; j--) {
			System.out.print(i);
			
		}
	System.out.println();
	}
	
	
	}

}
