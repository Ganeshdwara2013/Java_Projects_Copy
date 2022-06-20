package com.controlstatement;

public class ControlStatement {

	public static void main(String[] args) {

	// Control statement is also called as Looping Statement.
		
	// There are 3 Rules to be followed for Control Statements.
		
// Rule - 1---> Initialization ---> Where we need to start
		
// Rule - 2 --> Condition----> Where we need to stop(i.e., Condition true means loop will run and once condition is false means loop will stop.
		
// Rule - 3---> iteration---> It will Increase or Decrease the Value.
		
// Below:- Increment & Decrement Operator:-
		
// i++ = i+1---> Post Increment

// i-- = i-1 --> Post Decrement
		
// ++i = 1+i --> Pre-Increment
		
// --i = 1-i --> Pre-Decrement
		
		//Types of Control Statements
		
// While Loop, do While Loop, For loop, Nested For loop, for each loop.
		
		
		//Let's see the For Loop below:- 
		
		// using For Loop to run 1 to 10.
		
		for(int i = 1; i<=10;i++) // for loop declaration // Post Increment
			
			System.out.println(i);
		
		System.out.println("---------x---------x-------");
		
		for(int x = 5; x>=1; x--) // Post Decrement
		
			System.out.println(x);
		
		System.out.println("---------x---------x-------");

		for(int y = 1; y<=4;++y) // Pre-Increment
			
			System.out.println(y);
	
		System.out.println("---------x---------x-------");
		
		for(int j = 4; j>=1;--j) // Pre-Decrement
			
			System.out.println(j);

	}
	
}
