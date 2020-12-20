package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord1 = scObj.nextLine().toLowerCase();
		String[] sWord1Arr=sWord1.split(" ");
		HashMap<String,Integer> hmObj =new HashMap<String,Integer>();
		for(String i:sWord1Arr) {
			int j=0;
			boolean flag=checkPalindrome(i);
			if(flag = true) {
				
				hmObj.put(i, i.length());
				j++;
			}
		}
		String longest="";
		for(Entry<String, Integer> s :hmObj.entrySet()) {
			longest =s.getKey();
			for(Entry<String, Integer> j :hmObj.entrySet()) {
				if(j!=s) {
					if(j.getKey().length()>longest.length()) {
						longest =j.getKey();
					}
				}
			}
		}
		System.out.println("Longest palindrome is "+longest);
	
	}
	public static boolean checkPalindrome(String sWord) {
		boolean flag ;
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
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;
	}

}
