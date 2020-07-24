package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q41LinkedListCheckExist {
   public static void main(String[] args) {
	// Creating an empty LinkedList 
	      LinkedList<String> li = new LinkedList<String>(); 
	  
	      // Use add() method to add elements in the list 
	      li.add("Love"); 
	      li.add("Science"); 
	      li.add("Math"); 
	      li.add("30"); 
	      li.add("200"); 
	  
	      // Output the list 
	      System.out.println("LinkedList:" + li); 
	  
	      // Check if the list contains "Math" 
	      System.out.println("Is " +li.get(2) +" in the list? " 
	                                      + li.contains("Math")); 
	  
	   // Check if the list contains "30" 
	      System.out.println("Is " +li.get(3) +" in the list? " 
	                                      + li.contains("30"));
	   // Check if the list contains "41" 
	      System.out.println("Is " +41 +" in the list? " 
	                                      + li.contains("41"));
   }
}