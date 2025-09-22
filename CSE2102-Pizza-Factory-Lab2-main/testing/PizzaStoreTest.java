package testing;

import org.junit.Test;
import static org.junit.Assert.*;

// Import main package classes
import main.PizzaFactory;
import main.PizzaType;
import main.Pizza;
import main.PizzaStore;
import main.CheesePizza;
import main.GreekPizza;
import main.PepperoniPizza;
import main.GlutenFreePizza;

public class PizzaStoreTest {
	@Test
	public void testOrderCheesePizza() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza(PizzaType.CHEESE);
		assertTrue(pizza instanceof CheesePizza);
	}

	@Test
	public void testOrderGreekPizza() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza(PizzaType.GREEK);
		assertTrue(pizza instanceof GreekPizza);
	}

	@Test
	public void testOrderPepperoniPizza() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza(PizzaType.PEPPERONI);
		assertTrue(pizza instanceof PepperoniPizza);
	}

	@Test
	public void testOrderGlutenFreePizza() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza(PizzaType.GLUTEN_FREE);
		assertTrue(pizza instanceof GlutenFreePizza);
	}

	@Test
	public void testOrderInvalidPizzaType() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		assertThrows(IllegalArgumentException.class, () -> {
			store.orderPizza(null);
		});
	}
}