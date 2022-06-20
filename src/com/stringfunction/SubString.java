package com.stringfunction;

public class SubString {
	
	public static void main(String[] args) {
		
// This Method is a Length Based Concept.
		
// This Substring Method will delete the data until which is given inside the Substring value.
		
// It can be used also as range Like (giving from & to values).
		
		String s = "Welcome to Java";
		
// Scenario - 1:-
		
		String ss = s.substring(0);
		
		System.out.println(ss);
		
		System.out.println("***************");
	
		
// Scenario - 2:-
		
// It will delete the data's before the value given in the substring(within the Bracket).
		
// Here we gave as '2' so Letter 'w' and 'e' got removed.
		
		String ss1 = s.substring(2); // giving length value as 2 in the substring.
	
		System.out.println(ss1);
				
		System.out.println("***************");
			
// Scenario - 3:-
		
		String ss2 = s.substring(8); // giving length value as 8 in the substring.
		
		System.out.println(ss2);
				
		System.out.println("***************");
		
// Scenario - 4:-
		
// Giving like Range (From & to) concept.
		
        String ss3 = s.substring(3, 12); // giving length from value as 3 & to Value as 12 in the substring.
		
  // It will delete the value apart from the Given data within the Bracket(substring), Like here it deleted the letter before 3 and after 12, and showing output as from 4 to 12.
        
		System.out.println(ss3);
				
		System.out.println("***************");

// Scenario - 5:-
	
// Giving like Range (From & to) concept.
		
// It will delete the value apart from the Given data within the Bracket(substring), Like here it deleted the letter before 4 and after 9, and showing output as from 5 to 9.

		String ss4 = s.substring(4, 9); // giving length from value as 4 & to Value as 9 in the substring.
				
		System.out.println(ss4);

	}

}
