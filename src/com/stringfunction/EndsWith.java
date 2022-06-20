package com.stringfunction;

public class EndsWith { // Case Sensitive Method
	
	public static void main(String[] args) {
		
		// Ends with is a case sensitive method & it will reach the last line as Priority
		
		// for Middle Words need to write a separate program
		
		// Here we will see only Startswith & Endswith Concepts only.
		
	// Scenario - 1:-
		
		String s = " Welcome to Java";
		
		boolean ew = s.endsWith("Java");
		
		System.out.println(ew);
		
		System.out.println("*******-----*****");
		
		
	// Scenario - 2:-

		boolean ew1 = s.endsWith("ava");
		
		System.out.println(ew1);
		
		System.out.println("*******-----*****");

		
	// Scenario - 3:-
		
        boolean ew2 = s.endsWith("Welcome");
		
		System.out.println(ew2);
		
		System.out.println("*******-----*****");
		
		
	// Scenario - 4:-

        boolean ew3 = s.endsWith("to Java");
		
		System.out.println(ew3);
		
		System.out.println("*******-----*****");
		
	// Scenario - 5:-
		
        boolean ew4 = s.endsWith("To Java"); // Here given word "To" as uppercase.
		
		System.out.println(ew4);


	}

}
