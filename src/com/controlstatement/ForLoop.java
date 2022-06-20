package com.controlstatement;

public class ForLoop {
	
	public static void main(String[] args) {
		
	

	//Let's see the For Loop below:- 
	
			// using For Loop to run 1 to 10.
			
			for(int i = 1; i<=10;i++) // for loop declaration // Post Increment
				
				System.out.println(i);
			
			System.out.println("---------x---------x-------");
			
			for(int x = 5; x>=1; x--) // Post Decrement
			
				System.out.println(x);
			
			System.out.println("---------x---------x-------");

			for(int y = 1; y<=4;++y) // Pre-Increment
				
				System.out.println(y);
		
			System.out.println("---------x---------x-------");
			
			for(int j = 4; j>=1;--j) // Pre-Decrement
				
				System.out.println(j);

	}
}
