package com.stringfunction;

public class IndexOf { 
	
	public static void main(String[] args) {
		
// It will get the Index Value of the Particular letter in the word, Using Index Method.
		
// Scenario - 1:-
		
		String s = "Welcome to Java";
		
		int io = s.indexOf("W"); // The Index Value of W in Word "Welcome" is Zero(0).
		
		System.out.println(io);
		
		System.out.println("******------*****");
		
		
		
// Scenario - 2:-
						
		int io1 = s.indexOf("t"); // The Index Value of W in Word "Welcome" is Eight(8).
		
		System.out.println(io1);
		
		System.out.println("******------*****");
		

// Scenario - 3:-
		
		int io2 = s.indexOf("E"); // Case Sensitive Method---> Not retrieving the Proper value.
				
		System.out.println(io2);
				
		System.out.println("******------*****");
	
		
// Scenario - 4:-
		
		int io3 = s.indexOf("e");
						
		System.out.println(io3);
			
	}

}
