package com.cs5800hw4.decorator;

public class Customer {
    private double discount;

    public Customer(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
