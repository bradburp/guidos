package com.bradburp.restaurant.Kitchen.factory;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;
import com.bradburp.restaurant.Kitchen.pizza.BespokePizza;
import com.bradburp.restaurant.Kitchen.pizza.Pizza;
import com.bradburp.restaurant.client.PizzaClient;

public class BespokePizzaFactory extends PizzaClient {

    @Override
    public Pizza createPizza(PizzaRecipe pizzaRecipe) {
        return new BespokePizza(pizzaRecipe);
    }
}
