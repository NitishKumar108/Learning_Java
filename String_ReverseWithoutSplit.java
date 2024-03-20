package com.core.String;

public class String_ReverseWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the sentence without using Split() method.
		String s1 = "java is an oop language";
		char[] a = s1.toCharArray();
		String s2 = "";
		int i = a.length-1, j=a.length-1;
		while(j>-1)
		{
			while(j>-1 && a[j] != ' ') j--;
			String t=" ";
			int k=j+1;
			
			while(k<=i)
				t += a[k++];
			s2 += t;
			if(j>-1)
				s2 +="";
			i = --j;
		}
		System.out.println(s2);

	}

}
