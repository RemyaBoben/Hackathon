package com.java.hackathon.Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PalindromeSeries  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] iArr= {87,1,43,26,43,1,87};
		//int[] iArr= {87,1,43,26,11,50,0};
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = scObj.nextInt();
		System.out.println("Enter" +size+"elements :");
		ArrayList<Integer> arObj = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			arObj.add(scObj.nextInt());
		}
		System.out.println(checkPalindrome(arObj));
		}
	public static String checkPalindrome(ArrayList<Integer> arObj) {
		String result= null;
		System.out.println("Given Array");
		for(int i=0;i<arObj.size();i++) {
			System.out.print(" "+arObj.get(i));
		}
		ArrayList<Integer> arObj1 = new ArrayList<Integer>();
		arObj1.addAll(arObj);
		
		Collections.reverse(arObj);
		
		System.out.println("\nReversedArray");
		for(int i=0;i<arObj.size();i++) {
			System.out.print(" "+arObj.get(i));
		}
		
		boolean flag=true;
		for(int i=0;i<arObj.size();i++) {
			if(arObj.get(i)!=arObj1.get(i)) {
				flag=false;
				break;
			}
			
		}
		
		if(flag==false)
		{
			 result ="\nNot palindrome series";
			
		}
		else {
			 result ="\nPalindrome series";
		}	
		return result;
	}

}
