package com.to.Collections;

import java.util.HashMap;
import java.util.LinkedList;

/*
 * A. P-1 1. Should be able to add the person details (Name, Age, Gender,
 * contact, Address) to a list; 2. Retrieve the complete list data
 */
public class P1 {
    
	
    public static void main(String[] args) {
    	InputHelper helper = new InputHelper();   // create an instance inputhelper
		String name = helper.getInput("Enter name: ");
        String age = helper.getInput("Enter age: ");
        String gender = helper.getInput("Enter gender: ");
        String contact = helper.getInput("Enter contact number: ");
        String address = helper.getInput("Enter contact address: ");
    	
    	LinkedList<String> infoList = new LinkedList();
        infoList.add(name);
        infoList.add(age);
        infoList.add(gender);
        infoList.add(contact);
        infoList.add(address);
        
        System.out.println(infoList);
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        phonebook.put("Brenda", 22222);
        phonebook.put(null, 000);
		/*
		 * if(phonebook.containsKey("Brenda")) { phonebook.remove("Brenda"); }
		 */
        //phonebook.clear();
        System.out.println(phonebook);
        
    }

    
}
