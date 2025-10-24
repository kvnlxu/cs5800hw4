package com.cs5800hw4.decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foodItems;
    private double discount = 1.0;

    public Order() {
        this.foodItems = new ArrayList<>();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void addFood(Food food) {
        this.foodItems.add(food);
    }

    public List<Food> getFoodItems() {
        return foodItems;
    }

    public double getPrice() {
        double totalPrice = 0.0;
        for (Food foodItem : foodItems) {
            totalPrice += foodItem.getPrice();
        }
        return totalPrice * discount;
    }

    public void printOrder() {
        for  (Food foodItem : foodItems) {
            System.out.println(foodItem + ": " + foodItem.getPrice());
        }
        if (this.discount < 1.0) {
            System.out.println("Applying discount: " + this.discount + "%");
        }
        double roundedPrice = (double) Math.round(this.getPrice() * 100) / 100;
        System.out.println("Order total: " + roundedPrice);
    }
}
