package com.java.hackathon.Hackathon;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scObj= new Scanner(System.in);
		int a= scObj.nextInt();
		int b=scObj.nextInt();
		int mulResult=multiply(a,b);
		System.out.println("Result after Multiplication : "+mulResult);
		int divResult=divide(a,b);
		System.out.println("Result after Division : "+divResult);
		int subResult=substract(a,b);
		System.out.println("Result after Substraction : "+subResult);
	}
	public static int negate(int number) {
	    return ~number + 1;
	}
	 
	public static int abs(int number) {
	    return number < 0 ? negate(number) : number;
	}
	 
	public static int multiply(int a, int b) {
	    int multiplier = Math.min(abs(a), abs(b));
	    int multiplicant = (multiplier == abs(a) ? abs(b) : abs(a));
	    int result = 0;
	    for (int i = 0; i < multiplier; i = i + 1) {
	        result = result + multiplicant;
	    }
	    if (abs(a) == a) { // a >= 0
	        if (abs(b) == b) // b >= 0
	            return result;
	        else
	            // b < 0;
	            return negate(result);
	    } else { // a < 0
	        if (abs(b) == b) // b >= 0
	            return negate(result);
	        else
	            // b < 0;
	            return result;
	    }
	}
	 
	public static int substract(int a, int b) {
	    return a + negate(b);
	}
	 
	public static int divide(int a, int b) {
	    if (b == 0) {
	        throw new java.lang.ArithmeticException("Divide by 0.");
	    }
	 
	    int divident = abs(a);
	    int divisor = abs(b);
	    int quotient = 0;
	 
	    while (divident >= divisor) {
	        divident = substract(divident, divisor);
	        quotient = quotient + 1;
	    }
	 
	    if (abs(a) == a) { // a >= 0
	        if (abs(b) == b) // b >= 0
	            return quotient;
	        else
	            // b < 0;
	            return negate(quotient);
	    } else { // a < 0
	        if (abs(b) == b) // b >= 0
	            return negate(quotient);
	        else
	            // b < 0;
	            return quotient;
	    }
	}
}
