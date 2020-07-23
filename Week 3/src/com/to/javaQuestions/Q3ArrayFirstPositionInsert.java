package com.to.javaQuestions;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import p2accountManagerModel.BankAccount;
import p2accountManagerModel.BankAccountsPrint;

import java.util.ArrayList;

public class Q3ArrayFirstPositionInsert {
   public static void main(String[] args) {

      // create an empty array list with an initial capacity
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

      // use add() method to add elements in the list
      arrlist.add(15);
      arrlist.add(22);
      arrlist.add(30);
      arrlist.add(40);

   // let us print all the elements available in list
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      } 
      
      // adding element 25 at third position
      arrlist.add(0,25);
      
      System.out.println("After adding to the begining . . . ");
      
      for (Integer number : arrlist) {
          System.out.println("Number = " + number);
       } 
       
   }
}   
	