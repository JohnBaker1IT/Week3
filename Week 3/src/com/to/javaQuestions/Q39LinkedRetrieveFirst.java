package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q39LinkedRetrieveFirst {
   public static void main(String[] args) {
	   LinkedList <String> li = new LinkedList <String> ();
       li.add("Love");
       li.add("Math");
       li.add("Joy");
       li.add("Science");
       li.add("Peace");
       System.out.println("Original linked list: " + li); 
       // Retrieve but does not remove, the first element of a linked list
       String first = li.peekFirst();
       System.out.println("First element in the list: " + first);
       System.out.println("Original linked list: " + li);  
       String last = li.peekLast();
       System.out.println("Last element in the list: " + last);
       System.out.println("Original linked list: " + li);    
   }
}