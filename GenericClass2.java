package com.advjava.generics;

//Java program to show working of user-defined Generic classes
public class GenericClass2<T> {
	T obj;
	GenericClass2(T obj){ this.obj = obj;} //constructor
	public T getObject() { return this.obj;}
}
