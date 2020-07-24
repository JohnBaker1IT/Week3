package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q10ArrayListShuffle {
   public static void main(String[] args) {
	   ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(8);
	      list.add(3);
	      list.add(9);
	      System.out.println("Original list : " + list);
	      Collections.shuffle(list); // shuffling the list
	      System.out.println("Shuffled list : " + list);
	     
   }
}