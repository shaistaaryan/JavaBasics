package com.class21;

public class ScrumTeam {
	
	String ceremonies;

	void attendMeetings() {
		System.out.println("Scurm team attend "+ceremonies);
	}
}public class Tester extends ScrumTeam{
	void test() {
		System.out.println("tester find the bug and assign it");
	}


}
