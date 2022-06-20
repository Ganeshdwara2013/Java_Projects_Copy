package com.problems;

public class PalindromeNumber {

	public static void main(String[] args) {

// If a number or String, which is reversed (or) gives same value means. It is called a Palindrome.
// Example:- 131,222, Madam, Malayalam
// Steps:- Variable Initialize--> To Write Logic--> Using Loop for Mutiple times--> compare if else statement
	
// Steps Here:- Palindrome Number:- 131,2222
		
		System.out.println("Palindrome Steps Below:- \r\n"+
				"   	num = 131, ans =0, temp = num;\r\n" + 
				"	rem = num%10 =131%10 = 1;\r\n" + 
				"	num = num/10 = 131/10 = 13;\r\n" + 
				"	ans = (ans * 10)+rem = (0*10)+1 = 1;\r\n" + 
				"	-----------------\r\n" + 
				"	rem = 13%10 = 13%10 = 3;\r\n" + 
				"	num = 13/10 = 13/10 = 10;\r\n" + 
				"	ans = (ans * 10)+rem = (1*10)+3 = 13;\r\n" +
				" 	-----------------****----------"); 
		
		
		for(int i =1; i<100;i++) {
		
		
		int r, n=i, ans = 0; // Change the n value here and get Palindrome Answer.
		int temp = n;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			ans = (ans*10)+r;
		} 
		
		if (temp==ans) { // temp!=(Not Equal to) given means that answer will be retreived.
			System.out.println(ans + "Palindrome");
		} else {
			System.out.println(ans + "This is Not a Palindrome");
		}
			
	}
}
}