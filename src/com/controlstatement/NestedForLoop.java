package com.controlstatement;

public class NestedForLoop {
	
	public static void main(String[] args) {	
	
// Outer Loop and Inner Loop are there.
	
// Outer Loop is responsible for rows.
	
// Inner Loop is responsible for Values.
	
	for(int i = 1;  i<=10; i++) { // Outer loop
		
		for (int j = 1; j<=5; j++) { // Inner Loop
			
			System.out.print(j+" "); // Instead of println given as "print" to show in the same row.
		
//println is used for Next line to enter data
			
//Print is used for enter the data in the same row.
			
		}
		
		System.out.println();
	}
	
	}
}
