package davidrios.BE_U2W1D1_pizzeriaMenu.entities;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private ArrayList<Topping> Toppings = new ArrayList<>(){{add(new Tomato()); add(new Cheese());}};
    private int calories;
    private double price;

    public Pizza(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;

    }

    public Pizza(String name, Topping topping, )
}
