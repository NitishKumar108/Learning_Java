package com.advjava.generics;

public class GenericMethod {
	//A generic method 
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
	}
	
	public static void main(String[] args) {
		// Calling generic method with Integer argument
		genericDisplay(108);
		// Calling generic method with String argument
		genericDisplay("Mahadev");
		// Calling generic method with Double argument
		genericDisplay(108.108);
	}
}
