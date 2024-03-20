package com.core.String;
//Important
public class StringPalindrome 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the number of Palindrome inside a given String.
		
		String s1 = "Malayalam";
		for(int i=0;i<s1.length()-1; i++)
		{
			for(int j=i+2; j<=s1.length(); j++)
			{
				String s2=s1.substring(i,j);
				//System.out.println(s2);
				
				if(isPalindrome(s2))
					System.out.println(s2);
			}
		}
	}
	
	static boolean isPalindrome(String s)
	{
		int i=0, j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
