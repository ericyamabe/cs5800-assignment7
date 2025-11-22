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

public class WaitingForMoneyHandlerTest {
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
    public void waitingForMoneyHandlerIdleTest() {
        VendingMachine vendingMachine = new VendingMachine();
        WaitingForMoneyHandler waitingForMoneyHandler = new WaitingForMoneyHandler(new DispanseHandler(null));
        waitingForMoneyHandler.handleRequest("idle", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    public void waitingForMoneyHandlerTest() {
        VendingMachine vendingMachine = new VendingMachine();
        WaitingForMoneyHandler waitingForMoneyHandler = new WaitingForMoneyHandler(new DispanseHandler(null));
        waitingForMoneyHandler.handleRequest("waitingForMoney", vendingMachine);
        assertEquals("Waiting for money\n", outputStreamCaptor.toString());
    }

    @Test
    public void waitingForMoneyHandlerDispensingTest() {
        VendingMachine vendingMachine = new VendingMachine();
        WaitingForMoneyHandler waitingForMoneyHandler = new WaitingForMoneyHandler(new DispanseHandler(null));
        waitingForMoneyHandler.handleRequest("Dispensing", vendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }
}
