package com.cs5800hw4.decorator;

public class Onions extends Topping {

    public Onions(Food food) {
        super(food);
        super.setPrice(1.0);
    }

    public String toString() {
        return this.foodItem.toString() + " + Onions";
    }
}
