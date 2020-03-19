package com.class05;

public class NestingEleseIfs {
	
	public static void main (String [] args ) {
		
		/* if student completed  a quize we will check for a scor 
		 * if scor>90-->great job
		 * if scor >80-->well done
		 * if scor >70-->you could have  done better
		 * 
		 * if student did not completed the quize-->not good 
		 * please do homwork on time 
		 */
		boolean quizeCompleted=true;
		int score =86;
		
		if (quizeCompleted) {
			System.out.println("lets check youre score ");
			
			if(score>90) {
				System.out.println("Great job , you study a lot ");
			}else if (score>80) {
                System.out.println("well done");				
			}else if (score>70) {
				System.out.println("you could have done better");
			}else {
				System.out.println("you failed");
			}
		}else {
			System.out.println("please do HW ontime");
		}
		
		
		
	}

}
