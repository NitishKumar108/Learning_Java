package com.core.String;

public class String_ReverseUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the sentence Using Array.
		System.out.println(reverse("java is an"));
	}
	static String reverse(String arg)
	{
		char[] a = arg.toCharArray();
		int i=0, j=a.length-1;
		while(i<j)
		{
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		String s1 = new String(a);
		return s1;
	}
}
