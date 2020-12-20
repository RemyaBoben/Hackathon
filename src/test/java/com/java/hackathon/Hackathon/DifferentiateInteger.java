package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class DifferentiateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refereed google understood wrote alone
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Input");
		if (input.hasNextInt()) System.out.println("This input is of type Integer.");
		else if (input.hasNextBoolean()) System.out.println("This input is of type Boolean."); 
		else if (input.hasNextLine()) System.out.println("This input is of type string."); 
        else 
		    System.out.println("This input is not int boolean or string"); 
	}

}
