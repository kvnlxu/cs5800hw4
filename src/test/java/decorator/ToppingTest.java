package decorator;

import com.cs5800hw4.decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToppingTest {
    @Test
    public void testToppingPrice() {
        Food burger = new Burger(3.0);
        Food cheeseBurger = new Cheese(burger);
        assertTrue(cheeseBurger.getPrice() >= burger.getPrice());

        Food ketchupBurger = new Ketchup(burger);
        assertTrue(ketchupBurger.getPrice() >= burger.getPrice());

        Food onionBurger = new Onions(burger);
        assertTrue(onionBurger.getPrice() >= burger.getPrice());

        Food onionCheeseBurger = new Onions(cheeseBurger);
        assertTrue(onionCheeseBurger.getPrice() >= burger.getPrice());
    }

    @Test
    public void testToppingToString() {
        Food burger = new Burger(3.0);
        Food cheeseBurger = new Cheese(burger);
        assertTrue(cheeseBurger.toString().contains("Cheese"));

        Food ketchupBurger = new Ketchup(burger);
        assertTrue(ketchupBurger.toString().contains("Ketchup"));

        Food onionBurger = new Onions(burger);
        assertTrue(onionBurger.toString().contains("Onion"));

        Food onionCheeseBurger = new Onions(cheeseBurger);
        assertTrue(onionCheeseBurger.toString().contains("Onion"));
        assertTrue(onionCheeseBurger.toString().contains("Cheese"));
    }
}
