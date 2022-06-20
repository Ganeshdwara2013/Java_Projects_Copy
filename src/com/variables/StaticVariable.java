package com.variables;

public class StaticVariable {

// the Static keyword can be used as two levels (method level & variable level)
	
//1) giving as method name // method level 'Static Keyword' Usage
	
//2) giving as variable name // variable level 'Static Keyword' usage
	
// in the above method we can call the variable without creating object.
		
	
    static int x = 40; // variable name as static

    public static void number() { // method name as static
    	
    	System.out.println("Static Keyword using method");
    		
    }
    
    public static void main(String[] args) {
		
    	System.out.println(x); // calling variable
    	
    	number(); // calling method
	}

    }
    
	
	

