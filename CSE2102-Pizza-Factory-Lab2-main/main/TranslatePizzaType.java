package main;

public class TranslatePizzaType {
    public static String fromPizzaTypeEnumToString(PizzaType type) {
        switch (type) {
            case CHEESE:
                return "Cheese";
            case GREEK:
                return "Greek";
            case PEPPERONI:
                return "Pepperoni";
            case GLUTEN_FREE:
                return "Gluten-Free";
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}