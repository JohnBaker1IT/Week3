package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q12ArrayListExtract {
   public static void main(String[] args) {
	// Creae a list and add some colors to the list
	   ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
       
       System.out.println(list);
        
       Collections.swap(list, 1, 2);
        
       System.out.println(list);
	     
   }
}