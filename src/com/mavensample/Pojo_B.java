package com.mavensample;

public class Pojo_B {

	public static void main(String[] args) {

// without using extends keyword, the below line created because the reason is public access specifier is used there.		
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		System.out.println(age); // this line prints age is 25.
		
		a.setAge(35);
		
// once the value has been set, we need to get the method first and then we need to run.		
		
		int age2 = a.getAge(); // getting the new set age as 35
		System.out.println(age2); // this line prints the age as 35.
		
		a.setAge(45); // again setting the age as 45
		
// again we need to get the method and run.
		
		int age3 = a.getAge();
		System.out.println(age3);
		
	}
}
