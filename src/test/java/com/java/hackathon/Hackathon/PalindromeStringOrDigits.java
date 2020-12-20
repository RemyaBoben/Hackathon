package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class PalindromeStringOrDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.next();
		sWord=sWord.toLowerCase();
		checkPalindrome(sWord);
	}
	public static void checkPalindrome(String sWord) {
		char[] cArrRev= new char[sWord.length()];
		String test="";
		int size =sWord.length()-1;
		for(int i=size;i>=0;i--) {
			cArrRev[i]=sWord.charAt(i);
		}
		for(int i=size; i>=0;i--) {
			test=test+cArrRev[i];
		}
		if(test.equals(sWord)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}
}
