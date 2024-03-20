package com.core.String;

import java.util.Scanner;

public class String_OccuranceOfWord {

	public static void main(String[] args) {
		// Occurance of word.
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s1 = scn.nextLine();
		
		System.out.println("Enter a word to count:");
		String s2 = scn.nextLine();
		
		String s3 = s1.replace(s2, "");
		
		int count = s1.length()-s3.length();
		int word = count/s2.length();
		System.out.println(s2+" exist "+word+" times." );
		
		
	}

}
