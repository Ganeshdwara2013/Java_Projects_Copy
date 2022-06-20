package com.variables;

public class VariablePractice {
	
// within the method giving variable is called Local Variable

// within the class given variable is called Class or Instance Variable
	
	
	int b = 20; // Class Variable or Instance Variable
	
	static int c = 30; // Static Variable not requires objects to call the method.
	

public void localVariable() {
 
	int a = 10; // Local Variable
		
		System.out.println(a);
}

public static void main(String[] args) {
	
	VariablePractice obj = new VariablePractice();
	
	obj.localVariable();
	
	System.out.println(obj.b); // Object not created for 'b' so within the print statement calling object directly. 

    System.out.println(c); // Since 'c' is a static variable, we are not required to call by using method.

}


}
