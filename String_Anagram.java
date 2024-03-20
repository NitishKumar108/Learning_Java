package com.core.String;

/*An anagram is a word or phrase formed by rearranging the letters of a different word 
or phrase, typically using all the original letters exactly once.
Ex: silent=listen, night=think, arc=car, cat=act, elbow=below, state=taste, race=care, 
part=trap, heart=earth, etc
*/
public class String_Anagram {
	static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		while(true) {
			if(s1.length() != s2.length()) return false;
			char c = s1.charAt(0);
			s1 = s1.replace(c+"","");
			s2 = s2.replace(c+"","");
			if(s1.length()==0 && s2.length()==0) return true;
		}
	}
	public static void main(String[] args) {
		// To find the anagram of a word.
		System.out.println(anagram("silent","listen"));
	}

}
