package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q20ArrayListPrintPosition {
   public static void main(String[] args) {

	  
	   ArrayList <String> c1 = new ArrayList <String> ();
	   c1.add("Red");
	   c1.add("Green");
	   c1.add("Black");
	   c1.add("White");
	   c1.add("Pink");
	   System.out.println("\nOriginal array list: " + c1);
	   System.out.println("\nPrint using index of an element: ");
	   int numElements = c1.size();
	   for (int index = 0; index < numElements; index++)
	    System.out.println(c1.get(index));
	        
   }
}