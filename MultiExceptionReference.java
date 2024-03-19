package com.advjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiExceptionReference {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter value: ");
		try {
			int a = t.nextInt();
			int b = t.nextInt();
			int c = a/b;
			System.out.println(c);
		} 
		// We can use multiple exception reference.
		catch(ArithmeticException|InputMismatchException  e) {
			e.printStackTrace();
		}
	}

}
