package com.cs5800hw4.decorator;

public abstract class Topping extends Food {
    protected Food foodItem;
    private double price;

    public Topping(Food food) {
        this.foodItem = food;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return foodItem.getPrice() + this.price;
    }
}
