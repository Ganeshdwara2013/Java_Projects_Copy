package com.polymorphism;

public class Student1 extends College{
	
	//Right Click-->Source--->Override
	
	// Parent Class is also called as Super Class
	
	// Child class is also called as Sub Class

	@Override
	public void studentName(String name) {

		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, char initial) {

		super.studentDetails(age, height, initial);
	}

	@Override
	public void studentMarks(int tenth, int twelth) {

		super.studentMarks(tenth, twelth);
	}

	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		
		obj.studentName("Ganesh");
		
		obj.studentMarks(458, 1006);
		
		obj.studentDetails(24, 5.5f, 'R');
		
	}
}
