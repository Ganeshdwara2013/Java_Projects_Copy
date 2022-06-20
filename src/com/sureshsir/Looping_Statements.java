package com.sureshsir;

public class Looping_Statements {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <=3; i++) {
			System.out.println(i);
		}
		System.out.println("********");
		for (int i = 1; i <=3; i++) {
			System.out.println(i);
		}
		System.out.println("********");

		for(int i = 0; i<4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("********");

		for(int i = 0; i<4; i++) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("********");
						// Condition	//Iteration
		for(int i = 1; i<4; i++) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("********");
		for(int i = 1000; i>=998; i--) { // outer loop
			for (int j = 3; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("********");
		for(int i = 3; i>=1; i--) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
	}	
}
