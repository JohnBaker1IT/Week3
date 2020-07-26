package com.to.Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class C8TreeSet {

	public static void main(String[] args) {
		
		TreeSet treeset= new TreeSet(); 
		treeset.add("b"); 
		treeset.add("c"); 
		treeset.add("a"); 
		System.out.println(treeset);
		Iterator it2=treeset.iterator();
		while(it2.hasNext()) { 
			System.out.println(it2.next());  //lexicographic order 
			// If you want to sort by the integer value
			//, then you'll need to  create a new object 
			//and override the compareTo method, or use your own comparator.
		}



	}

}
