package com.cse2102.pizzafactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TranslatePizzaTypeTest {

    @Test
    @DisplayName("Test translation of CHEESE pizza type")
    public void testTranslateCheesePizzaType() {
        String result = TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE);
        assertEquals("Cheese", result, "CHEESE should translate to 'Cheese'");
    }

    @Test
    @DisplayName("Test translation of GREEK pizza type")
    public void testTranslateGreekPizzaType() {
        String result = TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.GREEK);
        assertEquals("Greek", result, "GREEK should translate to 'Greek'");
    }

    @Test
    @DisplayName("Test translation of PEPPERONI pizza type")
    public void testTranslatePepperoniPizzaType() {
        String result = TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI);
        assertEquals("Pepperoni", result, "PEPPERONI should translate to 'Pepperoni'");
    }

    @Test
    @DisplayName("Test translation of GLUTEN_FREE pizza type")
    public void testTranslateGlutenFreePizzaType() {
        String result = TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.GLUTEN_FREE);
        assertEquals("Gluten-Free", result, "GLUTEN_FREE should translate to 'Gluten-Free'");
    }

    @Test
    @DisplayName("Test all pizza type translations are not null or empty")
    public void testAllTranslationsAreValid() {
        for (PizzaType type : PizzaType.values()) {
            String result = TranslatePizzaType.fromPizzaTypeEnumToString(type);
            assertNotNull(result, "Translation should not be null for type: " + type);
            assertFalse(result.trim().isEmpty(), "Translation should not be empty for type: " + type);
        }
    }
}