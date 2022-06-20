package com.stringtypes;

public class MutableString {

	public static void main(String[] args) {

// System.identityHashCode(args) ---> it is used to Identify the Particular Memory Address of the value. 

// Let's see the mutable string and its types.
		
// Mutable String was stored in "Heap Memory".
		
// When we do Duplicate value ---> It will create the new Memory (i.e., The Reason is "new" word is there in syntax. Word 'new" is to allocate the Memory.

// When we do Concatenation---> it will share the Memory.
		
// Append method is used to Concatenate in Mutable String.
		
// Mutable String is two types--> 1) StringBuffer & 2) StringBuilder

// Syntax for StringBuffer and StringBuilder below:-
		
// StringBuffer--> StringBuffer refName = new StringBuffer(value);
		
// StringBuilder---> StringBuilder refName = new StringBuilder(value);
		
// StringBuffer--> Mutable, Synchronized, One By one Process, Thread safe, Slow Process.
		
// StringBuilder---> Mutable, ASynchronized, not a Thread Safe, Fast Process.
		
// For Mutable String--> Getting Movie ticket in theater example given.
		
// String Buffer is like getting movie ticket in direct and will go by queue procedure and safe.
		
// String Builder is like Getting Movie ticket through online, it is fast but, not securing data, sometimes payment gateway issue, etc., and it is not as safe process and it is a fast process.
		
// Let' see the practice code of String Buffer and String Builder.
		
// String Buffer:-
		
		System.out.println(" String Buffer Scenario's below");
		
// Scenario - 1:-
		
		StringBuffer s1 = new StringBuffer("Kishore"); // Original String
		
		StringBuffer s2 = new StringBuffer("Kishore"); // Duplicate String ---> Creating new Memory Space.
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		// Here if we give the Duplicate value between strings, it creates new Memory space, Because of the "new" Keyword is present in the code.

		System.out.println("********_______******");
		
// Scenario - 2:-
		
        StringBuffer s3 = new StringBuffer("  Kishore  "); 
        
		StringBuffer s4 = new StringBuffer("Kishore"); 

		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
// Here in String "s3" Prefix and Suffix having spaces so it will not considered that as Duplicate.
		
// anyway if we give duplicate value also, it will create new memory space for that string Value.
		
// Scenario 2 is done just to know that String s3 & s4 is not same(not a Duplicate one).
		
		System.out.println("********_______******");

		
// Scenario - 3:-
		
		StringBuffer s5 = new StringBuffer("Kishore"); // Declaration of s5 String.
		
		StringBuffer s6 = new StringBuffer("Kishore"); // Declaration of s6 String.
		
		System.out.println(System.identityHashCode(s5));
		
		System.out.println(System.identityHashCode(s6));
		
		System.out.println(s5.append(s6)); // Concatenation--> Memory is shared.
		
// The above line is Concatenation and the memory will be shared.
		
// Giving like "s5.append(s6)" will retrieve the data memory address stored in s5, i.e., if we give like // s5.append(s6) it will get the s5 Memory Address value as answer.
		
		System.out.println(System.identityHashCode(s5.append(s6)));
	
		System.out.println("********_______******");

	
// Scenario - 4:-
		
// Using String s5 & s6 Declaration for this scenario.
				
		System.out.println(System.identityHashCode(s5));
				
		System.out.println(System.identityHashCode(s6));
				
		System.out.println(s6.append(s5)); // Concatenation--> Memory is shared.
				
// The above line is Concatenation and the memory will be shared.
				
		System.out.println(System.identityHashCode(s6.append(s5)));
		
// Giving like "s6.append(s5)" will retrieve the data memory address stored in s6, i.e., if we give like // s6.append(s5)---> it will get the s6 Memory address value as answer.
				
// Whichever we give append in first before dot(.) in concatenation, it will retrieve the memory address value before the dot(.) value. See Example Scenarios 3 & 4.
	
		System.out.println("********_______******");

		System.out.println(" String Builder Scenario's below");
		
// Let' see the StringBuilder Example Below.
		
// String Builder below:-
		
// Scenario - 1: - Duplicate the value.
	
		StringBuilder ss1 = new StringBuilder("Ganesh"); // Original String
		
		StringBuilder ss2 = new StringBuilder("Ganesh"); // Duplicate String --> Allocates new Memory.
		
		System.out.println(System.identityHashCode(ss1));
		
		System.out.println(System.identityHashCode(ss2));
		
		System.out.println("********_______******");

		
// Scenario - 2: - Concatenation  of the value.

        StringBuilder ss3 = new StringBuilder("Ganesh");
		
		StringBuilder ss4 = new StringBuilder("Ganesh");
		
		System.out.println(System.identityHashCode(ss3));
		
		System.out.println(System.identityHashCode(ss4));
		
		System.out.println(ss3.append(ss4));
		
        System.out.println(System.identityHashCode(ss3.append(ss4))); // Concatenation - Sharing the Memory.

  // Here we are giving like "ss3.append(ss4)", so ss3 memory address is retrieved.
		
		System.out.println("********_______******");
        
        System.out.println(ss4.append(ss3));
        
        System.out.println(System.identityHashCode(ss4.append(ss3))); // Concatenation - Sharing the Memory.
    
   // Here we are giving like "ss4.append(ss3)", so ss4 memory address is retrieved.

	}
}
