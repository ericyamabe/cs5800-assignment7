package vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vendingmachine.library.VendingMachine;
import vendingmachine.library.handler.DispanseHandler;
import vendingmachine.library.handler.WaitingForMoneyHandler;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispenseHandlerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void dispenseHandlerIdleTest() {
        VendingMachine vendingMachine = new VendingMachine();
        DispanseHandler dispanseHandler = new DispanseHandler(null);
        dispanseHandler.handleRequest("idle", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    public void dispenseHandlerWaitingForMoneyTest() {
        VendingMachine vendingMachine = new VendingMachine();
        DispanseHandler dispanseHandler = new DispanseHandler(null);
        dispanseHandler.handleRequest("waitingForMoney", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    public void dispenseHandlerDispensingTest() {
        VendingMachine vendingMachine = new VendingMachine();
        DispanseHandler dispanseHandler = new DispanseHandler(null);
        dispanseHandler.handleRequest("Dispensing", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }
}
