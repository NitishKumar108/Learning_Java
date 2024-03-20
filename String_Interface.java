package com.core.String;

interface Animal{
	void makeSound();
}
class Dog implements Animal{
	public void makeSound() {System.out.println("Bow...Bow...");}
	public void jump() {System.out.println("Jumped");}
}
class Cat implements Animal{
	public void makeSound() {System.out.println("Mew...Mew...");}
	public void drink() {System.out.println("Drinking");}
}
public class String_Interface {

	public static void main(String[] args) {
		Animal[] a = new Animal[4];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Cat();
		a[3] = new Dog();
		
		for(Animal animal:a) animal.makeSound();
		for(Animal animal:a) {
			if(animal instanceof Dog) ((Dog)animal).jump();
		}
	}

}
