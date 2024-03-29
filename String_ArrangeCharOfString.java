package com.core.String;

//Important...
//Find number of ways to arrange the given string...

public class String_ArrangeCharOfString 
{
	static String swap(String s, int i, int j)
	{
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String(a);
	}
	
	static void permutation(String s, int start, int end)
	{
		if(start>=end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start; i<=end; i++)
		{
			String s1 = swap(s, start, i);
			permutation(s1, start+1, end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find number of ways to arrange the given string...
		
		permutation("abc", 0,2);
	}

}
