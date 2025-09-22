package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the App class
 */
public class AppTest {

    @Test
    @DisplayName("Test basic greeting message")
    public void testGetGreeting() {
        String expected = "Hello World from Maven!";
        String actual = App.getGreeting();
        assertEquals(expected, actual, "Basic greeting should match expected message");
    }

    @Test
    @DisplayName("Test personalized greeting with valid name")
    public void testGetGreetingWithName() {
        String name = "John";
        String expected = "Hello John from Maven!";
        String actual = App.getGreeting(name);
        assertEquals(expected, actual, "Personalized greeting should include the name");
    }

    @Test
    @DisplayName("Test greeting with null name falls back to basic greeting")
    public void testGetGreetingWithNullName() {
        String expected = "Hello World from Maven!";
        String actual = App.getGreeting(null);
        assertEquals(expected, actual, "Null name should fall back to basic greeting");
    }

    @Test
    @DisplayName("Test greeting with empty name falls back to basic greeting")
    public void testGetGreetingWithEmptyName() {
        String expected = "Hello World from Maven!";
        String actual = App.getGreeting("");
        assertEquals(expected, actual, "Empty name should fall back to basic greeting");
    }

    @Test
    @DisplayName("Test greeting with whitespace-only name falls back to basic greeting")
    public void testGetGreetingWithWhitespaceName() {
        String expected = "Hello World from Maven!";
        String actual = App.getGreeting("   ");
        assertEquals(expected, actual, "Whitespace-only name should fall back to basic greeting");
    }

    @Test
    @DisplayName("Test greeting with name containing spaces")
    public void testGetGreetingWithNameContainingSpaces() {
        String name = "John Doe";
        String expected = "Hello John Doe from Maven!";
        String actual = App.getGreeting(name);
        assertEquals(expected, actual, "Name with spaces should be handled correctly");
    }
}