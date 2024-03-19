package com.advjava.generics;

//Generic class with multiple type parameters
public class GenericClass1<T, U> {
	T obj1; //An object of type T
	U obj2; //An object of type U
	
	GenericClass1(T obj1, U obj2){ //Constructor
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
