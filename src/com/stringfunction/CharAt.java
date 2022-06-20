package com.stringfunction;

public class CharAt {

	public static void main(String[] args) {
		
//If we give the particular Index value in a group of words, it will get(Retrieve) the character of that particular word.
		
// Scenario - 1:-
		
		String s = "Welcome to Java"; // Declaration
		
		char ca = s.charAt(8);
		
		System.out.println(ca);
		
		System.out.println("********------****");
		
// Scenario - 2:-
		
        char ca1 = s.charAt(10); // Index Value 10 is having "Space" in the Particular Declaration word.
		
		System.out.println(ca1);
		
		System.out.println("********------****");
		
// Scenario - 3:-
		
        char ca2 = s.charAt(11); 
		
		System.out.println(ca2);
			
	}
}
