package com.bradburp.restaurant.Kitchen.models;

public class PizzaRecipe {
    private boolean garlic;

    public boolean isGarlic() {
        return garlic;
    }

    private PizzaRecipe() {
    }

    public static class Builder {
        private boolean garlic;

        public Builder() {
        }

        public Builder withGarlic(boolean garlic) {
            this.garlic = garlic;
            return this;
        }

        public PizzaRecipe build() {
            PizzaRecipe pizzaRecipe = new PizzaRecipe();
            pizzaRecipe.garlic = this.garlic;
            return pizzaRecipe;
        }
    }
}
