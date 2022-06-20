package com.conditionstatement;

public class IfElseIfLadder {

	public static void main(String[] args) {

	// If Else If Ladder Statement
		
	// && - AND Operator---> For this Operator both conditions needs to pass.
		
	// || - OR Operator ---> for this Operator any of the Condition need to pass.
		
	//Example Below:
		
		int mark = 80; // Based on Mark, the below code will be executed
		
		if(mark<50){
			
			System.out.println("Grade is D");
		
		}else if(mark>=50 && mark<60){
			
			System.out.println("Grade is C");

		}else if(mark>=60 && mark<80){
			
			System.out.println("Grade is B");

		}else if(mark>=80 && mark<=100){
			
			System.out.println("Grade is A");

		}else{
			
			System.out.println("Invalid Mark");
		}
	}

}
