package com.keywords;

public class ThisChild extends SuperParent {
	
	public void num1() {

		System.out.println("Retrieve Super Keyword Example"); // super keyword to call the value of 'a' from "SuperParent(Class Name)" Class
	}
	
	int b = 2013;
	
	public void num2() {
		
		System.out.println(b);
	}
	
	// below is the example for calling the Super Keyword and This Keyword together.
	
	public  void example() {

		super.num1();
				
		this.num2();
		
	}
	
	public static void main(String[] args) {
		
		ThisChild obj = new ThisChild();
		
		obj.num1();

		obj.example();
		
		obj.num2();

				
		
		
	}
}
