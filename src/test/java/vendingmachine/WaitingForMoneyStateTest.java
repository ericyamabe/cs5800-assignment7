package vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vendingmachine.library.StateOfVendingMachine;
import vendingmachine.library.state.WaitingForMoneyState;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitingForMoneyStateTest {
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
    public void idleTest() {
        WaitingForMoneyState waitingForMoneyState = new WaitingForMoneyState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(waitingForMoneyState);
        waitingForMoneyState.idle(stateOfVendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    public void waitingForMoneyStateTest() {
        WaitingForMoneyState waitingForMoneyState = new WaitingForMoneyState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(waitingForMoneyState);
        waitingForMoneyState.waitingForMoney(stateOfVendingMachine);
        assertEquals("Waiting for money\n", outputStreamCaptor.toString());
    }

    @Test
    public void dispensingStateTest() {
        WaitingForMoneyState waitingForMoneyState = new WaitingForMoneyState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(waitingForMoneyState);
        waitingForMoneyState.dispense(stateOfVendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }
}
