package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.nextLine();
		String[] sArr = new String[sWord.length()];
		sArr=sWord.split(" ");
		String output =reverseWordInString(sArr);
		System.out.println(output);
	}
	public static String reverseWordInString(String[] sArr) {
		String[] sArrRev= new String[sArr.length];
		String test="";
		int size =sArr.length-1;
		for(int i=size;i>=0;i--) {
			sArrRev[i]=sArr[i];
		}
		for(int i=size; i>=0;i--) {
			test=test+sArrRev[i]+" ";
		}
		return test;
	}
}
