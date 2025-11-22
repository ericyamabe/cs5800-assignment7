package vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vendingmachine.library.StateOfVendingMachine;
import vendingmachine.library.state.IdleState;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdleStateTest {
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
        IdleState idleState = new IdleState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        idleState.idle(stateOfVendingMachine);
        assertEquals("Idle State\n", outputStreamCaptor.toString());
    }

    @Test
    public void waitingForMoneyTest() {
        IdleState idleState = new IdleState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        idleState.waitingForMoney(stateOfVendingMachine);
        assertEquals("", outputStreamCaptor.toString());
    }

    @Test
    public void dispensingTest() {
        IdleState idleState = new IdleState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        idleState.dispense(stateOfVendingMachine);
        assertEquals("IdleState::dispense\n", outputStreamCaptor.toString());
    }
}
