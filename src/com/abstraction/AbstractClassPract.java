package com.abstraction;

public abstract class AbstractClassPract {
	
	public abstract void password(); //abstract method
	
	public void username() { // non-abstract method
		
		System.out.println("Ganesh123");
	}

}

// Here AmazonBackendTeam is an example for Partial abstraction (or) Abstract Class.

// every method has Signature part and Implementation part.

// if the Implementation part is not there, that is called as "Non-Abstract method".

// if a class is having only one class, we need to give that as abstract class and the method should also be abstract method.