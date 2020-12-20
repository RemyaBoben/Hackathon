package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class UpperLowerInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord1 = scObj.nextLine();
		String[] sWord1Arr=sWord1.split(" ");
		String sWord ="";
		for(String i:sWord1Arr) {
			sWord=sWord+i;
		}
		int uCount=0;
		int lCount=0;
		int iCount=0;
		for(int i = 0;i<sWord.length();i++) {
		 char c = sWord.charAt(i);
		 if((int)c>=48 && (int)c<=57) {
			 iCount=iCount+1;
		 }
		 else if((int)c>=65 && (int)c<=90) {
			 uCount=uCount+1; 
		 }
		 else if((int)c>=97 && (int)c<=122) {
			 lCount=lCount+1; 
		 }		 
		}
		System.out.println("Total Uppercase characters is "+uCount);
		System.out.println("Total Lowercase characters is "+lCount);
		System.out.println("Total integers is "+iCount);
	}

}
