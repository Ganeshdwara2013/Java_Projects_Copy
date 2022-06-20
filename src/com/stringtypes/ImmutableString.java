package com.stringtypes;

public class ImmutableString {
	
	public static void main(String[] args) {
		
// System.identityHashCode(args) ---> it is used to Identify the Particular Memory Address of the value. 

// Let's see the immutable string Features.
		
// When we do Duplicate Value:---> It will share the Memory.
		
// When we do Concatenation---> It will create new memory.
		
// Immutable String was stored in "String Constant Pool" under "Heap Memory".
	
// Syntax for Immutable String is below:-
		
// String refName = "  ";
		
// Scenario - 1:-

		String s1 = "Ganesh"; // Original String
		
		String s2 = "Ganesh"; // Duplicate String ---> it will share the Memory.
			
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("*****------****");

// Scenario - 2:-
		
		String s3 = " Ganesh ";
		
		String s4 = "Ganesh";
		
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
// Here String "s3" Contains spaces, so it doesn't considered the value as duplicate.
		
// It is a Case Sensitive Method.
		
		System.out.println("*****------****");
		
// Scenario - 3:-
			
		String s5 = "Ganesh";
		
		String s6 = "Ganesh";
		
		System.out.println(s5+s6); // Concatenation --> New Memory Space Created.

		System.out.println(System.identityHashCode(s5+s6));
		
	}

}
