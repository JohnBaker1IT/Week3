package com.to.Collections;

import java.util.*;

public class BlogTitles {


    private Set<String> javaTitles;


    private Set<String> webTitles;

    public BlogTitles() {
        javaTitles = new HashSet<>();
        webTitles = new HashSet<>();
    }

    public void initalizeTitles() {
        javaTitles.add("Leveraging Java Data Structures");
        javaTitles.add("Java Lambdas: Getting Started");
        javaTitles.add("My First Spring Boot App");
        javaTitles.add("Spring Boot and React");

        webTitles.add("Creating the Same App with React and Angular");
        webTitles.add("Learn Kubernetes in Under 4 Hours");
        webTitles.add("My First Spring Boot App");
        webTitles.add("Spring Boot and React");

        System.out.println("javaTitles: ");
        for (String titles : javaTitles)
        	System.out.println(titles);
        System.out.println("");
        
        System.out.println("webTitles: ");
        for (String titles : webTitles)
        	System.out.println(titles);
        System.out.println("");
        
        System.out.println("Set intersection with what they have in common: ");
        Set<String> intersection = new HashSet<>(javaTitles);
        intersection.retainAll(webTitles);
        System.out.println(intersection);
    }
}
