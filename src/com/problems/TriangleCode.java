package com.problems;

public class TriangleCode {

	public static void main(String[] args) {
		
		int rows =5;

		System.out.println("TRIANGLE CODE");
		
		System.out.println("--------------");
		
		System.out.println();
		
		for(int i=1; i<=rows;i++) {// Outer Loop
			
			for(int j=rows; j>i;j--) { // Inner Loop to Print *
			
			System.out.print(" ");
							
			}
			
			for(int j=1;j<=i;j++) { // Inner Loop to Print Blank Space
				
			System.out.print("* ");

		}
		
			System.out.println();
	}

	}
	
}
