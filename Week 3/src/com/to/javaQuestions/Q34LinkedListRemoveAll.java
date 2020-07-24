package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q34LinkedListRemoveAll {
   public static void main(String[] args) {

	// Creating an empty LinkedList 
       LinkedList<String> li = new LinkedList<String>(); 
 
       // Using add() method to add elements in the list 
       li.add("a"); 
       li.add("b"); 
       li.add("c"); 
       li.add("d"); 
       li.add("e"); 
 
       // Displaying the List 
       System.out.println("Original LinkedList:" + li); 
 
       // Clearing the list 
       li.clear(); 
 
       // Accessing the List after clearing it 
       System.out.println("List after clearing all elements: " + li); 
 
       // Adding elements after clearing the list 
       li.add("f"); 
       li.add("g"); 
       li.add("h"); 
 
       // Displaying the List 
       System.out.println("After adding elements to empty list:" + li); 
   
	
			
	     
	        
   }
}