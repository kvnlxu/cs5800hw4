package com.cs5800hw4.decorator;

public class Driver {
    public static void main(String[] args) {
        Food basicBurger = new Burger(6.0);
        Food basicHotDog = new HotDog(4.0);
        Food basicFries = new Fries(3.0);

        Food cheeseBurger = new Cheese(basicBurger);
        Food onionCheeseBurger = new Onions(cheeseBurger);

        Food ketchupDog = new Ketchup(basicHotDog);
        Food cheeseDog = new Cheese(basicHotDog);
        Food onionCheeseDog = new Onions(cheeseDog);

        Food ketchupFries = new Ketchup(basicFries);
        Food cheeseFries = new Cheese(basicFries);
        Food onionCheeseFries = new Onions(cheeseFries);

        Customer normalCustomer = new Customer(1.0);
        Customer discountedCustomer = new Customer(0.8);

        System.out.println("Order 1 with no discounts:");
        Order order1 = new Order();
        order1.addFood(cheeseBurger);
        order1.addFood(ketchupDog);
        order1.addFood(ketchupFries);
        order1.printOrder();

        System.out.println();
        System.out.println("Order 2 with discounts:");
        Order order2 = new Order();
        order2.addFood(onionCheeseBurger);
        order2.addFood(basicHotDog);
        order2.addFood(basicFries);
        order2.setDiscount(discountedCustomer.getDiscount());
        order2.printOrder();
    }
}
