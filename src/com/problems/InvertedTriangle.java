package com.problems;

public class InvertedTriangle {
	
	public static void main(String[] args) {

		int rows =5;    
        
        System.out.println("INVERTED TRIANGLE");
        
        System.out.println("-----------------");
   
        for(int i=rows;i>=1;i--)//For rows
        	
         {
       
          for(int j=rows-i;j>=1;j--)//For space
                	  
            {
                	  
      	      System.out.print(" ");   
      	   
               }
      
          for(int k=1;k<=i; k++) //To print in column
             
           {
               
        	 System.out.print("* "); 
            
              }

      System.out.println( );

  }

 }

}
