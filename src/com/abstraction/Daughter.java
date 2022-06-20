package com.abstraction;

public class Daughter implements Father, Mother {
	
	// implements keyword used in Interface instead of extends

	@Override
	public void chain() {

		System.out.println("Gold Chain");
	}

	@Override
	public void car() {

		System.out.println("Maruthi");
	}

	@Override
	public void ring() {
		
        System.out.println("Diamond Ring");
		
	}

	@Override
	public void watch() {
		
     System.out.println("Titan");
		
	}
	
	
	public static void main(String[] args) {
		
		Daughter obj = new Daughter();
		
		obj.ring();
		
		obj.car();
		
		obj.chain();
		
		obj.watch();
		
	}

}
