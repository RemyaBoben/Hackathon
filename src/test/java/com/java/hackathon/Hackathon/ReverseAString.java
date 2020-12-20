package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.nextLine();
		reverseString(sWord);
	}
	public static void reverseString(String sWord) {
		char[] cArrRev= new char[sWord.length()];
		String test="";
		int size =sWord.length()-1;
		for(int i=size;i>=0;i--) {
			cArrRev[i]=sWord.charAt(i);
		}
		for(int i=size; i>=0;i--) {
			test=test+cArrRev[i];
		}
			System.out.println("Given String is : "+sWord);
			System.out.println("Reversed String is : "+test);
	}

}
