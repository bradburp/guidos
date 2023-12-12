package com.bradburp.restaurant.Kitchen.factory;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;
import com.bradburp.restaurant.Kitchen.pizza.CalzonePizza;
import com.bradburp.restaurant.Kitchen.pizza.Pizza;
import com.bradburp.restaurant.client.PizzaClient;

public class CalzonePizzaFactory extends PizzaClient {

    @Override
    public Pizza createPizza(PizzaRecipe pizzaRecipe) {
        return new CalzonePizza(pizzaRecipe);
    }
}
