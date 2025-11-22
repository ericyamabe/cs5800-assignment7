package vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vendingmachine.library.VendingMachine;
import vendingmachine.library.handler.IdleHandler;
import vendingmachine.library.handler.SnackDispenseHandler;
import vendingmachine.library.handler.WaitingForMoneyHandler;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdleHandlerTest {
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
    public void idleHandlerTest() {
        VendingMachine vendingMachine = new VendingMachine();
        IdleHandler idleHandler = new IdleHandler(new WaitingForMoneyHandler(null));
        idleHandler.handleRequest("idle", vendingMachine);
        assertEquals("Idling...\n", outputStreamCaptor.toString());
    }

    @Test
    public void idleHandlerWaitingForMoneyTest() {
        VendingMachine vendingMachine = new VendingMachine();
        IdleHandler idleHandler = new IdleHandler(new WaitingForMoneyHandler(null));
        idleHandler.handleRequest("waitingForMoney", vendingMachine);
        assertEquals("Waiting for money\n", outputStreamCaptor.toString());
    }

    @Test
    public void idleHandlerDispenseTest() {
        VendingMachine vendingMachine = new VendingMachine();
        IdleHandler idleHandler = new IdleHandler(new WaitingForMoneyHandler(null));
        idleHandler.handleRequest("Dispense", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }
}
