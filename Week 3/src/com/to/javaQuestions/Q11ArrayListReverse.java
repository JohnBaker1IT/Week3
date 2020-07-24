package com.to.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Q11ArrayListReverse {
   public static void main(String[] args) {
	   ArrayList<String> students = new ArrayList<>();

		students.add("Lindsay");
		students.add("Peter");
		students.add("Lucas");
		students.add("Athena");

		System.out.println("Student list: " + students);

		//Collections.sort(students);
		Collections.reverse(students);
		System.out.println("Reversed student list: " + students);
	     
   }
}