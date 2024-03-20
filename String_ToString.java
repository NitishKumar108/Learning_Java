package com.core.String;

class Circle{
	int radius;
	Circle(int r){
		radius = r;
	}
	@Override
	public String toString() {
		return "Circle[radius = "+radius+"]";
	}
}
public class String_ToString {

	public static void main(String[] args) {
		Circle[] a = new Circle[5];
		a[0] = new Circle(40);
		a[1] = new Circle(20);
		a[2] = new Circle(50);
		a[3] = new Circle(80);
		a[4] = new Circle(70);
		
		for(Circle c:a) System.out.println(c);
	}

}
