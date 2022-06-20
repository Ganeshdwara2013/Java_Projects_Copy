package com.collections;

import java.util.ArrayList; // Array List Import by declaring Array List "Error Message"

import java.util.List; // List Import by declaring List shows "Error Message"

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		List<Object> s1 = new ArrayList<Object>(); // Array List Declaration (1)
		
//two types of methods used for output purpose
		
//Let's see the List Methods here
		
// 1) add() ---> it will add data's within the array
		
		System.out.println("Add");
		
		s1.add(12);
		
		s1.add(3.4);
		
		s1.add("Ganesh");
		
		s1.add('r');
		
		s1.add(12);
		
		s1.add(122);
				
		System.out.println(s1);
		
		List<Object> s2 = new ArrayList<Object>(); // Array List Declaration (2)
		
		s2.add(12);
		
		s2.add(3.5);
		
		s2.add("Kishore");
		
		s2.add('k');
		
		System.out.println(s2);
		
		System.out.println("******************");


// 2) size() ---> it determines the size(No. of Inputs) of the array list.
		
		System.out.println("Size");
		
		int si = s1.size();
		
		System.out.println(si);
		
		System.out.println(s2.size());
		
		System.out.println("******************");
		
// 3) get() --> it will retrieve the data from Array list used Index number
		
		System.out.println("Get");
		
		Object ob1 = s1.get(3);
		
		System.out.println(ob1);
	
		System.out.println(s2.get(2));
		
		System.out.println("******************");

// 4) set() --> it will set the array list by replacing one value by another.
		
		System.out.println("Set");

		s1.set(0, 13);
		
		s2.set(1, 4.5);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println("******************");

// 5) remove()---> it removes the particular value by giving index value.

		System.out.println("Remove");

		s1.remove(5);
		
		s2.remove(2);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println("******************");
		
// 6) indexOf() --> it will retrieve the index of the particular value
		
		System.out.println("Index Of");

		int io1 = s1.indexOf("Ganesh");
		
		int io2 = s2.indexOf(4.5);
		
		System.out.println(io1);
		
		System.out.println(io2);

		System.out.println("******************");

// 7) contains() ---> it checks whether the particular value present in the ArrayList(or) Not.
		
		System.out.println("Contains");

		boolean co1 = s1.contains(1);

        boolean co2 = s2.contains(4.5);
        
		System.out.println(co1);
		
		System.out.println(co2);

		System.out.println("******************");

// 8) clear() ---> it will clears all the data's in the  Array List.
		
		System.out.println("Clear");
		
		List<Object> s3 = new ArrayList<Object>(); // Array List Declaration (3)
		
		s3.add(2013);
		
		s3.add(6.7);
		
		s3.add("Friend");
		
		System.out.println(s3);
		
        s3.clear();	// 'clear' method declaration	
		
		System.out.println(s3);
		
		System.out.println("******************");
		
		List<Object> s4 = new ArrayList<Object>(); // Array List Declaration (4)

        s4.add(12);
        
        s4.add(2.5);
        
        s4.add("Ganesh");
        
        System.out.println(s4);
        
		List<Object> s5 = new ArrayList<Object>(); // Array List Declaration (5)
		
        s5.add(13);
        
        s5.add(2.5);
        
        s5.add("Kishore");
        
        System.out.println(s5);
		
//9) addall()---> it will add all the data's between two or many(based on input) array list.
		
		System.out.println("Add All");

		s4.addAll(s5);
				
		System.out.println(s4);
		
//		s5.addAll(s4); //Learning Scenario

//		System.out.println(s5); // Learning Scenario
		
		System.out.println("******************");
		
		List<Object> s6 = new ArrayList<Object>(); // Array List Declaration (6)
		
		s6.add(13);
		
		s6.add(20);
		
		s6.add(12.5);
		
		System.out.println(s6);
		
		List<Object> s7 = new ArrayList<Object>(); // Array List Declaration (7)
		
        s7.add(20);
		
		s7.add(1.3);
		
		s7.add('D');
		
		System.out.println(s7);

		
// 10) retainall()---> it will return common values between the array list.
		
		System.out.println("Retain All");

		s6.retainAll(s7);
		
		System.out.println(s6);
		
		System.out.println("******************");

// 11) removeall()---> it will remove the common values	between the strings.
		
		System.out.println("Remove All");
		
		List<Object> s8 = new ArrayList<Object>(); // Array List Declaration (8)
   
		s8.add(20);
		
		s8.add(200.12);
		
		s8.add('Y');
		
		s8.add("Bad");
		
		System.out.println(s8);
		
		List<Object> s9 = new ArrayList<Object>(); // Array List Declaration (9)

		s9.add(200.12);
		
		s9.add(13);
		
		s9.add('Y');
		
		s9.add("Good");
		
		System.out.println(s9);
		
	    s8.removeAll(s9);
		
	    System.out.println(s8);
		
 //       s9.removeAll(s8);  // Learning Scenario
		
 //      System.out.println(s9); // Learning Scenario
		
		System.out.println("******************");
		
// Totally 9 ArrayList declaration has been used.

	}

}
