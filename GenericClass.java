package com.advjava.generics;

//Java program to show working of user defined Generic classes
//We use < > to specify Parameter type
public class GenericClass<T> {
	//An object of type T is declared
	T obj;
	GenericClass(T obj){ //constructor
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
	
}
