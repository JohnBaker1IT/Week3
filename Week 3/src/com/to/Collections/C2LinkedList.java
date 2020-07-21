package com.to.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class C2LinkedList {

	public static void main(String[] args) {
			LinkedList<String> li = new LinkedList<String>();
			li.add("spring");
			li.add(1, "java");
			Iterator<String> itr = li.iterator(); 
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println();
			
			LinkedList<String> li1 = new LinkedList<String>(); 
			li1.add("hybris");
			li1.addAll(li);
			Iterator<String> itr1 = li1.iterator(); 
			
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
	}
}