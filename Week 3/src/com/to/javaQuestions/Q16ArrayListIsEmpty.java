package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q16ArrayListIsEmpty {
   public static void main(String[] args) {
	   ArrayList<String> al1=new ArrayList<String>();
       al1.add("abc");
       al1.add("xyz");
       
       System.out.println("ArrayList empty: "+al1.isEmpty());
       System.out.println("ArrayList before clear: "+al1);
       al1.clear();
       System.out.println("ArrayList empty: "+al1.isEmpty());
       System.out.println("ArrayList after clear: "+al1);

       ArrayList<String> al2=new ArrayList<String>();
       al2.add("text 1");
       al2.add("text 2");
       
    // check if the list is empty or not 
      
       System.out.println("ArrayList empty: "+al2.isEmpty());

       System.out.println("ArrayList before removeAll: "+al2);
       al2.removeAll(al2);
       
       System.out.println("ArrayList empty: "+al2.isEmpty());
       System.out.println("ArrayList after removeAll: "+al2);  
   } 
   
}