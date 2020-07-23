package com.to.Collections;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressMap {
    public static void main(String[] args) {
        
    	
		
		
    	Map<String, List<String>> ownerAddresses = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + ownerAddresses.isEmpty());

        List<String> addresses1 = List.of("Address 1", "Address 2");
        ownerAddresses.put("John", addresses1);
        
        List<String> addresses2 = List.of("Address 3", "Address 4");
        ownerAddresses.put("Rajeev", addresses2);
        
        List<String> addresses3 = List.of("Address 3", "Address 4");
        ownerAddresses.put("Steve", addresses3);

        System.out.println("userCityMapping HashMap : " + ownerAddresses);
        
        System.out.println("Johns's addresses : " + ownerAddresses.get("John"));
        System.out.println("Steve's addresses : " + ownerAddresses.get("Steve"));
        
        // Find the size of a HashMap
        System.out.println("We have the city information of " + ownerAddresses.size() + " users");

		/*
		 * String userName = "Steve"; // Check if a key exists in the HashMap
		 * if(ownerAddresses.containsKey(userName)) { // Get the value assigned to a
		 * given key in the HashMap String city = ownerAddresses.get(userName);
		 * System.out.println(userName + " lives in " + city); } else {
		 * System.out.println("City details not found for user " + userName); }
		 * 
		 * // Check if a value exists in a HashMap
		 * if(ownerAddresses.containsValue("New York")) { System.out.
		 * println("There is a user in the userCityMapping who lives in New York"); }
		 * else { System.out.
		 * println("There is no user in the userCityMapping who lives in New York"); }
		 * 
		 * 
		 * // Modify the value assigned to an existing key ownerAddresses.put(userName,
		 * "California"); System.out.println(userName + " moved to a new city " +
		 * ownerAddresses.get(userName) + ", New userCityMapping : " + ownerAddresses);
		 * 
		 * // The get() method returns `null` if the specified key was not found in the
		 * HashMap System.out.println("Lisa's city : " + ownerAddresses.get("Lisa"));
		 */
    }
}






