package com.cs5800hw4.decorator;

public class Burger extends Food {
    private double price;

    public Burger(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Burger";
    }
}
