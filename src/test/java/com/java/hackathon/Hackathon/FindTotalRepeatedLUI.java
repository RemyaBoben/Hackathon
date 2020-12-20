package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FindTotalRepeatedLUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		//String sWord = scObj.next();
		String sWord1 = scObj.nextLine();
		String[] sWord1Arr=sWord1.split(" ");
		String sWord ="";
		for(String i:sWord1Arr) {
			sWord=sWord+i;
		}
		int uCount=0;
		int lCount=0;
		int iCount=0;
		
		HashMap<Character,Integer> hmObj =new HashMap<Character,Integer>();
		for(int i=0;i<sWord.length();i++) {
			int count =1;
			if((sWord.charAt(i)>=65 && sWord.charAt(i)<=90) || ( sWord.charAt(i)>=97 && sWord.charAt(i)<=122) || ( sWord.charAt(i)>=48 && sWord.charAt(i)<=57)){
				if(hmObj.containsKey(sWord.charAt(i))) {
					count =hmObj.get(sWord.charAt(i));
					count=count+1;
					hmObj.put(sWord.charAt(i), count);
				}
				else {
					hmObj.put(sWord.charAt(i), count);
				}
			}
		}
		for(Entry<Character, Integer> s :hmObj.entrySet()) {
			if(s.getValue()>1) {
				int iVal =(int)s.getKey();
				 if(iVal>=48 && iVal<=57) {
					 iCount=iCount+1;
				 }
				 else if(iVal>=65 && iVal<=90) {
					 uCount=uCount+1; 
				 }
				 else if(iVal>=97 && iVal<=122) {
					 lCount=lCount+1; 
				 }		

			}
		}
		System.out.println("Total Repeated Uppercase characters are "+uCount);
		System.out.println("Total Repeated Lowercase characters are "+lCount);
		System.out.println("Total Repeated integers are "+iCount);
	}

}
