package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter int value");
		int iVal = scObj.nextInt();
		System.out.println("Given int value is: "+iVal);
		String output =intToString(iVal);
		System.out.println("Given int value +1 is "+(iVal+1));
		System.out.println("ConvertedString: "+output);
		System.out.println("ConvertedString +1 is "+(output+1));
		
	}
	static String intToString(int iVal){
		String output ="";
		Integer iIntVal = Integer.valueOf(iVal);
		output=iIntVal.toString();
		return output;
	}


}
