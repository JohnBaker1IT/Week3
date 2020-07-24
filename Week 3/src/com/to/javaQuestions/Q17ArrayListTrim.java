package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q17ArrayListTrim {
   public static void main(String[] args) {

       // creating an Empty Integer ArrayList 
       ArrayList<Integer> arr = new ArrayList<Integer>(20); 
 
       // using add(), add 5 values 
       arr.add(2); 
       arr.add(4); 
       arr.add(5); 
       arr.add(6); 
       arr.add(11); 
       
    // prints all the elements 
       for (Integer number : arr) { 
           System.out.println("Number = " + number); 
       } 
       System.out.println("array list before trim: " + arr);
       // trims the size to the number of elements 
       arr.trimToSize(); 
       System.out.println("array list after trim: " + arr);
       
       System.out.println("The List elements are:"); 
 
       // prints all the elements 
       for (Integer number : arr) { 
           System.out.println("Number = " + number); 
       } 
   } 
   
}