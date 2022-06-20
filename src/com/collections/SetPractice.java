package com.collections;

import java.util.HashSet;

import java.util.LinkedHashSet;

import java.util.Set;

import java.util.TreeSet;

public class SetPractice {
	
	public static void main(String[] args) {
		
// There are 3 types of sets.
		
// HashSet, Linked HashSet and Tree Set.
		
// Refer Day-16 Notes for Additional reference.
		
// 1) Add:-
		
   Set<Integer> s1 = new HashSet<Integer>(); // HashSet
   
   s1.add(12);
   
   s1.add(20);
   
   s1.add(25);
   
   s1.add(null);
   
   s1.add(null); //HashSet Only allow Single Null Value. It will not allow Duplicate Null Value.
   
   s1.add(20); // Duplicate not allowed.
   
   System.out.println(s1);
   
   Set<Integer> s2 = new LinkedHashSet<Integer>(); // Linked Hashset

   s2.add(20);
   
   s2.add(12);
   
   s2.add(13);
   
   s2.add(25);
   
   s2.add(null);
   
   s2.add(null); // LinkedHashSet Only allow Single Null Value. It will not allow Duplicate Null Value.
   
   s2.add(25); // Duplicate not allowed.
   
   System.out.println(s2);
   
   Set<Integer> s3 = new TreeSet<Integer>(); // Tree Set

   s3.add(12);
   
   s3.add(20);
   
   s3.add(25);
      
 //  s3.add(null); // Tree set will not Allow even Single Null Value.
   
   s3.add(12); // Duplicate not allowed.
   
   System.out.println(s3);
   
   System.out.println("***********---------------****");
   
// 2) Size:-
   
   int si1 = s1.size();
   
   int si2 = s2.size();

   int si3 = s3.size();
   
   System.out.println(si1);
   
   System.out.println(si2);

   System.out.println(si3);
   
   System.out.println("***********---------------****");
   
// 3) Contains:-
  
   boolean co1 = s1.contains(20);
   
   boolean co2 = s1.contains(12);
   
   boolean co3 = s1.contains(14);
   
   System.out.println(co1);
   
   System.out.println(co2);
   
   System.out.println(co3);

   System.out.println("***********---------------****");
   
// 4) AddAll:-
   
   s1.addAll(s2);
   
   System.out.println(s1);
   
   s2.addAll(s3);
   
   System.out.println(s2);
   
   System.out.println("***********---------------****");
   
 // 5) RetainAll:- --> It Retains the Common Value.
   
   s1.retainAll(s2);
   
   System.out.println(s1);

   System.out.println("***********---------------****");

// 6) RemoveAll:- --> It Removes the Common Values.
   
   s2.removeAll(s3);
   
   System.out.println(s2);
   
   System.out.println("***********---------------****");

// 7) Clear:-
   
   s1.clear();
   
   System.out.println(s1);
   
   s2.clear();
   
   System.out.println(s2);
   
   System.out.println("***********---------------****");
   
 // 8) IsEmpty:- --> It checks whether the Particular Set is Empty or Not.
   
   boolean em1 = s1.isEmpty();
   
   boolean em2 = s2.isEmpty();
   
   boolean em3 = s3.isEmpty();
   
   System.out.println(em1);
  
   System.out.println(em2);
   
   System.out.println(em3);  
   
   System.out.println("***********---------------****");
   
	}

}
