package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Map.Entry;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = { 1,2,4,6,9,10 };
		int[] iArr2 = {3, 5,7,8 };
		HashMap<Integer,Integer> hmObj = new HashMap<Integer,Integer>();
		for(int i=0;i<iArr1.length;i++) {
			hmObj.put(iArr1[i], i);
		}
		int size =iArr1.length;
		for(int i=0;i<iArr2.length;i++) {
			hmObj.put(iArr2[i], size);
			size=size+1;
		}
		System.out.println("Soted Array is");
		for(Entry<Integer, Integer> s :hmObj.entrySet()) {
				System.out.print(s.getKey()+" ");
		}
	}

}
