package com.problems;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
//	 k = 7;
//	 
//	 k = 7%1 ----> 0
//			 
//	 k = 7%2 ----->1
//	 
//	 k = 7%3 ----->1
//	 
//	 k = 7%4 ----->3
//	 
//	 k = 7%5 ----->2
//	 
//	 k  =7%6 ----> 1
//	 
//	 k = 7%7 ----> 0
		
	int n, k;
		
	int flag = 0;
		
	Scanner s = new Scanner(System.in);
	 
    System.out.println("Enter Any Number");
    
    n = s.nextInt();
    
    System.out.println("Entered Number is " + n);
    
    for(int i = 2; i<n; ++i) {
    	
    	k = n%i;
    	
    	if(k==0) {
    		
    		flag = flag+1; // (or) flag++
    	}
    }
    
    System.out.println("Flag Value is "+ flag);
    
    if (flag ==0) {
    	
    	System.out.println("It is Prime Number");
    	
       } else {
    		
    		System.out.println("It is Not a Prime Number");
    	 }
    	
    }	
}
