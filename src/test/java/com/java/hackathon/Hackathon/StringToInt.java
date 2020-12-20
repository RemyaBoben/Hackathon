package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String sWord = "ReMyA";
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.next();
		System.out.println("Given String is: "+sWord);
		int output =stringToInt(sWord);
		System.out.println("int value of Given String is: "+output);
	}
	static int stringToInt(String sWord){
		char[] cArr = new char[sWord.length()];
		cArr=sWord.toCharArray();
		int output =0;
		for(int i=0;i<cArr.length;i++) {
			
			output =output+(int)cArr[i];
		}
		return output;
	}

}
