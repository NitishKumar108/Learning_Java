package com.advjava.generics;

//Generic class with multiple type parameters
public class GenericClassExample1 {

	public static void main(String[] args) {
		GenericClass1<Integer, String> obj = new GenericClass1<Integer, String>(108, "Mahadev");
		obj.print();
	}

}
