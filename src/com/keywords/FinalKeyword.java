package com.keywords;

// the Final keyword can be used in three levels

// Class Level, Method Level and Variable Level
	
//'Final' Variable value cannot be CHANGED throughout the class.
	
//'Final' Method cannot be Override.
	
//'Final' Class cannot be Inheritance.

public /*final*/ class FinalKeyword { //Final Class cannot be Inherited(Inheritance)
	
//use 'final' keyword in the above class to see the example for Inheritance not possible in FinalKeywordMethodExmaple Class.
	
	public /*final*/ void number() { // final Method declaration, it cannot override.
	
		//use 'final' keyword in the above method to see the example for Override not possible FinalKeywordMethodExmaple Class.
		
		System.out.println("Method Override Not Possible");
		
	}
	
	public static void main(String[] args) {
		
        final int a = 24; // final variable cannot be changed
		
		int c = 12;
		
		c = a; // here a = c is not possible because a value is given a 'final' keyword.
								
		System.out.println(a);
				
		System.out.println(c);
		
	}
	
}
