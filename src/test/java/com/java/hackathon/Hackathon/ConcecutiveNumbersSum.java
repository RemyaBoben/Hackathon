package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class ConcecutiveNumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refereed google understood wrote alone
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter Natural number");
		int iVal = scObj.nextInt();
		findConsecutiveNumberSum(iVal);
	}
	public static void findConsecutiveNumberSum(int iVal) {
		int start=1;
		int end=(iVal+1)/2;
		while(start<end) {
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum=sum+i;
				if(sum==iVal) {
					for(int j=start;j<=i;j++) {
						System.out.print(j+" ");
					}
					System.out.println("");
					break;
				}
				if(sum>iVal) {
					break;
				}
			}
			sum=0;
			start++;
		}
	}
}
