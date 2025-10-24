package com.cs5800hw4.decorator;

public class Cheese extends Topping{

    public Cheese(Food food) {
        super(food);
        super.setPrice(0.50);
    }

    public String toString() {
        return this.foodItem.toString() + " + Cheese";
    }
}
