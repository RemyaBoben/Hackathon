package com.java.hackathon.Hackathon;

public class StringObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // * String Object can be created in two ways
		   String sVal = "Test";
		   String sVal1 = "Test";
		   if(sVal==sVal1) {
			   System.out.println("== method with out New keyword -true");
		   }
		   else {
			   System.out.println("== method with out New keyword -false");
		   }
		 
		   //Above declaration will create string in string constant pool.
		   //if there is already "Test" is present sVal will not create a new one 
		   //it will use existing one if not create a new one
		   //if we check "=" it will give true
		   
		  
		   String sVal2= new String("Test");
		   String sVal3= new String("Test");
		   if(sVal2==sVal3) {
			   System.out.println("== method with New keyword -true");
		   }
		   else {
			   System.out.println("== method with New keyword -false");
		   }
		   if(sVal2.equals(sVal3)) {
			   System.out.println("equals method with New keyword -true");
		   }
		   else {
			   System.out.println("equals method with New keyword -false");
		   }
		   
		   //Above declaration will always create a new string in heap memory.
		   //if we check "=" it will give false
		   //if we check "equals" it will give true since it checks semantically
		   
		   
	}

}
