package com.core.String;

import java.util.Scanner;

public class String_SwapTwoNumberWIthoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers for swap: ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		//Write logic for swapping two numbers without using a 3rd number.
//		System.out.println("Two numbers before swapping are: "+"\nn1= "+n1+"\nn2= "+n2);
//		
//		n1 = n1 + n2;
//		n2 = n1 - n2;
//		n1 = n1 - n2;
//		
//		System.out.println("Two numbers after swapping are: "+"\nn1= "+n1+"\nn2= "+n2);
//		
		//Write logic for swapping two numbers with using a 3rd number.
		System.out.println("Two numbers before swapping are: "+"\nn1= "+n1+"\nn2= "+n2);
		int c;
		c = n1;
		n1 = n2;
		n2 = c;
		
		System.out.println("Two numbers after swapping are: "+"\nn1= "+n1+"\nn2= "+n2);
	}

}
