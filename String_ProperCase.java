package com.core.String;

public class String_ProperCase {
	
	static String properCase(String s){
		String s1 = s.substring(0,1).toUpperCase();
		String s2 = s.substring(1).toLowerCase();
		return s1+s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to print the first letter of sentence in Upper case.

		String s1 = "java is an easy language.";
		String[] a = s1.split(" ");
		String s2 = " ";
		
		for(int i=0; i<a.length; i++){
			s2 += properCase(a[i]);
			if(i != a.length-1)
				s2 += " ";
		}
		System.out.println(s2);
	}

}
