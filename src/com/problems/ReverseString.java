package com.problems;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Welcome to Java";
		char[] ca = s.toCharArray();
		System.out.println(ca);
		StringBuilder sb = new StringBuilder();
		for(int i = ca.length-1;i>=0; i--) {
			sb.append(ca[i]);	
		}
		System.out.println(sb.toString());
		
	}

}
