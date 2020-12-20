package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.next();
		System.out.println("Enter Character to be removed");
		String c = scObj.next().toLowerCase();
		System.out.println("Given String is: "+sWord);
		String[] sWordArray =sWord.split(c);
		String output="";
		for(int i=0;i<sWordArray.length;i++) {
			output=output+sWordArray[i];
		}
		System.out.println(output);
	
	}

}
