package main;

public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public static void main(String[] args) {
        // Create an instance of the PizzaFactory
        PizzaFactory pizzaFactory = new PizzaFactory();

        // Create an instance of the PizzaStore and pass the factory to it
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        // Order and test different types of pizzas
        System.out.println("Ordering a Cheese Pizza:");
        pizzaStore.orderPizza(PizzaType.CHEESE);

        System.out.println("\nOrdering a Greek Pizza:");
        pizzaStore.orderPizza(PizzaType.GREEK);
        
        System.out.println("\nOrdering a Pepperoni Pizza:");
        pizzaStore.orderPizza(PizzaType.PEPPERONI);
    }
}