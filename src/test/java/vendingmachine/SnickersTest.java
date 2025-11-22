package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Snickers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnickersTest {
    @Test
    public void snickersTest() {
        Snickers snickers = new Snickers(1.00, 10);
        assertEquals(snickers.getPrice(), 1.00);
        assertEquals(snickers.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Snickers snickers = new Snickers(1.00, 10);
        snickers.setPrice(1.50);
        assertEquals(snickers.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Snickers snickers = new Snickers(1.00, 10);
        snickers.setQuantity(5);
        assertEquals(snickers.getQuantity(), 5);
    }
}
