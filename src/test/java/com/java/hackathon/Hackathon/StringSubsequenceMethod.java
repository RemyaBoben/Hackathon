package com.java.hackathon.Hackathon;

public class StringSubsequenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "remya";
		System.out.println(s.subSequence(0, 3));
		CharSequence c=s.subSequence(0, 3);
		System.out.println((c.charAt(0)));
		
		
		// subSequence is a method available for string class.
		// it is similar to subString ,like substring arguments for subSequence are beginIndex and endIndex
		// it will return a CharSequence Object
	}

}
