package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Pepsi;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PepsiTest {
    @Test
    public void pepsiTest() {
        Pepsi pepsi = new Pepsi(1.00, 10);
        assertEquals(pepsi.getPrice(), 1.00);
        assertEquals(pepsi.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Pepsi pepsi = new Pepsi(1.00, 10);
        pepsi.setPrice(1.50);
        assertEquals(pepsi.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Pepsi pepsi = new Pepsi(1.00, 10);
        pepsi.setQuantity(5);
        assertEquals(pepsi.getQuantity(), 5);
    }
}
