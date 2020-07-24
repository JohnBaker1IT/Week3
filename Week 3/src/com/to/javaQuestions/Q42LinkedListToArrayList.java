package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q42LinkedListToArrayList {
   public static void main(String[] args) {
	   LinkedList<String> li = new LinkedList<String>();
	      li.add("Love");
	      li.add("Joy");
	      li.add("Peace");
	      li.add("Greatness");
	      li.add("Strength");
	      List<String> arrList = new ArrayList<String>(li);
	      
	      
	      Iterator i = arrList.iterator();
			System.out.println("The ArrayList elements are:");
			while (i.hasNext()) {
			   System.out.println("item: " + i.next());
			}
			

   }
}