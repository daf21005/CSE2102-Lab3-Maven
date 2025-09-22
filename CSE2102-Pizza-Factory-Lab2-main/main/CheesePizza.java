package main;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE) + " pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE) + " pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE) + " pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing a " + TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE) + " pizza.");
    }
}