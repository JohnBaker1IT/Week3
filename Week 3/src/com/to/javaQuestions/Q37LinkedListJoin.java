package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q37LinkedListJoin {
   public static void main(String[] args) {

	   
	// create an empty linked list
	   LinkedList <String> li1 = new LinkedList <String> ();
	   
	           li1.add("Bird");
	           li1.add("Cat");
	           li1.add("Dog");
	           li1.add("Elephant");
	           li1.add("Lion");
	           System.out.println("List of first linked list: " + li1);
	          LinkedList <String> li2 = new LinkedList <String> ();
	           li2.add("Love");
	           li2.add("Liberty");
	           li2.add("Happiness");
	           li2.add("Greatness");
	           System.out.println("List of second linked list: " + li2);
	         
	       // Let join above two list
	         LinkedList <String> joinedList = new LinkedList <String> ();
	         joinedList.addAll(li1);
	         joinedList.addAll(li2);
	         System.out.println("New linked list: " + joinedList);
	              }
	        
   }
