package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sObj = new Scanner(System.in);
		System.out.println("Enter number for which you want to calculate factorial");
		int i = sObj.nextInt();
		//System.out.println(factorial(i));
		int output= factorial(i);
		System.out.println("Factorial of "+i+ " is "+output+" !!");
	}
	public static int factorial(int i) {
		int result =1;
		for(int j = 1;j<=i;j++){
			result = result*j;
		}
		return result;
	}
	

}
