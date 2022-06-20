package com.stringfunction;

public class LastIndexOf {
	
	public static void main(String[] args) {
		
// It will get the Index of the Particular Letter which is given as last in the given data(Group of words).
		
// If two or more letter found repeatedly in a Sentence(word)means, it will get the value of the Last word/Last Letter Index Value.

// It is also a Case Sensitive Method.
		
// Scenario - 1:-
		
		String s = "Welcome to Java";

		int lio = s.lastIndexOf("A"); // Here Letter "A" given as Upper case, so output not retrieved Properly.
		
		System.out.println(lio);
		
		System.out.println("******------*****");
		
// Scenario - 2:-
		
		int lio1 = s.lastIndexOf("a"); 
	
    //Here It retrieved(got) the last "a" which is given in the word "Java".(i.e., Jav 'a'.)
				
		System.out.println(lio1);
		
		System.out.println("******------*****");

//Scenario - 3:-
		
		int lio2 = s.lastIndexOf("o"); // Letter 'o' retrieved from Word "to" NOT in Word "Welcome".
		
		System.out.println(lio2);	
		
	}

}
