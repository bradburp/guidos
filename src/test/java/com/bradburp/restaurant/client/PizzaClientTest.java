package com.bradburp.restaurant.client;

import com.bradburp.restaurant.Kitchen.factory.BespokePizzaFactory;
import com.bradburp.restaurant.Kitchen.factory.CalzonePizzaFactory;
import com.bradburp.restaurant.Kitchen.factory.SteakPizzaFactory;
import com.bradburp.restaurant.Kitchen.models.PizzaRecipe;
import org.junit.jupiter.api.Test;

class PizzaClientTest {

    @Test
    void createBespokePizza() {
        PizzaClient bespokePizza = new BespokePizzaFactory();
        bespokePizza.orderPizza(
                new PizzaRecipe.Builder()
                        .withGarlic(false)
                        .build());
    }

    @Test
    void createATastyCalzonePizza() {
        PizzaClient calzonePizza = new CalzonePizzaFactory();
        PizzaRecipe pizzaRecipe = new PizzaRecipe.Builder().withGarlic(true).build();
        calzonePizza.orderPizza(pizzaRecipe);
    }

    @Test
    void createATastySteakPizza() {
        PizzaClient steakPizzaFactory = new SteakPizzaFactory();
        PizzaRecipe pizzaRecipe = new PizzaRecipe.Builder().withGarlic(true).build();
        steakPizzaFactory.orderPizza(pizzaRecipe);
    }

}