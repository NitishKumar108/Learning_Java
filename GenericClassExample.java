package com.advjava.generics;

public class GenericClassExample {

	public static void main(String[] args) {
		//Instance of Integer type
		GenericClass<Integer> iObj = new GenericClass<Integer>(108);
		System.out.println(iObj.getObject());
		
		//Instance of String type
		GenericClass<String> sObj = new GenericClass<String>("Jai Shree Ram");
		System.out.println(sObj.getObject());
	}

}
