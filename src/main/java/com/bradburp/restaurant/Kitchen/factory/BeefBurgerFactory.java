package com.bradburp.restaurant.Kitchen.factory;

import com.bradburp.restaurant.Kitchen.burgers.BeefBurger;
import com.bradburp.restaurant.Kitchen.burgers.Burger;
import com.bradburp.restaurant.client.BurgerClient;

public class BeefBurgerFactory extends BurgerClient {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
