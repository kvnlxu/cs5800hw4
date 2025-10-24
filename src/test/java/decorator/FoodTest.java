package decorator;

import com.cs5800hw4.decorator.Burger;
import com.cs5800hw4.decorator.Fries;
import com.cs5800hw4.decorator.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FoodTest {

    @Test
    public void testFoodPrices() {
        double price = 2.0;
        Burger burger = new Burger(price);
        assertEquals(price, burger.getPrice());

        HotDog hotDog = new HotDog(price);
        assertEquals(price, hotDog.getPrice());

        Fries fries = new Fries(price);
        assertEquals(price, fries.getPrice());
    }

    @Test
    public void TestFoodString() {
        double price = 2.0;

        Burger burger = new Burger(price);
        assertTrue(burger.toString().contains("Burger"));

        HotDog hotDog = new HotDog(price);
        assertTrue(hotDog.toString().contains("Hot Dog"));

        Fries fries = new Fries(price);
        assertTrue(fries.toString().contains("Fries"));
    }
}
