package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q21LinkedListIterate {
   public static void main(String[] args) {

	  
	// create an empty linked list
	     LinkedList<String> lnList = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          lnList.add("Red");
	          lnList.add("Green");
	          lnList.add("Black");
	          lnList.add("White");
	          lnList.add("Pink");
	          lnList.add("Yellow");
		
	   // print the list
	   System.out.println("The linked list: " + lnList);
	   //Add an element at the end of a linked list
	     lnList.offerLast(lnList.get(2));
	     System.out.println("The linked list: " + lnList);
	     
	     System.out.println("The linked list iterated: ");
	     Iterator<String> itr = lnList.iterator(); 
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	     
	        
   }
}