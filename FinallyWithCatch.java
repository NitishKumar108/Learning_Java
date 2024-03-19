package com.advjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyWithCatch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Value: ");
		try {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException|InputMismatchException  e) {
			System.out.println("Error occurred.");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally will always execute.");
			scn.close();
		}
	}

}
