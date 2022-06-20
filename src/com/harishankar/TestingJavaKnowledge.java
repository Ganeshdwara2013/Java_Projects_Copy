package com.harishankar;

import java.util.Scanner;

public class TestingJavaKnowledge {
	
	public static void main(String[] args) {
//		
//		// System.out.println("harish is a smart guy");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Your Age");
//		
//		// int s1 = sc.nextInt();
//		
//		int s1,s2;
//		
//		s1 = 25;
//		
//		System.out.println("Your Current Age is:- " + s1);
//		
//		// Age after 4 years
//		
//		s2 = s1+4;
//		
//		System.out.println("Your Current Age After 4 years is:- " + s2);
//		
////		if(s1%2==0) {
////			
////			System.out.println("This is Even");
////			
////		} else {
////			
////			System.out.println("This is Odd");
////		
////		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number of Kaka Present");
//		
//		int kaka = sc.nextInt();
//				
//		System.out.println("The Number of kaka is " + kaka);
//		
//		System.out.println("Enter the number of Dog Present");
//
//		int dog = sc.nextInt();
//						
//		System.out.println("The Number of kaka is " + dog);
//	  
//		int kakalegs = kaka*2;
//		
//		int doglegs = dog*4;
//		
//		int k = kakalegs+doglegs;
//		
//		System.out.println("Total Number of Legs:- " + k);
		
// Vowel or Not Coding.
		
		char a[] = {'a', 'e','i','o','u'}; // Syntax to declare multiple Char values in a single row.
		
		char b[] = {'A', 'E','I','O','U'};
					
		Scanner sc = new Scanner(System.in);  
	
	    System.out.println("Enter Your Initial");
	    
        char ch = sc.next().charAt(0);
        
        System.out.println("Your Initial is " + ch);
        
	    if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u') {
	    	
	    	System.out.println("It is Vowel");
	    	
	    } else if (ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U')
	    	
	    {
	    	
	        System.out.println("It is a Vowel");
	   
	    } else {
	    	
	    	System.out.println("It is not a Vowel");
	    }
	    	
	}
}