package com.scannerclass;

import java.util.Scanner;

public class TaskSuperMarket {
	
	//Task Given on Supermarket in Scanner Class.
	
	public static void main(String[] args) {
		
		Scanner m =  new Scanner(System.in);
		
		// M refers Market
		
		System.out.println("Enter the Product Name:-");
		
		String product = m.nextLine();
		
		System.out.println("The Product Name is " + product);
		
		System.out.println("Enter the Product Code:-");
		
		int productCode = m.nextInt();
		
		System.out.println("The Product Code is " + productCode);
		
		System.out.println("Enter the Weight of the Product:-");
		
		float weight = m.nextFloat();
		
		System.out.println("The Weight of the Product is "+ weight + " Kilograms");
		
		System.out.println("Enter the Category:-");
		
		char category = m.next().charAt(0);
		
		System.out.println("The Product Category is " + category);
		
        System.out.println("Enter the Brand Name:-");
		
		String brand = m.next();
	
		System.out.println("The Brand Name is " + brand);
	}

}
