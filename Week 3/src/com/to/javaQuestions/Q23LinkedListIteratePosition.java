package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q23LinkedListIteratePosition {
   public static void main(String[] args) {

	   // create an empty linked list
	     LinkedList<String> li = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          li.add("Red");
	          li.add("Green");
	          li.add("Black");
	          li.add("White");
	          li.add("Pink");
	// set Iterator at specified index
	   Iterator p = li.listIterator(2);

	   // print list from second position
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
	   }
	        
   
}