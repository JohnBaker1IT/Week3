package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q32LinkedListRemove {
   public static void main(String[] args) {

	  
	// create an empty linked list
	     LinkedList<String> li = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          li.add("Red");
	          li.add("Green");
	          li.add("Black");
	          li.add("White");
	          li.add("Pink");
	          li.add("Yellow");
		
	   // print the list
	   System.out.println("The linked list: " + li);
	   //Add an element at the end of a linked list
	     li.offerLast(li.get(2));
	     System.out.println("The linked list: " + li);
	     
	     
	     System.out.println("The linked list iterated: ");
	     Iterator<String> itr = li.iterator(); 
		 
	     int index = 0;
			while(itr.hasNext()) {
				System.out.println(index + " "+ itr.next());
				index++;
			}
			
	     
	        
   }
}