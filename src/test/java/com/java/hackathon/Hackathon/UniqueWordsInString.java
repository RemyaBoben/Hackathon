package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class UniqueWordsInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord = scObj.nextLine();
		String[] sArr = new String[sWord.length()];
		sArr=sWord.split(" ");
		findUniqueWords(sArr);
	}
	public static void findUniqueWords(String[] sArr) {
		HashMap<String,Integer> hmObj =new HashMap<String,Integer>();
		String output="";
		for(int i=0;i<sArr.length;i++) {
			int count =1;
			sArr[i]=sArr[i].toLowerCase();
			if(hmObj.containsKey(sArr[i])) {
				count =hmObj.get(sArr[i]);
				count=count+1;
				hmObj.put(sArr[i], count);
			}
			else {
				hmObj.put(sArr[i], count);
			}
		}
		System.out.println("Unique words are");
		for(Entry<String, Integer> s :hmObj.entrySet()) {
			if(s.getValue()==1) {
				System.out.println(s.getKey());

			}
		}
		
	}

}
