package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q09ArrayListCopy {
   public static void main(String[] args) {
	   ArrayList<String> students = new ArrayList<>();

	   ArrayList<String> al = new ArrayList<String>();

	     //Adding elements to the ArrayList
	     al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");
	     System.out.println("ArrayList: "+al);

	     ArrayList<String> al2 = (ArrayList<String>)al.clone();
	     System.out.println("Copy of a1 ArrayList: "+ al2);

	     
   }
}