package com.bradburp.restaurant.Kitchen.burgers;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing your veggie burger");
    }
}
