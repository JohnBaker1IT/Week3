package com.to.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class C7HashSet {
		public static void main(String args[]) { // Creating HashSet and adding elements
		HashSet<String> hs = new HashSet<String>();  //homogeneous because string is used
		hs.add("collection"); 
		hs.add("framework");
		hs.add("is ");
		hs.add("very helpful");
		// Traversing elements
		Iterator<String> itr = hs.iterator(); 
		
		while (itr.hasNext()) { 
			System.out.println(itr.next());
		}
		
		HashSet hs2 = new HashSet();  //heterogeneous  no datatype declared
		hs2.add("pc");
		hs2.add(875);
		hs2.add(987.097);
		hs2.add("pc");
		
		Iterator itr2 = hs2.iterator(); 
		while (itr2.hasNext()) { 
			System.out.println(itr2.next());
		}
	}
}
		