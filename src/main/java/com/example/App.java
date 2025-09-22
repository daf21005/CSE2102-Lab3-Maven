package com.example;

/**
 * Hello World Maven Application
 * 
 */
public class App {
    
    /**
     * Main method - entry point of the application
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World from Maven!");
        
        if (args.length > 0) {
            System.out.println("Arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  " + (i + 1) + ": " + args[i]);
            }
        }
    }
    
    /**
     * Get a greeting message
     * 
     * @return greeting message
     */
    public static String getGreeting() {
        return "Hello World from Maven!";
    }
    
    /**
     * Get a personalized greeting message
     * 
     * @param name the name to greet
     * @return personalized greeting message
     */
    public static String getGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return getGreeting();
        }
        return "Hello " + name + " from Maven!";
    }
}