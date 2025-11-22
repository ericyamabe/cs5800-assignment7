package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Cheetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheetosTest {
    @Test
    public void CheetosTest() {
        Cheetos cheetos = new Cheetos(1.00, 10);
        assertEquals(cheetos.getPrice(), 1.00);
        assertEquals(cheetos.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Cheetos cheetos = new Cheetos(1.00, 10);
        cheetos.setPrice(1.50);
        assertEquals(cheetos.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Cheetos cheetos = new Cheetos(1.00, 10);
        cheetos.setQuantity(5);
        assertEquals(cheetos.getQuantity(), 5);
    }
}
