package com.bradburp.restaurant.client;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;
import com.bradburp.restaurant.Kitchen.pizza.Pizza;

public abstract class PizzaClient {

    public void orderPizza(PizzaRecipe pizzaRecipe) {
        Pizza pizza = createPizza(pizzaRecipe);
        pizza.prepare();
        pizza.print();
    }

    public abstract Pizza createPizza(PizzaRecipe pizzaRecipe);

}
