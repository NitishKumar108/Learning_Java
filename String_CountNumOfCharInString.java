package com.core.String;
//Important 

import java.util.Scanner;

public class String_CountNumOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count the number of characters in a string...
		
		System.out.println("Enter any String: ");
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		
		//One way...
		String s2 = "";
		while(s1.length()>0){
			char c = s1.charAt(0);
			String temp = s1.replace(""+c, "");
			int n = s1.length() - temp.length();
			s2 += n+""+c;
			s1 = temp;
		}
		System.out.println(s2);
		
		//Same Program In Different Way...
//		char[] a = s1.toCharArray();
//		String s2 = "";
//		int i = 0;
//		while(i<a.length)
//		{
//			char c = a[i];
//			int count = 1;
//			while(true)
//			{
//				i++;
//				if(i<a.length && a[i]==c)
//					count++;
//				else break;
//			}
//			s2 += count+""+c;
//		}
//		System.out.println(s2);
	}

}
