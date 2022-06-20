package com.polymorphism;

public class Student3 extends College{

	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, char initial) {
 
		super.studentDetails(age, height, initial);
	}
	
	// Here below StudentPhone created as new without any prior object created in paarent class.
	
	// the main advantage of using MethodOverriding is we can modify(Adding new Object, etc.,)
	
	//Whereas in Inheritance we will not be able to modify.
	
	public void studentphone(long number) {

		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		Student3 obj = new Student3();
		
		obj.studentName("Dinesh");
		
		obj.studentDetails(28, 5.6f,'S');
		
		obj.studentphone(1360540836);
	}
	
	
	
}
