package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] iArr= {87,1,43,26,11,50,0};
		
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = scObj.nextInt();
		System.out.println("Enter" +size+"elements :");
		int[] iArr = new int[size];
		for(int i=0;i<size;i++) {
			iArr[i]=scObj.nextInt();
		}
		sort(iArr);
	}
	public static void sort(int[] iArr) {
		int n=iArr.length;
		System.out.println("Given Array");
		for(int i =0;i<n;i++) {
			System.out.print(iArr[i]+" ");
		}
		
		for( int i=0;i<n-1;i++) {
			int iMin=i;
			for(int j=i+1; j<=n-1;j++) {
				if(iArr[iMin]>iArr[j]) {
					iMin=j;
				}
			}
			if(iMin!=i) {
				int temp = iArr[i];
				iArr[i]=iArr[iMin];
				iArr[iMin]=temp;
			}
			
		}
		System.out.println("\nSorted Array");
		for(int i =0;i<n;i++) {
			System.out.print(iArr[i]+" ");
		}
	}
}
