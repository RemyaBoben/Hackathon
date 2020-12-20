package com.java.hackathon.Hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class IsBooleanTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 boolean Values");
		boolean a =sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c= sc.nextBoolean();
		
		if(a==true) {
			Count++;
		}
		if(b==true) {
			Count++;
		}
		if(c==true) {
			Count++;
		}
		
		if(Count>=2) {
			System.out.println("Atleast two are true");
		}
		else {
			System.out.println("Sorry ! ");
		}
		
		
	}

}
