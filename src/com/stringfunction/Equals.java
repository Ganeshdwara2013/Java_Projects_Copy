package com.stringfunction;

public class Equals {
	
	public static void main(String[] args) {
		
// Scenario - 1:-
		
		String s = "Welcome to Java";
 
        boolean eq = s.equals("Welcome to Java"); // s.equals Declaration
        
  // s. equals is a Case Sensitive Method.
        
        System.out.println(eq);
        
        System.out.println("******-----*****");
        
  // Scenario - 2 & 3:-

        boolean eq1 = s.equals(" Welcome to Jav");
        
        // Here(eq1) In Word 'Java', Letter 'a' is not there.
        
        boolean eq2 = s.equals(" welcome to Java");
        
        // Here(eq2) In Word Welcome, 'w' given as small case.

        System.out.println(eq1);
        
        System.out.println(eq2);

	
	}

}
