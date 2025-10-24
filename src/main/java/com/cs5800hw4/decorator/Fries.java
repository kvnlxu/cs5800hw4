package com.cs5800hw4.decorator;

public class Fries extends Food {
    private double price;

    public Fries(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Fries";
    }
}
