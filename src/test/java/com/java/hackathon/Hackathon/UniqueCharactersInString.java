package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class UniqueCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter String");
		String sWord1 = scObj.nextLine().toLowerCase();
		String[] sWord1Arr=sWord1.split(" ");
		String sWord ="";
		for(String i:sWord1Arr) {
			sWord=sWord+i;
		}
		findDuPlicateCharacters(sWord);
	}
	public static void findDuPlicateCharacters(String sWord) {
		HashMap<Character,Integer> hmObj =new HashMap<Character,Integer>();
		for(int i=0;i<sWord.length();i++) {
			int count =1;
			if(hmObj.containsKey(sWord.charAt(i))) {
				count =hmObj.get(sWord.charAt(i));
				count=count+1;
				hmObj.put(sWord.charAt(i), count);
			}
			else {
				hmObj.put(sWord.charAt(i), count);
			}
		}
		System.out.println("Duplicate characters are");
		for(Entry<Character, Integer> s :hmObj.entrySet()) {
			if(s.getValue()>1) {
				System.out.println(s.getKey());

			}
		}
	}
}
