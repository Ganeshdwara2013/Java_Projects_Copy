package com.array;

public class ArrayPractice {

	public static void main(String[] args) {

// Array  ---> Storing Multiple values in a single variable. Example Int a = 12, 13, 14.
		
// Syntax is ----> Datatype variableName[] = new Datatype [length];
		
// Also, we can use like---> int a[]= {12, 13, 14, 15};
		
// Example Int a[] = new int[7];
		
// Here a[]= represents the index Number & int[7] represents the length.
		
// Length will allocate the memory space for the Array.
		
// It is index based concept, it supports only similar datatype.
		
// Method 1 Below:-
		
		int a[] = new int[4]; // Declaration for Methods (1 & 2) used below:-
		
		a[0] = 12;
		
		a[1] = 13;
		
		a[2] = 14;
		
		a[3] = 15;
		
		System.out.println(a[0]);
		
		System.out.println(a[1]);

		System.out.println(a[2]);

		System.out.println(a[3]);
		
		System.out.println("*******----------*******");
		
// In the Method 1, if the no. of values in a[] is high means, it is difficult to enter separately all the time.
		
// Also, the above method is not a good coding practice. So, In Method 2, we use Looping.
		
// Method 2 Below:-
		
		for(int i =0; i<a.length; i++) {
			
		System.out.println(a[i]);
		
		}
		
		System.out.println("*******----------*******");

		
// Array can be another method also.
		
// we can declare the above example like int a[]= {12, 13, 14, 15};
		
// Here a[] will allocate the memory space for the Array based on No. of Values present inside the phrases {}.
		
// Method 3 Below:-
		
    int b[] = {1,2,3,4,5}; // Declaration for Methods (3 & 4) used below:-
    
    for(int x = 0; x<b.length; x++) {
    
    System.out.println(b[x]);
    
    }
    
	System.out.println("*******----------*******");
  
 // Next method is used to get the data is "For Each Loop Statement".
	
 // Method 4 Below:-

	for (int y:b) {
		
		System.out.println(y);
	}
 
   }

}