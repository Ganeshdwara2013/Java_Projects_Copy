package com.abstraction;

public class People implements Mobileshop, Restaurent, Movie {
	
	// Task given in interface for MobileShop, Restaurant, Movie accessing People.

	// Interface should be used instead of class
	
	// Implements keyword should be used instead of extends in Interface topic.

	@Override
	public void movie() {
		
		System.out.println("2.0 Movie");
	}

	@Override
	public void restaurent() {
 
		System.out.println("Thalapakatti");
	}

	@Override
	public void mobileShop() {

		System.out.println("Realme Showroom");
	}
	
	public static void main(String[] args) {
		
		People obj = new People();
		
		obj.mobileShop();
		
		obj.movie();
		
		obj.restaurent();
	}

}
