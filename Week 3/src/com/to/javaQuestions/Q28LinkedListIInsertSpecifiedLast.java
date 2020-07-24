package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q28LinkedListIInsertSpecifiedLast {
   public static void main(String[] args) {

	// create an empty linked list
	   LinkedList <String> li = new LinkedList <String> ();
	   // use add() method to add values in the linked list
	   li.add("Science");
	   li.add("History");
	   li.add("Math");

	   // print original list
	   System.out.println("Original linked list:" + li);

	   // create a new collection and add some elements

	   LinkedList <String> newLi = new LinkedList <String> ();
	   newLi.add("*Like");
	   newLi.add("Love*");

	   // Add the collection in the second position of the existing linked list
	   li.addAll(2, newLi);

	   // print the new list
	   System.out.println("LinkedList:" + li);
   }
   
}