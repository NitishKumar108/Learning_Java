package com.core.String;
//import java.lang.String;
class Student
{
	String name;
	Student(String s)
	{
		name=s;
	}
}

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("raj");
		String str1 = new String("JAVA");
		String str2 = "JAVA";
		
		System.out.println(st1); //Address: com.core.String.Student@3fee733d
		System.out.println(str1); //JAVA
		System.out.println(str2); //JAVA
		System.out.println(str1==str2); //false

	}

}
