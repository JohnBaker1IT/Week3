package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Q07ArrayListSearch {
   public static void main(String[] args) {
      List aList = new ArrayList();
      aList.add("A");
      aList.add("B");
      aList.add("C");
      aList.add("D");
      aList.add("E");
      int index1 = aList.indexOf("C");
      int index2 = aList.indexOf("Z");
      if(index1 == -1)
         System.out.println("The element C is not in the ArrayList");
      else
         System.out.println("The element C is in the ArrayList at index " + index1);
      if(index2 == -1)
         System.out.println("The element Z is not in the ArrayList");
      else
         System.out.println("The element Z is in the ArrayList at index " + index2);
   
      Iterator i = aList.iterator();
		System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
		   System.out.println("item: " + i.next());
		}
   
   }
}