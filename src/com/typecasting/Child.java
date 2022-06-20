package com.typecasting;

public class Child extends Parent {
	
public void childMethod() {
		
		System.out.println("www.flipkart.com");
	}
	
	public static void main(String[] args) {
		
		Child obj2 = new Child();
		
		obj2.childMethod();
		
		
		Parent obj1 = new Child(); // upcasting
		
        obj1.parentMethod();
        
 // Here Parent obj1 ----> Parent Class Reference
        
 // new Child() ----> Child class Object
        
	}
	
	
//	Child obj2 = new Parent(); // downcasting is not possible in Java
	
//	obj2.childMethod();
	
	
	// Here Child obj2 ----> Child Class Reference
    
	 // new Parent() is ----> Parent Class Object
	

}
