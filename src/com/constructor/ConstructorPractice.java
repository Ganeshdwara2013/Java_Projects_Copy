package com.constructor;

public class ConstructorPractice {
	
//God Example Given ---> Class is "God" here.
	
//Class Name should be same as Constructor Method
	
//it is similar to Method but it is not a method
	
//it will not have any return type (void)

//two types (Parameterized & Non - Parameterized Constructor)
	
//No parameters or arguments given within the Construction section(Method) is called Non - Parameterized Constructor
	
//Parameters will be given inside the Parameterized Constructors.
	
	
	public ConstructorPractice() {
	
	System.out.println("Non - Parameterized Constructor"); // Non- parameterized or default constructor
	
	}
	
	
	public ConstructorPractice(String name) {  //Parameterized Constructor
		
		System.out.println(name);
		
		System.out.println("Parameterized Constructor");
		
	}
	
	public static void main(String[] args) {
	
		ConstructorPractice obj1 = new ConstructorPractice();
		
		ConstructorPractice obj2 = new ConstructorPractice("Kishore");
		
	}
	
}
