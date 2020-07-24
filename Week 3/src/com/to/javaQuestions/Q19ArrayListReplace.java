package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q19ArrayListReplace {
   public static void main(String[] args) {

	  
	   ArrayList<String>  color = new ArrayList<String>();

	   color.add("Red");
	   color.add("Green");

	   System.out.println("Original array list: " + color);
	   String new_color = "White";
	   color.set(1,new_color);

	   int num=color.size();
	   System.out.println("Replace second element with 'White'."); 
	   for(int i=0;i<num;i++)
	   System.out.println(color.get(i));
	        
   }
}