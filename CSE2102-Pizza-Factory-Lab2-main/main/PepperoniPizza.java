package main;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI) + " pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI) + " pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI) + " pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI) + " pizza.");
    }
}