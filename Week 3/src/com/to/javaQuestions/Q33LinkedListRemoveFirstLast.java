package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q33LinkedListRemoveFirstLast {
   public static void main(String[] args) {

	// Create a LinkedList
	    LinkedList<String> li = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    li.add("Item1");
	    li.add("Item2");
	    li.add("Item3");
	    li.add("Item4");
	    li.add("Item5");
	 
	    // Displaying Elements before remove
	    System.out.println("LinkedList Elements are:");
	    for(String str: li){
	       System.out.println(str);
	    }
	 
	    // Removing First element
	    Object firstElement = li.removeFirst();
	    System.out.println("\nElement removed: "+ firstElement);
	 
	    // Removing last Element
	    Object lastElement = li.removeLast();
	    System.out.println("Element removed: "+ lastElement);
	 
	    // LinkedList elements after remove
	    System.out.println("\nList Elements after Remove:");
	    for(String str2: li){
	       System.out.println(str2);
	    }
	 
	
			
	     
	        
   }
}