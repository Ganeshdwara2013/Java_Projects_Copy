package com.stringfunction;

public class IsEmpty {
	
	public static void main(String[] args) {
		
// It will Check whether the String is empty or not.
		
// Scenario - 1:- 
		
		String s = "Welcome to Java"; // Something filled here.
		
		boolean em = s.isEmpty();
		
		System.out.println(em);
		
		System.out.println("*******-----******");
		
// Scenario - 2:-
		
        String s1 = ""; // No data is there(So it is Empty).
		
		boolean em1 = s1.isEmpty();
		
		System.out.println(em1);
		
	}

}
