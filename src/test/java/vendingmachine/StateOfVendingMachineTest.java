package vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vendingmachine.library.StateOfVendingMachine;
import vendingmachine.library.VendingMachine;
import vendingmachine.library.snack.Coke;
import vendingmachine.library.state.DispensingState;
import vendingmachine.library.state.IdleState;
import vendingmachine.library.state.State;
import vendingmachine.library.state.WaitingForMoneyState;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateOfVendingMachineTest {
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
    public void stateOfVendingMachineTest() {
        IdleState idleState = new IdleState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        State testState = stateOfVendingMachine.getState();
        assertEquals(idleState, testState);
    }

    @Test
    public void addStateTest() {
        IdleState idleState = new IdleState();
        WaitingForMoneyState waitingForMoneyState = new WaitingForMoneyState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        State testState = stateOfVendingMachine.getState();
        assertEquals(idleState, testState);

        stateOfVendingMachine.setState(waitingForMoneyState);
        assertEquals(waitingForMoneyState, stateOfVendingMachine.getState());
    }

    @Test
    public void getStateTest() {
        IdleState idleState = new IdleState();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        State testState = stateOfVendingMachine.getState();
        assertEquals(idleState, testState);
    }

    @Test
    public void IdleStateTest() {
        IdleState idleState = new IdleState();
        VendingMachine vendingMachine = new VendingMachine();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        stateOfVendingMachine.idle(vendingMachine);
        assertEquals("Idle State\nIdling...\n", outputStreamCaptor.toString());
    }

    @Test
    public void WaitingForMoneyStateTest() {
        IdleState idleState = new IdleState();
        WaitingForMoneyState waitingForMoneyState = new WaitingForMoneyState();
        VendingMachine vendingMachine = new VendingMachine();
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        stateOfVendingMachine.setState(waitingForMoneyState);
        stateOfVendingMachine.waitingForMoney(vendingMachine);
        assertEquals("Waiting for money\nWaiting for money\n", outputStreamCaptor.toString());
    }

    @Test
    public void dispenseStateTest() {
        IdleState idleState = new IdleState();
        DispensingState dispensingState = new DispensingState();
        VendingMachine vendingMachine = new VendingMachine();
        Coke coke = new Coke(1.00, 10);
        vendingMachine.addSnack(coke);
        vendingMachine.selectSnack(coke);
        StateOfVendingMachine stateOfVendingMachine = new StateOfVendingMachine(idleState);
        stateOfVendingMachine.setState(dispensingState);
        stateOfVendingMachine.dispenseSnack(vendingMachine);
        assertEquals("Coke selected\nWaiting for money\nDispensing Coke\n\n", outputStreamCaptor.toString());
    }
}
