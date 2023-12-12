package com.bradburp.restaurant.Kitchen.burgers;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing your beef burger");
    }
}
