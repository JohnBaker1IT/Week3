package com.to.javaQuestions;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import p2accountManagerModel.BankAccount;
import p2accountManagerModel.BankAccountsPrint;

public class Q02ArrayIterate {
	public static void main(String[] args) {
		String item1 = "item1";
		String item2 = "item2";
		String item3 = "item3";
		String item4 = "item4";
		String item5 = "item5";
	
		ArrayList<String> items = new ArrayList<String>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		
		
		Iterator i = items.iterator();
		System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
		   System.out.println("item: " + i.next());
		}
		
		items.add(0, "added to beginning");
		
		
		System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
		   System.out.println("item: " + i.next());
		}
	}
}
	