package com.java.hackathon.Hackathon;

public class SortedMergeToFirstArray {
	 static int NA =-1; 
	    static void sortedMerge(int a[], int b[], int n, int m)  
	    { 
	        int i = n - 1; 
	        int j = m - 1; 
	          
	        int lastIndex = n + m - 1; 
	          
	        while (j >= 0)  
	        { 
	          
	            if (i >= 0 && a[i] > b[j])  
	            { 
	                a[lastIndex] = a[i];  
	                i--; 
	            } else 
	            {   
	                a[lastIndex] = b[j];  
	                j--; 
	            } 
	            lastIndex--;  
	        } 
	    } 
	      
	    public static void main (String[] args)  
	    { 
	        int a[] = {10, 12, 13, 14, 18, NA, NA, NA, NA, NA}; 
	        int n = 5; 
	        int size_a = 10; 
	        int b[] = {16, 17, 19, 20, 22}; 
	        int m = 5; 
	        sortedMerge(a, b, n, m); 
	        System.out.println ( "Array A after merging B in sorted order : " ) ; 
	        for (int i = 0; i <size_a; i++) 
	            System.out.print(a[i] +" "); 
	    } 
	
}
