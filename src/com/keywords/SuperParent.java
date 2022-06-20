package com.keywords;

public class SuperParent {
	
// 'super' Keyword ---> Parent Class reference--> 
	
// 'this' Keyword ---> current class reference
	
	int a = 12;
	
	public void num1() {
		
		System.out.println(a);
		
	}
    
	public static void main(String[] args) {
		
		SuperParent obj = new SuperParent();
		
		obj.num1();
	
}
	
}
