package com.core.String;
//Important

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("MALAYALAM"));
		System.out.println(isPalindrome("hanuman"));
	}
	
	static boolean isPalindrome(String arg){
		char[] a = arg.toCharArray();
		int i=0, j=a.length-1;
		
		while(i<j){
			if(a[i] != a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
