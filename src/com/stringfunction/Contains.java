package com.stringfunction;

public class Contains { // Case Sensitive Method
	
	public static void main(String[] args) {
		
	// It checks whether the particular statement(or)Letter is present or not within the String.
		
	// Scenario - 1:-
		
		String s = "Welcome to Java";
				
		boolean con = s.contains("W");
		
        System.out.println(con);
        
        System.out.println("*****------*****");
		
    // Scenario - 2:-

        boolean con1 = s.contains("w"); // Here Letter "w" given as lower Case.
		
        System.out.println(con1);
        
        System.out.println("*****------*****");
        
     // Scenario - 3:-

        boolean con2 = s.contains("Welcome"); 
        
        System.out.println(con2);
        
        System.out.println("*****------*****");
        
     // Scenario - 4:-

        boolean con3 = s.contains("welcome"); // Here Letter "w' given as Lower case in word "Welcome".
        
        System.out.println(con3);
        
        System.out.println("*****------*****");
        
     // Scenario - 5:-

        boolean con4 = s.contains("to"); 
        
        System.out.println(con4);
                
	}

}
