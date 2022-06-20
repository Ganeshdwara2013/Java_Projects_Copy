package com.stringfunction;

public class Replace { 
	
// It will replace the Particular Word of the String Value.
	
// It is also a Case Sensitive method
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java"; // Declaration
		
		System.out.println(s);
		
		System.out.println("******------*****");
		
// Scenario - 1:-
		
		String re = s.replace("Welcome", "Vanakkam");
		
		System.out.println(re);
		
		System.out.println("******------*****");


// Scenario - 2:-
		
		String re1 = s.replace("To", "2"); // Here  Word "To" Incorrectly given as upper case. 
		
		System.out.println(re1);

		System.out.println("******------*****");
		
// Scenario - 3:-
		
		String re2 = s.replace("to", "2"); // Here  Word "To" Incorrectly given as upper case. 
				
		System.out.println(re2);
		
	}

}
