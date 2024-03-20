package com.core.String;

import java.util.Scanner;

public class StringWriteCodeToSwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter string for swap: ");
		String s1 = scn.next();
		String s2 = scn.next();
		
		System.out.println("Two String before swapping are: "+"\ns1= "+s1+"\ns2= "+s2);
		s1 = s1 + s2;
		s2 = s1.substring(s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		System.out.println("Two String after swapping are: "+"\ns1= "+s1+"\ns2= "+s2);

	}

}
