package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q27LinkedListIInsertSpecifiedFirst {
   public static void main(String[] args) {

	// create an empty linked list
	     LinkedList<String> li = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          li.add("Red");
	          li.add("Green");
	          li.add("Black");
	     System.out.println("Original linked list:" + li);    
	   // Add an element at the beginning 
	    li.addFirst("White");
	    li.addFirst(li.get(0));
	 
	   // Add an element at the end of list 
	    li.addLast("Pink");
	    li.addLast(li.get(li.size()-1));
	     System.out.println("Final linked list:" + li);  
	 }
   
   
}