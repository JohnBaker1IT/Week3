package com.to.Collections;
import java.util.ArrayList; 
import java.util.Iterator;

public class C1ArrayList {
	public static void main(String... args) {           /////////
		ArrayList<String> a1 = new ArrayList<String>(); 
		a1.add("java");
		a1.add("spring"); 
		a1.add("java");
		a1.set(1, "hybris");
		Iterator<String> itr = a1.iterator();
		
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		a1.remove(1);
		System.out.println(a1.get(1));
	}
}
