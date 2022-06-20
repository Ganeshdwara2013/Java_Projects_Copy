package com.stringfunction;

public class Split { // It is a Case Sensitive Method Concept.
	
	public static void main(String[] args) {
		
// For Each Loop will be used here.
		
// It will give particular character (or) Special Character fully(Completely)
		
// Scenario - 1:- 
		
		String s = "Welcome to Java";
		
		String[] sp = s.split("Java"); // Used for each loop concept here
		
// In the above line we split(delete the word "Java") in the Particular line.
		
		for (String x : sp) { // For Each Loop used Here
			
		System.out.println(x);
		
		System.out.println("**********");
		
// Scenario - 2:-
		
		String[] sp1 = s.split("to"); // Delete the Word "to" here.
		
		for (String y : sp1) {
			
		System.out.println(y);
			
	}		

		System.out.println("**********");

		
// Scenario - 3:- 
		
		String g = "Hi Ganesh, How are you Ganesh?";
		
		String[] sp2 = g.split("Ganesh");
		
//  Split Concept will delete the all the same word repeated Multiple times, if we are giving that inside the Split String.
		
		for (String z : sp2) {
			
		System.out.println(z);
		
		}
		
		}
	}

}
