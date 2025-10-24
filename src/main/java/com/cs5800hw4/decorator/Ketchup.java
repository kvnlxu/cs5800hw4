package com.cs5800hw4.decorator;

public class Ketchup extends Topping {

    public Ketchup(Food food) {
        super(food);
        super.setPrice(0.25);
    }

    public String toString() {
        return this.foodItem.toString() + " + Ketchup";
    }
}
