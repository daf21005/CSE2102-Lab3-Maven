package com.cse2102.pizzafactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaStoreTest {
    private PizzaFactory factory;
    private PizzaStore store;

    @BeforeEach
    void setUp() {
        factory = new PizzaFactory();
        store = new PizzaStore(factory);
    }

    @Test
    @DisplayName("Test ordering a Cheese Pizza")
    public void testOrderCheesePizza() {
        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        assertTrue(pizza instanceof CheesePizza, "Should return a CheesePizza instance");
    }

    @Test
    @DisplayName("Test ordering a Greek Pizza")
    public void testOrderGreekPizza() {
        Pizza pizza = store.orderPizza(PizzaType.GREEK);
        assertTrue(pizza instanceof GreekPizza, "Should return a GreekPizza instance");
    }

    @Test
    @DisplayName("Test ordering a Pepperoni Pizza")
    public void testOrderPepperoniPizza() {
        Pizza pizza = store.orderPizza(PizzaType.PEPPERONI);
        assertTrue(pizza instanceof PepperoniPizza, "Should return a PepperoniPizza instance");
    }

    @Test
    @DisplayName("Test ordering a Gluten-Free Pizza")
    public void testOrderGlutenFreePizza() {
        Pizza pizza = store.orderPizza(PizzaType.GLUTEN_FREE);
        assertTrue(pizza instanceof GlutenFreePizza, "Should return a GlutenFreePizza instance");
    }

    @Test
    @DisplayName("Test ordering pizza with null type throws exception")
    public void testOrderInvalidPizzaType() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> store.orderPizza(null),
            "Should throw IllegalArgumentException for null pizza type"
        );
        assertEquals("Pizza type cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Test that ordered pizzas are not null")
    public void testOrderedPizzasAreNotNull() {
        for (PizzaType type : PizzaType.values()) {
            Pizza pizza = store.orderPizza(type);
            assertNotNull(pizza, "Ordered pizza should not be null for type: " + type);
        }
    }

    @Test
    @DisplayName("Test PizzaStore constructor with valid factory")
    public void testPizzaStoreConstructor() {
        PizzaStore testStore = new PizzaStore(factory);
        assertNotNull(testStore, "PizzaStore should be created successfully");
    }
}