package com.conditionstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
	// Switch statement-->if the Condition Matched that code will be executed
		
	// in Switch Statement, we can use Character (or) Integers.

	// break & Default statement can be used in the middle of Switch statement.
		
	// break statement ---> it will stop the loop (or) end the Loop (or) terminate the loop.
		
	// Continue Statement---> it stops the particular statement(or) it will skip the particular Iteration.

	// Example 1 Below:-
		
		int a = 2;
		
		switch(a) { // switch statement declaration
		
		case 1:
			
			System.out.println("Today is Monday");
			
			break; //Break Statement Declaration
		
	// if the break statement is not declared, the loop will not stop and will include the next loop info also.		
		
		case 2:
			
			System.out.println("Today is Tuesday");
		
			break;
		
		case 3:
			
			System.out.println("Today is Wednesday");
			
			break;
		
		case 4:
			
			System.out.println("Today is Thursday");
			
			break;
			
		default: // default statement declaration--> if all the cases fails, the default statement will give the output of the particular switch statement
				
			System.out.println("Invalid Input");
				
		}
		
		System.out.println("**************");
			
	// Example 2 below:-	
		
       char ch = 'd';
		
		switch(ch) { // switch statement declaration
		
		case 'a':
			
			System.out.println("A output");
			
			break; //Break Statement Declaration
		
	// if the break statement is not declared, the loop will not stop and will include the next loop info also.		
		
		case 'b':
			
			System.out.println("B Output");
		
			break;
		
		case 'c':
			
			System.out.println("C Output");
			
			break;
		
		case 'd':
			
			System.out.println("D Output");
			
			break;
			
		default: // default statement declaration--> if all the cases fails, the default statement will give the output of the particular switch statement
				
			System.out.println("No Output");
				
		}
			
			
	}

}
