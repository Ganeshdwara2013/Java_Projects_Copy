package com.polymorphism;

public class MethodOverloaidingPract {

	public void studentDetails(String name) 
	
	{
		
		System.out.println(name);
		
	}
		
		public void studentDetails(int age, float height, char initial)
		
		{
			
			System.out.println(age +" "+ height+" "+ initial);
			
		}
		
		public void studentDetails(int m1,int m2, int m3) 
		
		{
			
			
			System.out.println(m1+" "+m2+" "+m3);
		}
		
		
		public static void main(String[] args)
		
		{
			
			
		MethodOverloaidingPract obj = new MethodOverloaidingPract();
		
		obj.studentDetails("Gokul");
		
		obj.studentDetails(24, 5.5f, 'R');
		
		obj.studentDetails(98, 99, 100);
		
		}
		
	}
	

