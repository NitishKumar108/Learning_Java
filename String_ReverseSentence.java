package com.core.String;

public class String_ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse The String.
		String s1 = "java is an oop language";
		String[] a = s1.split(" ");
		String s2 = " ";
		for(int i=a.length-1; i>=0; i--)
		{
			s2 += a[i];
			if(i != 0)
				s2 += " ";
		}
		System.out.println(s2);
	}

}
