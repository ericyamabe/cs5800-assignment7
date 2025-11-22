package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Kitkat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitkatTest {
    @Test
    public void kitkatTest() {
        Kitkat kitkat = new Kitkat(1.00, 10);
        assertEquals(kitkat.getPrice(), 1.00);
        assertEquals(kitkat.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Kitkat kitkat = new Kitkat(1.00, 10);
        kitkat.setPrice(1.50);
        assertEquals(kitkat.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Kitkat kitkat = new Kitkat(1.00, 10);
        kitkat.setQuantity(5);
        assertEquals(kitkat.getQuantity(), 5);
    }
}
