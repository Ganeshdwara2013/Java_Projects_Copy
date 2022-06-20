package com.problems;

import java.util.HashMap;
import java.util.Map;

public class RepeatedLetterCount {

	public static void main(String[] args) {

// the below method is used to identify the numbers of letters in a string which repeats.
		
		String s = "java to python python to ruby ruby to java";
		String[] sp = s.split("");
		
// we are doing Key + value pair by using map, so key here is string so, string + Integer
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		System.out.println(m);
		
		for (String str : sp) {     // used to iterate and store in Array.
			if(m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i+1);
			} else  {
				m.put(str, 1);
				//System.out.println(m); // it was inside the loop so prints mutiple times.
			}
			
		}
		System.out.println(m);		
	}
				
}