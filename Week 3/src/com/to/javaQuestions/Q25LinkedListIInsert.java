package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q25LinkedListIInsert {
   public static void main(String[] args) {

	// create an empty linked list
			LinkedList <String> li = new LinkedList <String> ();
			// use add() method to add values in the linked list
			li.add("Red");
			li.add("Green");
			li.add("Black");
			li.add("White");
			li.add("Pink");
			System.out.println("Original linked list: ");
			System.out.println("Lets add the " + li.get(3) + " color after the Red Color: " + li);
			li.add(1, li.get(3));
			// print the list
			System.out.println("The linked list:" + li);
	    
   
   }
   
}