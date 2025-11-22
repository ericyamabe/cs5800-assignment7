package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.snack.Doritos;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoritosTest {
    @Test
    public void doritosTest() {
        Doritos doritos = new Doritos(1.00, 10);
        assertEquals(doritos.getPrice(), 1.00);
        assertEquals(doritos.getQuantity(), 10);
    }

    @Test
    public void setPriceTest() {
        Doritos doritos = new Doritos(1.00, 10);
        doritos.setPrice(1.50);
        assertEquals(doritos.getPrice(), 1.50);
    }

    @Test
    public void setQuantityTest() {
        Doritos doritos = new Doritos(1.00, 10);
        doritos.setQuantity(5);
        assertEquals(doritos.getQuantity(), 5);
    }
}
