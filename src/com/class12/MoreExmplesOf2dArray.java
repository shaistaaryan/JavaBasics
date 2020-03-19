package com.class12;

public class MoreExmplesOf2dArray {

	public static void main(String[] args) {
		// lets creat 2d array in which we store professions
   
  String[][] professions = {{"QA Teter", "Developers", "prouduct Owner", "Scrum Master"},
				            { "Math Teacher", "Science Teacher", "ESL Teacher" },
				            { "Dentist", "Surgeon" },
				            };
		// get elements using advanced for loop

		for (String[] occupation : professions) {
			for(String title:occupation) {
				System.out.print(title+" ");
			}
       System.out.println();
		}

	}
}
