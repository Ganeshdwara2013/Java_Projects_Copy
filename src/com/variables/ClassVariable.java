package com.variables;

public class ClassVariable {
	
//class variable must be inside the class and outside the method
	
//its life cycle is through out the class
	
//no need to initialize the class variable i.e., it is not mandatory but it works
	
//if the class variable is not initialized, it will give the output as 'Default Value'(0).
	
	int c;

	int b = 24;
	
	public static void main(String[] args) {
		
		ClassVariable obj = new ClassVariable();
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
	}
	
}
