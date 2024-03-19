package com.advjava.exception;

import java.util.Scanner;

public class FinallyWithOutCatch {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter value: ");
		try {
			int a = t.nextInt();
			int b = t.nextInt();
			int c = a/b;
			System.out.println(c);
		} 
		//We can use finally without catch
		finally { //used to write a piece of program that will always execute.
			System.out.println("Finally will always execute.");
			t.close(); //Used to close resource like Scanner.
		}
	}

}
