package com.java.hackathon.Hackathon;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sWord = "Remya Boben Pulikkottil  ";
		System.out.println(sWord.length());
		String[] sSplitWord =new String[sWord.length()];
		//sSplitWord = sWord.split("i");
		sSplitWord = sWord.split(" ",6);
		for(int i=0;i<sSplitWord.length;i++) {
			System.out.println(sSplitWord[i]);
		}
		System.out.println("Testing Lines");
		// split method is used to split a string with a reg expression 
		// and result will be a string array 
		//it has a overloaded method with two arguments (regex, limit)
		//limit can be 3 types of values
		// if limit>0 then it will split string maximum limit -1 times based on reg expression - 
		//     in this case ending spaces will not be removed
		// if limit<0 then it will split string as many times based on reg expression criteria - 
		//     in this case ending spaces will not be removed
		// if limit=0 then it will split string as many times based on reg expression criteria - 
		//	   in this case ending spaces will be removed
		// reffered https://www.geeksforgeeks.org/split-string-java-examples/
	}

}
