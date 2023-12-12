package com.bradburp.restaurant.Kitchen.pizza;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;

public class BespokePizza implements Pizza {

    public PizzaRecipe pizzaRecipe;

    public BespokePizza(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    @Override
    public void prepare() {
        System.out.println("This is a bespoke pizza with garlic, enjoy!");
    }

    @Override
    public String print() {
        String info = "";
        info += "Garlic enabled: " + pizzaRecipe.isGarlic() + "\n";
        return info;
    }
}
