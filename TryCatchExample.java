package com.advjava.exception;

import java.util.Scanner;

public class TryCatchExample {
	public static int add(String a, String b) {
		try {
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			return a1+b1;
		}
		catch(Exception e){
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two value to add: ");
		String a = scn.next();
		String b = scn.next();
		System.out.println(add(a,b));
	}

}
