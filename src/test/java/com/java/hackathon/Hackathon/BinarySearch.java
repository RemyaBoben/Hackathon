package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class BinarySearch {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//int[] iArr= {87,1,43,26,11,50,0};
			
			Scanner scObj = new Scanner(System.in);
			System.out.println("Enter 5 numbers :");
			int[] iArr = new int[5];
			for(int i=0;i<5;i++) {
				iArr[i]=scObj.nextInt();
			}
			System.out.println("Enter number to be serched :");
			int x= scObj.nextInt();
			sort(iArr,x);
		}
		public static void sort(int[] iArr,int x) {
			int n=iArr.length;
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
			int output =binarySearch(iArr,0,iArr.length-1,x);
			if(output == -1) {
				System.out.println("\nGiven number is not present");
			}
			else {
				System.out.println("\nGiven number is  present at index " + output);
			}
			
		}
		public static int binarySearch(int[] iArr,int ll,int ul,int x) {
			int result = -1;
			if(ul>ll) {
				int mid = (ll+(ul-1))/2;
				if(iArr[mid]==x) {
					result = mid;
				}
				else if(iArr[mid]<x) {
					result =binarySearch(iArr,mid+1,ul,x);
				}
				else {
					result =binarySearch(iArr,ll,mid-1,x);
				}
			}
			return result;
		}
	}

