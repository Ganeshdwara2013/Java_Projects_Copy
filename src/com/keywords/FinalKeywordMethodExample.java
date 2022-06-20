package com.keywords;

public class FinalKeywordMethodExample extends FinalKeyword {
	
//This Class is created for the use of MethodOverriden not possible by using FinalKeyword
	
// If this needs to check use Final keyword in FinalKeyword Class without using '//' in Line # 13 & 17.

// Refer FinalKeyword Line # 15 & 19 for Additional reference.	
	@Override
	public void number() {
 
		super.number();
			
	}
	
	public static void main(String[] args) {
		
		FinalKeywordMethodExample obj = new FinalKeywordMethodExample();
		
		obj.number();
		
	}

}
