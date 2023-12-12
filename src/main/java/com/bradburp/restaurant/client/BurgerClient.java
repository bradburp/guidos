package com.bradburp.restaurant.client;

import com.bradburp.restaurant.Kitchen.burgers.Burger;

public abstract class BurgerClient {

    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
