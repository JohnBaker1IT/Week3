package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q30LinkedListFirstLastOccurence {
   public static void main(String[] args) {

	// create an empty linked list
	     LinkedList<String> li = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          li.add("Red");
	          li.add("Green");
	          li.add("Black");
	          li.add("Pink");
	          li.add("orange");
	      
	      // print original list
	   System.out.println("Original linked list:" + li);  
	 
	   // Find first element of the List
	    Object first_element = li.getFirst();
	    System.out.println("First Element is: "+first_element);
	 
	    // Find last element of the List
	    Object last_element = li.getLast();
	    System.out.println("Last Element is: "+last_element);
	    Object last_element2 = li.get(li.size()-1);
	    System.out.println("Last Element is: "+last_element2);
   }
   
   
}