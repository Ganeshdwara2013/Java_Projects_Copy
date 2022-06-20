package com.abstraction;

public class AmazonBackendTeam extends AbstractClassPract{

	@Override
	public void password() {
 
		System.out.println("Welcome$1");
	
	}

	@Override
	public void username() {
 
		super.username();
	}
	
	
	public static void main(String[] args) {
		
		AmazonBackendTeam obj = new AmazonBackendTeam();
				
		 obj.username();
		 obj.password();
	}
	

}
