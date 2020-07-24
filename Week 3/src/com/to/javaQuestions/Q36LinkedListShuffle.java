package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Q36LinkedListShuffle {
   public static void main(String[] args) {

	   
	         
	        LinkedList<String> li = new LinkedList<String>();
	        li.add("a");
	        li.add("b");
	        li.add("c");
	        li.add("d");
	        li.add("e");
	        li.add("f");
	        li.add("g");
	        
	       
	        System.out.println("before:" +li);
	        Collections.shuffle(li);
	        System.out.println("after:" +li);
	        System.out.println("Results after shuffle operation:");
	        for(String str: li){
	            System.out.println(str);
	        }
	    }
	     
	        
   }
