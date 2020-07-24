package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q24LinkedListIterateReverse {
   public static void main(String[] args) {

	   
	  
	       
	            // creating object of TreeMap<Integer, String> 
	            LinkedList<Integer> 
	                list = new LinkedList<Integer>(); 
	  
	            // add some elements to list 
	            list.add(10); 
	            list.add(20); 
	            list.add(30); 
	  
	            // print the linked list 
	            System.out.println("LinkedList:" + list); 
	  
	            // set Iterator as descending 
	            // using descendingIterator() method 
	            Iterator x = list.descendingIterator(); 
	  
	            // print list with descending order 
	            while (x.hasNext()) { 
	                System.out.println("Value is : "
	                                   + x.next()); 
	            } 
	        
	  
	        
	    
   
   }
   
}