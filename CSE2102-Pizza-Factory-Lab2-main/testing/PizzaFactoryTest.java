package testing;

import org.junit.Test;
import static org.junit.Assert.*;

// Import main package classes
import main.PizzaFactory;
import main.PizzaType;
import main.Pizza;
import main.CheesePizza;
import main.GreekPizza;
import main.PepperoniPizza;
import main.GlutenFreePizza;

public class PizzaFactoryTest {
	private final PizzaFactory factory = new PizzaFactory();

	@Test
	public void testCreateCheesePizza() {
		Pizza pizza = factory.createPizza(PizzaType.CHEESE);
		assertTrue(pizza instanceof CheesePizza);
	}

	@Test
	public void testCreateGreekPizza() {
		Pizza pizza = factory.createPizza(PizzaType.GREEK);
		assertTrue(pizza instanceof GreekPizza);
	}

	@Test
	public void testCreatePepperoniPizza() {
		Pizza pizza = factory.createPizza(PizzaType.PEPPERONI);
		assertTrue(pizza instanceof PepperoniPizza);
	}

	@Test
	public void testCreateGlutenFreePizza() {
		Pizza pizza = factory.createPizza(PizzaType.GLUTEN_FREE);
		assertTrue(pizza instanceof GlutenFreePizza);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCreatePizzaWithInvalidType() {
		factory.createPizza(null);
	}
}