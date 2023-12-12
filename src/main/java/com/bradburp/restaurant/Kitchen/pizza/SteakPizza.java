package com.bradburp.restaurant.Kitchen.pizza;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;

public class SteakPizza implements Pizza {

    public PizzaRecipe pizzaRecipe;

    public SteakPizza(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    @Override
    public void prepare() {
        System.out.println("preparing a tasty steak pizza");
    }

    @Override
    public String print() {
        String info = "";
        info += "Garlic enabled: " + pizzaRecipe.isGarlic() + "\n";
        return info;
    }
}
