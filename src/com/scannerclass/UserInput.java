package com.scannerclass;

import java.util.Scanner; // it is imported by checking the error message in Scanner Syntax

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // Synatx for Scanner to the left and below:-
		
		// Scanner refname = new Scanner(System.in);
		
		//where Scanner = Class, System.in = Input from user, System.out-->To print in the console
		
		// total 5 important types
		
		System.out.println("Enter Your Name:-");
		
		String name = s.nextLine(); // nextLine()
		
		System.out.println("Your Name is " + name);
		
		System.out.println("Enter You Age:-");
		
		int age = s.nextInt();  // nextInt()
				
		System.out.println("Your age is " + age + " Years old");
		
		System.out.println("Enter Your Height:-");
		
		float height = s.nextFloat(); // nextFloat()
		
		System.out.println("Your Height is " + height + " feet");
		
		System.out.println("Enter Your Initial:- ");
		
		char initial = s.next().charAt(0); // charAt(Index Value)
		
	// syntax for charAt is----> char anyname = refname.next().charAt(Index Value);
		
		System.out.println("Your Initial is " + initial);
		
		System.out.println("Enter Your Gender:-");
		
		String gender = s.next(); //next()
		
		//next() --> one value or word, after the space it wont accept
		
		System.out.println("Your Gender is " + gender);
		
		}

}
