package com.collections;

import java.util.LinkedList;

import java.util.List;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		
// Vector List practice was not done and "Dinesh Bro" said, it is given only for the knowledge Purposes.
		
		List<Object> s1 = new LinkedList<Object>();
		
		List<Object> s2 = new LinkedList<Object>();
		
		List<Object> s3 = new LinkedList<Object>();
		
		s1.add(2013);
				
		System.out.println(s1);
				
		System.out.println(s1.size());
		
		s1.get(0);
		
		System.out.println(s1);
		
		s1.set(0, 1320);
		
		System.out.println(s1);
		
		s1.remove(0);
		
		System.out.println(s1);
		
		s1.add(2014);
		
		s1.add(1330);
		
		System.out.println(s1);
		
		int indexOf = s1.indexOf(1330);
		
		System.out.println(indexOf);

	    boolean contains = s1.contains(2014);
	
	    System.out.println(contains);
	    
	    s1.clear();
	    
	    System.out.println(s1);
	    
	    s1.add(1997);
	    
	    s1.add(1996);
	    
	    System.out.println(s1);
	    
	    s2.add(2022);
	    
        s2.add(2021);
	    
	    System.out.println(s2);
	   

//	    s1.addAll(s2);
	    
//      System.out.println(s1);
	    
	    s3.add(2022);
	    
	    s3.add(1996);
	    
	    System.out.println(s3);
	    
//	    s2.retainAll(s3);
	    
//	    System.out.println(s2);
	    
	    s3.removeAll(s2);
	    
	    System.out.println(s3);
	    
	}

}
