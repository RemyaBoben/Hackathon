package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Map.Entry;

public class MergeArray2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] iArr1 = new int[11];
			for(int i=0;i<7;i++) {
				iArr1[i]=i+2;
			}
			int[] iArr2 = {3,5,6,7};
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
			int j=0;
			for(Entry<Integer, Integer> s :hmObj.entrySet()) {
				iArr1[j]=s.getKey();
				j++;
			}
			for(int i=0;i<iArr1.length;i++) {
				System.out.print(iArr1[i]+" ");
			}
		}

	}

