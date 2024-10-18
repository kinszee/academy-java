package com.bptn.course._wk3_teachback;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Ex1MapAndSetCombo {
	
    public static void main(String[] args) {
    	/*
    	//HASHSET INTO HASHMAP
        Map<String, Set<String>> personHobbies = new HashMap<>();

        // Add hobbies for Alice
        personHobbies.put("Alice", new HashSet<>());
        personHobbies.get("Alice").add("Swimming"); // Change to swimming - sets can only contain unique values
        personHobbies.get("Alice").add("Swimming");
        //System.out.println( personHobbies.get("Alice") );

        // Add hobbies for Bob
        personHobbies.put("Bob", new HashSet<>());
        personHobbies.get("Bob").add("Cycling");
        personHobbies.get("Bob").add("Swimming");

        // Print the map
       for (Map.Entry<String, Set<String>> entry : personHobbies.entrySet()) {
            System.out.println("Person: " + entry.getKey() + ", Hobbies: " + entry.getValue());
        }
        
        */
        
    	
        /*
        //TREESET INTO TREEMAP
        Map<String, Set<String>> personHobbies = new TreeMap<>();

        // Add hobbies for Alice
        personHobbies.put("Alice", new TreeSet<>());
        personHobbies.get("Alice").add("Reading"); // Change letter "R" to "Z" - TreeMap sorts in ascending order
        personHobbies.get("Alice").add("Swimming");
        //System.out.println( personHobbies.get("Alice") );

        // Add hobbies for Bob
        personHobbies.put("Bob", new TreeSet<>());
        personHobbies.get("Bob").add("Cycling");
        personHobbies.get("Bob").add("Swimming");

        // Print the map
        for (Map.Entry<String, Set<String>> entry : personHobbies.entrySet()) {
            System.out.println("Person: " + entry.getKey() + ", Hobbies: " + entry.getValue());
        }
        */
        
        
        
        
        //LINKEDHASHSET INTO LINKEDHASHMAP
    	// Use LinkedHashMap to maintain insertion order
        Map<String, Set<String>> personHobbies = new LinkedHashMap<>();

        // Add hobbies for Alice
        personHobbies.put("Alice", new LinkedHashSet<>());
        personHobbies.get("Alice").add("Reading"); // Would maintain insertion order and store unique elements
        personHobbies.get("Alice").add("Swimming");
        personHobbies.get("Alice").add("Boxing");
        personHobbies.get("Alice").add("Fencing"); // Change to Boxing
        //System.out.println(personHobbies.get("Alice"));

        // Add hobbies for Bob
        personHobbies.put("Bob", new LinkedHashSet<>());
        personHobbies.get("Bob").add("Cycling");
        personHobbies.get("Bob").add("Hiking");
        personHobbies.get("Bob").add("Traveling");
        personHobbies.get("Bob").add("Swimming");
        personHobbies.get("Bob").add("Skiing");

        // Print the map
//        for (Map.Entry<String, Set<String>> entry : personHobbies.entrySet()) {
//            System.out.println("Person: " + entry.getKey() + ", Hobbies: " + entry.getValue());
//        }   
        
        //Remove Traveling
       personHobbies.get("Bob").remove("Traveling");
        
       //  Print the map
        for (Map.Entry<String, Set<String>> entry : personHobbies.entrySet()) {
            System.out.println("Person: " + entry.getKey() + ", Hobbies: " + entry.getValue());
        }   
              
        
    }
}
