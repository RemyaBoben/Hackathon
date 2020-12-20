package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class StringUpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String sWord = "ReMyA";
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.next();
		System.out.println("Given String is: "+sWord);
		String output =upperToLower(sWord);
		System.out.println("Lower case Srting is : "+output);
		
	}
	static String upperToLower(String sWord){
		char[] cArr = new char[sWord.length()];
		cArr=sWord.toCharArray();
		String output ="";
		for(int i=0;i<cArr.length;i++) {
			if(cArr[i]>=65 && cArr[i]<=90) {
				cArr[i] = (char)(cArr[i]+32);
			}
			output =output+cArr[i];
		}
		return output;
	}

}
