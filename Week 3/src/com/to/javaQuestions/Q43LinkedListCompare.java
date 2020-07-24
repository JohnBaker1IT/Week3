package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q43LinkedListCompare {
   public static void main(String[] args) {
	   LinkedList<String> li1= new LinkedList<String>();
       li1.add("Love");
       li1.add("Math");
       li1.add("Joy");
       li1.add("Science");
       li1.add("Peace");

       LinkedList<String> li2= new LinkedList<String>();
       li2.add("Love");
       li2.add("Green");
       li2.add("Joy");
       li2.add("Orange");

       //comparison output in linked list
       LinkedList<String> compareList = new LinkedList<String>();
       for (String l : li1)
          compareList.add(li2.contains(l) ? "Same" : "Different");
       System.out.println(compareList);         
  }
   
}