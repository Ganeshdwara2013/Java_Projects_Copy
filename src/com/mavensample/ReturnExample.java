package com.mavensample;

public class ReturnExample {
	
	static int age;
	
	public static int demo() {

		age = 25;
		System.out.println(age);
		return age;

		// age =50; // we can't change the variable value afer return to the method
	}

	public static void main(String[] args) {

		demo();
	}
}
