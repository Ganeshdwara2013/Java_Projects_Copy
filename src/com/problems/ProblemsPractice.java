package com.problems;

import java.util.Scanner;

public class ProblemsPractice {
	
	public static void main(String[] args) {
		
		// Odd or Even Numbers Practice
		
	//Scenario - 1:-
		
		int n = 5; // If we give as Even Number( the result will give even Number)
		
		if(n%2==0) {
			
			System.out.println("It is Even");
			
		} else {
			
			System.out.println("It is Odd");
		}
		
		System.out.println("*******-----*****");
		
	// Scenario - 2:- without using arithmetic operators to find te number is odd or even.
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter the 'x' value");
        
        int num1 = s.nextInt();

		System.out.println("Entered Number is:-" + num1);
		
		if(num1==0) { // Wrong Info WIll change later
			
			System.out.println("Odd");
			
		} else {
		
		    System.out.println("Even");
	}

	}
}
