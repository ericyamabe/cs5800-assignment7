package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Coke;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CokeTest {
    @Test
    public void cokeTest() {
        Coke coke = new Coke(1.00, 10);
        assertEquals(coke.getPrice(), 1.00);
        assertEquals(coke.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Coke coke = new Coke(1.00, 10);
        coke.setPrice(1.50);
        assertEquals(coke.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Coke coke = new Coke(1.00, 10);
        coke.setQuantity(5);
        assertEquals(coke.getQuantity(), 5);
    }
}
