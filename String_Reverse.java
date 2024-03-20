package com.core.String;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) 
	{
		String s, s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		s=sc.nextLine();
		// TODO Auto-generated method stub
		
		for(int i=s.length()-1; i>=0; i--)
		{
			s1 += s.charAt(i);
		}
		System.out.println(s1);
	}
}


