package com.collections;

import java.util.Collection;

import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

import java.util.TreeMap;

public class MapPractice {
	
	public static void main(String[] args) {
		
// Key+ Value = One Entry (Key & Value Pair)
		
// "Key" should always be unique.
		
// Map will Store the data in {}.
		
// Entry Set is used to Change the data's from Map{} to Set[]. 
		
// It will Not Allow Duplicate Values, it can be override.
		
// It will Allow only the over rided Null values.
		
// Syntax is--->Map<Key,Value> refName= new TypesofMap<Key,Value>();
		
// HashMap, LinkedHashMap, TreeMap.
		
// Different types of methods below:-
		
	Map<Integer,String> m1 = new HashMap<Integer, String>();
		
	Map<Integer,String> m2 = new LinkedHashMap<Integer, String>();
			
	Map<Integer,String> m3 = new TreeMap<Integer, String>();
			
		
// 1) Put:-
		
	m1.put(11, "Java");
	
	m1.put(13, "JavaScript");
	
	m1.put(12, "C");
	
	m1.put(14, "C++");
	
	m1.put(15, "CSS");
	
	System.out.println(m1);
		
    m2.put(21, "Ganesh");
	
	m2.put(22, "Kishore");
		
	m2.put(22, "Gopi"); // It will take last data as result if we give the Key value given as Duplicate.
	
	m2.put(23, "Gokul");
	
	m2.put(24, "Dinesh");
		
	System.out.println(m2);
	
	m3.put(31, "Andhra");
	
	m3.put(31, "Chennai");
	
	m3.put(32, "Chennai"); // If the Value is Same, but key is different, it will take the last transaction has output for the key.
	
	m3.put(33, "Kerala");
	
	System.out.println(m3);
	
	System.out.println("******-----******");
	
// 2) Size:- 	
		
	int si = m1.size();
		
	System.out.println(si);
	
	System.out.println("******-----****");

// 3) Get:-
	
	String ge1 = m1.get(12);
	
	System.out.println(ge1);
	
	String ge2 = m1.get(14);
	
	System.out.println(ge2);
	
	System.out.println("******-----****");

// 4) EntrySet:---> It will change the data's from Map{} to Set[].
	
	Set<Entry<Integer, String>> es = m1.entrySet();
	
	System.out.println(es); // {} changed to [].

	System.out.println("******-----****");

// 5) KeySet:- ---> It will retrieve the Key's in the data.
	
	Set<Integer> ks = m1.keySet();
	
	System.out.println(ks);
	
	System.out.println("******-----*******");
	
// 6) Value:- ---> It will retrieve the value's in the data.
	
	Collection<String> va = m1.values();
	
	System.out.println(va);
	
	System.out.println("******-----*******");

// 7) ContainsKey:- --> It will check the particular Key data is present or not.
	
	boolean co1 = m1.containsKey(11);
	
	System.out.println(co1);
	
    boolean co2 = m1.containsKey(16);
	
	System.out.println(co2);
	
	System.out.println("******-----*******");

// 8) ContainsValue:- --> It will check the particular Value is present in the data or not.

	boolean cv1 = m1.containsValue("JavaScript");
	
	System.out.println(cv1);

    boolean cv2 = m1.containsValue("Python");
	
	System.out.println(cv2);
	
	System.out.println("******-----*******");
		
// LinkedHashMap and TreeMap also Like Same Concepts, so practice along with some examples.

	}
	
}
