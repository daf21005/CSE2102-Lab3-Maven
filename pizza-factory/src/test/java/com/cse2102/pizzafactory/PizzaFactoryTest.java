package com.cse2102.pizzafactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaFactoryTest {
    private PizzaFactory factory;

    @BeforeEach
    void setUp() {
        factory = new PizzaFactory();
    }

    @Test
    @DisplayName("Test creating a Cheese Pizza")
    public void testCreateCheesePizza() {
        Pizza pizza = factory.createPizza(PizzaType.CHEESE);
        assertTrue(pizza instanceof CheesePizza, "Should create a CheesePizza instance");
    }

    @Test
    @DisplayName("Test creating a Greek Pizza")
    public void testCreateGreekPizza() {
        Pizza pizza = factory.createPizza(PizzaType.GREEK);
        assertTrue(pizza instanceof GreekPizza, "Should create a GreekPizza instance");
    }

    @Test
    @DisplayName("Test creating a Pepperoni Pizza")
    public void testCreatePepperoniPizza() {
        Pizza pizza = factory.createPizza(PizzaType.PEPPERONI);
        assertTrue(pizza instanceof PepperoniPizza, "Should create a PepperoniPizza instance");
    }

    @Test
    @DisplayName("Test creating a Gluten-Free Pizza")
    public void testCreateGlutenFreePizza() {
        Pizza pizza = factory.createPizza(PizzaType.GLUTEN_FREE);
        assertTrue(pizza instanceof GlutenFreePizza, "Should create a GlutenFreePizza instance");
    }

    @Test
    @DisplayName("Test creating pizza with null type throws exception")
    public void testCreatePizzaWithNullType() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> factory.createPizza(null),
            "Should throw IllegalArgumentException for null pizza type"
        );
        assertEquals("Pizza type cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Test that created pizzas are not null")
    public void testCreatedPizzasAreNotNull() {
        for (PizzaType type : PizzaType.values()) {
            Pizza pizza = factory.createPizza(type);
            assertNotNull(pizza, "Created pizza should not be null for type: " + type);
        }
    }
}