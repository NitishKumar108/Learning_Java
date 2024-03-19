package com.advjava.generics;

public class GenericClassExample2 {

	public static void main(String[] args) {
		//Instance of Integer type
		GenericClass2<Integer> iObj = new GenericClass2<Integer>(108);
		System.out.println(iObj.getObject());
		
		//Instance of String type
		GenericClass2<String> sObj = new GenericClass2<String>("Har Har Mahadev");
		System.out.println(sObj.getObject());
		
		//iObj = sObj; // This give an error
	}

}
