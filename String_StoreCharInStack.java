package com.core.String;

import java.util.Stack;

public class String_StoreCharInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to store character in a stack.s
		Stack<Character> st= new Stack<Character>();
		System.out.println(st.isEmpty());
		st.push('a');
		st.push('b');
		st.push('c');
		
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
