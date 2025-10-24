package com.cs5800hw4.decorator;

public class HotDog extends Food {
    private double price;

    public HotDog(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Hot Dog";
    }
}
