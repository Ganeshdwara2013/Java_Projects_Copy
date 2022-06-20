package com.stringfunction;

public class EqulasIgnoreCase {
	
	public static void main(String[] args) {

		// It Ignores the Case Sensitive Method.
		
		String s = "Welcome to Java";

		boolean eiq = s.equalsIgnoreCase("welcome TO java");
		
		// Here " Welcome to Java" Given in different case than given in String declaration
		
		System.out.println(eiq);
	}

}
