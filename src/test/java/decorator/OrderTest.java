package decorator;

import com.cs5800hw4.decorator.Burger;
import com.cs5800hw4.decorator.Food;
import com.cs5800hw4.decorator.HotDog;
import com.cs5800hw4.decorator.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {
    @Test
    public void testOrderAddFood() {
        HotDog hotdog = new HotDog(2.0);
        Burger burger = new Burger(3.0);
        Order order = new Order();
        order.addFood(hotdog);
        order.addFood(burger);
        List<Food> foodItems = order.getFoodItems();
        assertTrue(foodItems.contains(hotdog));
        assertTrue(foodItems.contains(burger));
    }

    @Test
    public void testOrderPrice() {
        HotDog hotdog = new HotDog(2.0);
        Burger burger = new Burger(3.0);
        Order order = new Order();
        order.addFood(hotdog);
        order.addFood(burger);
        assertEquals(hotdog.getPrice() + burger.getPrice(), order.getPrice());

        double discount = 0.8;
        double discountedPrice = (hotdog.getPrice() + burger.getPrice()) * discount;
        order.setDiscount(discount);
        assertEquals(discountedPrice, order.getPrice());
    }
}
