package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q45LinkeListReplace {
   public static void main(String[] args) {
	   // Create a LinkedList
	    LinkedList<String> li = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    li.add("Love");
	    li.add("Joy");
	    li.add("Peace");
	    li.add("Greatness");
	    li.add("Strength");
	 
	    // Displaying Elements before replace
	    System.out.println("Before Replace:");
	    for(String str: li){
	       System.out.println(str);
	    }
	 
	    // Replacing 3rd Element with new value
	    li.set(2, "Math");
	    System.out.println("\n3rd Element Replaced \n");

	    // Displaying Elements after replace
	    System.out.println("After Replace:");
	    for(String str2: li){
	       System.out.println(str2);
	    }
	 } 
  }
   
