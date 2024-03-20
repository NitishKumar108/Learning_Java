package com.core.String;

public class String_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The split the string into an character array.
		String s1 = "java is an oop language.";
		String[] a = s1.split(" ");
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
