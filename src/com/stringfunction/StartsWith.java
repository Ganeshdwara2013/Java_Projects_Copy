package com.stringfunction;

public class StartsWith { // This is Case Sensitive Method
	
	public static void main(String[] args) {
		
	// Starts with Gives Priority to First word with case sensitive concept.
		
	// Refer Below Sceanrios for Example
		
	// Scenario - 1:-
		
		String s = "Welcome to Java"; // Declaration of String
		
		boolean sw= s.startsWith("Welcome");
		
		System.out.println(sw);
		
		System.out.println("*******-------******");
		
	// Scenario - 2:-

		boolean sw1 = s.startsWith("w");
		
		System.out.println(sw1);
		
		System.out.println("*******-------******");

		
	// Scenario - 3:-

		boolean sw2 = s.startsWith("Wel");

		System.out.println(sw2);
		
		System.out.println("*******-------******");

		
	// Scenario - 4:-

		boolean sw3 = s.startsWith("Java");
		
		System.out.println(sw3);
		
	}

}
