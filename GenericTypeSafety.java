package com.advjava.generics;

import java.util.ArrayList;

public class GenericTypeSafety {

	public static void main(String[] args) {
		// Java program to demonstrate that NOT using
		// generics can cause run time exceptions
		// Creatinga an ArrayList without any type specified
//        ArrayList al = new ArrayList();
//        
//        al.add("Ram");
//        al.add("Mahadev");
//        al.add(108); //compiler allow this
//        
//        String s1 = (String)al.get(0);
//        String s2 = (String)al.get(1);
//        String s3 = (String)al.get(2); //cause runtime exception
//        
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        
//        System.out.println("==============================");
        
		// Using Java Generics converts run time exceptions into compile time exception.
		// Creating a an ArrayList with String specified
          ArrayList<String> al = new ArrayList<String>();
          
          al.add("Rocky");
          al.add("Adhira");
          al.add("Garuda");
          
//          al.add(108); //compiler doesn't allow this
          
          String s1 = (String)al.get(0);
          String s2 = (String)al.get(1);
          String s3 = (String)al.get(2);
          
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);
	}

}
