package com.problems;

public class ArmstrongNumber {

	public static void main(String[] args) {

// Armstrong Number means, the sum of its own digits raised to the power number of digits gives the number itself.
// 153, 370, 371 is an armstrong Number.
		
		System.out.println("Armstrong Steps Below:- \r\n"+
				"   	num = 153, ans =0, temp = num;\r\n" + 
				"	rem = num%10 =153%10 = 3;\r\n" + 
				"	num = num/10 = 153/10 = 15;\r\n" + 
				"	ans = ans+(rem*rem*rem) = (0)+(3*3*3) = 27;\r\n" + 
				"	-----------------\r\n" + 
				"	rem = num%10 = 15%10 = 5;\r\n" + 
				"	num = num/10 = 15/10 = 1;\r\n" + 
				"	ans = ans+(rem*rem*rem) = (27)+(5*5*5) = 152;\r\n" +
				"	-----------------\r\n" +
				"	// Steps need to continue(dont know to continue by me) \r\n" +
				"	----------------------------\r\n" );
		
		for (int i=100;i<1000;i++) {
			
		int r, n = i, ans = 0; // Change the n value here & Remove for Loop to get Armstrong Number Answer.
		int temp = n;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			ans = ans+(r*r*r);
		} 
		
		if (temp==ans) { // temp!=(Not Equal to) given means that Not a Amstrong Number answer will be retreived.
			System.out.println(ans + " --> Armstrong Number");
		} 	
   }
 }
}