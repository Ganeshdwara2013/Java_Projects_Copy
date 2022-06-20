package com.exception;

public class TryCatchFinallyPractice {
	
	public static void main(String[] args) {
		
// Exception Handling ---> Exceptions to be handled by 5 methods.
		
// try, catch, finally, throw, throws
		
// Try Catch will be inserted by first Select the Particular Code and right click on the program and then select--> Surronds with---> Try catch Exception
		
// Try will try the Exception and catch will catch the exception
		
// Whether the Exception shows errors occurs or not, the finally block will be executed automatically at the time itself.
		
// Try, Catch and Finally will be used at the same place in program.		
		
		try {
			
			int a = 6;
			
			int b = 0; // it will retrieve infinity value.
			
			System.out.println(a/b);
			
		} catch (Exception e) { // We can Give as " Arithmetic Exception or whatever the error message will show like that and variable 'e' also, we can change here.

			e.printStackTrace();
			
		} finally { // Finally Keyword Declaration, it should declare along with try and catch statements.
			
			System.out.println("It will always Run and it is used for Developers and Testers Purposes");
		}
		
		System.out.println("******------*****");
		
		// Next sets of codes below:- without errors like Inifinity answer.
		
		System.out.println("Remaining Code");
		
		int x = 5;
		
		int y = 10;
		
		System.out.println(y/x);
		
		// If we run without using try and catch it will reflect the error message and the program will not exceute after that.
		
		// By using try catch we can execute the program, even if shows errors.

	}

}
