package com.bradburp.restaurant.Kitchen.factory;

import com.bradburp.restaurant.Kitchen.burgers.Burger;
import com.bradburp.restaurant.Kitchen.burgers.VeggieBurger;
import com.bradburp.restaurant.client.BurgerClient;

public class VeggieBurgerFactory extends BurgerClient {

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
