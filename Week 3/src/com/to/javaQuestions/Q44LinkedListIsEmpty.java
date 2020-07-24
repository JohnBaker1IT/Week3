package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q44LinkedListIsEmpty {
   public static void main(String[] args) {
	   LinkedList<String> li= new LinkedList<String>();
       li.add("Love");
       li.add("Math");
       li.add("Joy");
       li.add("Science");
       li.add("Peace");

   
       //this should return true as there are no elements in the LinkedList
       System.out.println( li.isEmpty() );
       
       //add an element
       li.clear();
       
       //this should return false as there is one element in the LinkedList
       System.out.println( li.isEmpty() );     
  }
   
}