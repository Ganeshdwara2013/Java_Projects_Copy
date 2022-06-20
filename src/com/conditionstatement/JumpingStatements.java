package com.conditionstatement;

public class JumpingStatements {
	
//Break & Continue are examples of Jumping Statement
	
	public static void main(String[] args) {
		
// Break Statement --> it will stop/terminate/ end the Loop.
		
// if the break statement is not declared, the loop will not stop and will include the next loop info also.
		
// break statement ---> it will stop the loop (or) end the Loop (or) terminate the loop.
		
// Continue Statement---> it stops the particular statement.
	
// Continue Statement---> it will skip the particular Iteration.
		
// Example for Break Statement Below:-
		
		for(int i=1;i<=5;i++) {
			
		if(i>3) {
			
			break; //Break Statement Declaration
			
// here it stopped, until 3
	
		}
		System.out.println(i);
		
		}
	
		System.out.println("**************");
		
// Example for Continue statement Below:-
		
		for(int i=1;i<=5;i++) {
			
			if(i==3) { // in output '5' is not retrieved
				
				// the below continue statement 
				
				continue; //Continue Statement Declaration
			}
			
			System.out.println(i);
			
			}
	}

}
