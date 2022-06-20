package com.exception;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		
// Exception is like Error.
		
// when Exception occurs, the program will terminate at the line itself.

// If exception Occurs we can handle it by code of the Program.
		
// Parent Class of Exception is "Throwable".
		
// Parent Class of All Classes of Java is Object.
		
// Parent Class of Interface in Java is "Iterable".
		
// Parent Class of Selenium is "Search Context".
		
// Two types of Exception.
		
// i) Compile Time Exception (or) Checked Exception.

// ii) Run time Exception or UnChecked Exceptions.
		
// Different types of Compile Time exceptions below:-
		
// File Not Found Exception, IO(Input/Output) Exception, SQL Exception, Class Not found Exception.
		
// The Above Compile time exceptions (or) Checked exception will be covered in Selenium class (It was not covered in Java Class).
		
// Different types of Runtime Exception (or) Un-Checked Exception Below.
		
// Arithmetic Exception 
		
// Null Pointer Exception
		
// Input Mismatch Exception
		
// Array Index Out of Bound Exception

// String Index Out of Bound Exception
		
// Index Out of Bound Exception
		
// Number Format Exception
		
// In Below, some of the code made as read-only, if its needs to run just uncheck the unwanted things as read-only and run to make the required program run.
		
// Let' See the Run-time Exceptions below.
		
// 1) Arithmetic Exception Example Below:-
		
// Using Arithmetic operators like *,-,+,/,%
		
	// int a = 6;
	
	// int b = 0; //anything divide by zero(0) is infinity.
	
	// System.out.println(a/b);
	
// Error Message will show, which line there was a error and what type of error, it will say.
	
// 2) Null Pointer Exception Example Below:-

		// String s = null; // it is Not a defined(correct value)
		
		// int le = s.length();
		
		// System.out.println(le);
	
// 3) Input Mismatch Exception Example Below:-

		// Scanner sc = new Scanner(System.in);
		
		// System.out.println("Enter Any Number"); // if the Input we are giving is Float (Or) Character , it will show the Input Error Exception. Because we have given the value as Integer.
		
		// int ni = sc.nextInt();
		
		// System.out.println("The Entered Number is:-" + ni);
		
// 4) Array Index Out of Bound Exception Example Below:-

		//int a[] = new int[3];
		
		// a[0] = 12;
		
		// a[1] = 13;
		
		// a[2] = 14;
		
		// a[3] = 15; // This line is Out of Length size in Array List we have declared.
		
		// for (int i :a) {
			
		// System.out.println(i);
		
		// }
		
// 5) String Index Out of Bound Exception Example Below:-

     // String s = "Ganesh";
     
     // System.out.println(s);
     
     // char ca = s.charAt(7); // Incorrect Index value giving in String means, we will get this error.
     
     // System.out.println(ca);
     
// 6) Index Out of Bound Exception Example Below:-
		
		// List<Object> s1 = new ArrayList<Object>();
		
		// s1.add(12);
		
		// s1.add(20);
		
		// s1.add('R');
		
		// s1.add("Ganesh");
		
		// s1.add(5.5);
		
		// System.out.println(s1);
		
		// Object ob = s1.get(5); // Incorrect Index Value Giving will cause this exception(Index Out of Bound)
		
		// System.out.println(ob);
	
 // 7)  Number Format Exception Example Below:-
		
		// String s = "1234ganesh";
		
		// int pi = Integer.parseInt(s); // Parseint is used to get(Retrive) only the Integer value within the String by using wrapper class. If apart from Integer, anything found means, it will show the Number Format Exception.

		// System.out.println(pi);
		
		
		
		System.out.println("Remove Read-only mode from each topic to see what type of error occurs.");
		
	}

}
