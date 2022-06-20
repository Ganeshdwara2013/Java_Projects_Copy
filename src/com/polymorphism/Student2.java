package com.polymorphism;

public class Student2 extends College{

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
		
	 Student2 obj = new Student2();
	 
	 obj.studentName("Kishore");
	 
	 obj.studentMarks(490, 1190);
	 
	 obj.studentDetails(27, 6.1f, 'K');
	 
	}
	

}
