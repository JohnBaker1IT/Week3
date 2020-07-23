package com.to.javaQuestions;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import p2accountManagerModel.BankAccount;
import p2accountManagerModel.BankAccountsPrint;

public class Q1ColorArray {
	public static void main(String[] args) {
		String cBlue = "blue";
		String cRed = "red";
	
		ArrayList<String> colors = new ArrayList<String>();
		colors.add(cRed);
		colors.add(cBlue);
		
		Iterator i = colors.iterator();
		System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
		   System.out.println("item: " + i.next());
		}
	}
}
	