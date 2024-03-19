package com.advjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultiCatchExample {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter value: ");
		try {
			int a = t.nextInt();
			int b = t.nextInt();
			int c = a/b;
			System.out.println(c);
//			t.close(); //Used to close resource like Scanner.
		} 
		catch(ArithmeticException e) {
			System.err.println("Math value problem.");
			e.printStackTrace();
		}
		catch(InputMismatchException e){
			System.err.println("Input value mismatch issue.");
		}
		catch(Exception e){
			System.err.println("All Exception handled.");
		}
	}

}
