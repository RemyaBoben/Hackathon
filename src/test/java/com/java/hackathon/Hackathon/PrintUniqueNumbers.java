package com.java.hackathon.Hackathon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = scObj.nextInt();
		System.out.println("Enter" +size+"elements :");
		ArrayList<Integer> arObj = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			arObj.add(scObj.nextInt());
		}
		printUniqueNumbers(arObj);
		}
	public static void printUniqueNumbers(ArrayList<Integer> arObj) {
		HashMap<Integer,Integer> hmObj =new HashMap<Integer,Integer>();
		for(int i=0;i<arObj.size();i++) {
			int count =1;
			if(hmObj.containsKey(arObj.get(i))) {
				count =hmObj.get(arObj.get(i));
				count=count+1;
				hmObj.put(arObj.get(i), count);
			}
			else {
				hmObj.put(arObj.get(i), count);
			}
		}
		for(Entry<Integer, Integer> s :hmObj.entrySet()) {
			if(s.getValue()>1) {
				System.out.println(s.getKey()+" is Duplicate entry and Ocuurence is "+s.getValue()+" times");

			}
			else {
				System.out.println(s.getKey()+" is Unique");
			}
			
		}
		
	}

}
