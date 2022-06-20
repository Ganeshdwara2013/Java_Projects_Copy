package com.exception;

public class UserDefinedException {
	
	public static void validate(int age) throws Exception { // static keyword is used here, so no need to create a object to call this method. // throws exception is used in this line.
		
// throw & throws is called as user-defined exception.
		
// Refer Day - 18 notes for "Additional Reference".
		
		if(age<18) {
		
		throw new Exception("Not Eligible to Vote"); // throw exception is used here. // if we enter "throw new" here means, it will show error message, by following the error scenario fix, we need to enter the throw Exception to proceed further.
		
		} else {
			
			System.out.println("Eligible to Vote");
		}
		
	}
	
	public static void main(String[] args) throws Exception { // throws Exception is used in this line.
		
		validate(20);
		
	//	validate(15); // this line will show the user defined exception message.
		
// 1) throw:-
		
// * It is inside the method.
		
// * It will throw the exception.
		
// * Throw, It will throw only one exception.
		
// 2) throws:-
		
// * It is in Method Level.
		
// * It will declare the exception.
		
// * Throws, it will declare more than one exception.
		
// throw & throws(Generally):- 
		
// * We should enter "throw new Exception", keyword to enter this exception.
		
// * It is given by the Developer, while doing the coding, to shows some error message like(Server Not found, Page Not Found, Check Your Internet Connectivity, etc.,.
	
		
	}

}
