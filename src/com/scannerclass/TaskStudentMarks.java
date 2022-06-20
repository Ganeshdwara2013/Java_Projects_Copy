package com.scannerclass;

import java.util.Scanner;

public class TaskStudentMarks {
	
// Task is Enter the Student Marks to get the Grade Using If Else If Ladder Statement.
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);

		System.out.println("Enter the Student Name:- ");
		
		String name = x.nextLine();
		
		System.out.println("Your Name is " + name);
		
		System.out.println("Enter the Mark of the Student:- ");
		
		int mark = x.nextInt();
		
		System.out.println("The mark is:- "+ mark);
		
		if(mark<50) {
			
			System.out.println("Your Grade is D");
			
	        System.out.println("  ");

		} else if(mark >=50 && mark < 60){
			
			System.out.println("Your Grade is C");
			
	        System.out.println("  ");

		} else if (mark >=60 && mark < 80) {
			
			System.out.println("Your Grade is B");
			
	        System.out.println("  ");

		} else if (mark >= 80 && mark <= 100) {
		
	        System.out.println("Your Grade is A");
	        
	        System.out.println("  ");
	
	    } else {
		
		 System.out.println("InValid Marks");
			
		}	
	}
}
