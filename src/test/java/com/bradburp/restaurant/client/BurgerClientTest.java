package com.bradburp.restaurant.client;

import com.bradburp.restaurant.Kitchen.factory.BeefBurgerFactory;
import com.bradburp.restaurant.Kitchen.factory.VeggieBurgerFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerClientTest {

    @Test
    void myTest() {

        BurgerClient beefBurger = new BeefBurgerFactory();
        beefBurger.orderBurger();

        BurgerClient veggieBurger = new VeggieBurgerFactory();
        veggieBurger.orderBurger();

    }

}