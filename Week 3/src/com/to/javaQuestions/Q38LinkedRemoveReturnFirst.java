package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q38LinkedRemoveReturnFirst {
   public static void main(String[] args) {

	   
	// Creating an empty LinkedList 
       LinkedList<String> li = new LinkedList<String>(); 
 
       // Using add() method to add elements in the list 
       li.add("Remove me"); 
       li.add("not me1"); 
       li.add("not me2"); 
       li.add("not me3"); 
       li.add("not me4"); 
 
       // Displaying the list 
       System.out.println("LinkedList:" + li); 
 
       // Remove the head using removeFirst() method 
       System.out.println("The first element is: " + li.removeFirst()); 
 
       // Displaying the final list 
       System.out.println("Final LinkedList:" + li); 	        
   }
}