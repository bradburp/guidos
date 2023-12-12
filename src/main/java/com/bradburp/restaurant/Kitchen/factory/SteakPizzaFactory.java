package com.bradburp.restaurant.Kitchen.factory;

import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;
import com.bradburp.restaurant.Kitchen.pizza.Pizza;
import com.bradburp.restaurant.Kitchen.pizza.SteakPizza;
import com.bradburp.restaurant.client.PizzaClient;

public class SteakPizzaFactory extends PizzaClient {

    @Override
    public Pizza createPizza(PizzaRecipe pizzaRecipe) {
        return new SteakPizza(pizzaRecipe);
    }
}
