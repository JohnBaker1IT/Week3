package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q18ArrayListIncrease {
   public static void main(String[] args) {

	  
	            // Creating object of ArrayList<Integer> 
	            ArrayList<String> 
	                arrlist = new ArrayList<String>(); 
	  
	            // adding element to arrlist 
	            arrlist.add("A"); 
	            arrlist.add("B"); 
	            arrlist.add("C"); 
	            arrlist.add("D"); 
	  
	            // Print the ArrayList 
	            System.out.println("ArrayList: "
	                               + arrlist); 
	  
	            // ensure that the ArrayList 
	            // can hold upto 400 elements 
	            // using ensureCapacity() method 
	            arrlist.ensureCapacity(400); 
	  
	            // Print 
	            System.out.println("ArrayList can now"
	                               + " surely store upto"
	                               + " 400 elements."); 
	        
   }
}