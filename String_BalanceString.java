package com.core.String;

import java.util.Stack;

public class String_BalanceString {
	static boolean isBalance(String s){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
			char c=s.charAt(i);
			if(c=='[' || c=='{' || c=='('){
				stack.push(c);
				}
			else if(c==']' || c=='}' || c==')'){
				if(stack.isEmpty() || pair(stack.pop(), c));
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	static boolean pair(char c1, char c2){
		if(c1=='[' && c2==']') return true;
		if(c1=='{' && c2=='}') return true;
		if(c1=='(' && c2==')') return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "()(())";
		if(isBalance(str))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
