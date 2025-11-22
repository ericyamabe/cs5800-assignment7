package vendingmachine.library.state;

import vendingmachine.library.StateOfVendingMachine;

public class DispensingState implements State {
    @Override
    public void dispense(StateOfVendingMachine stateOfVendingMachine) {
        stateOfVendingMachine.setState(new IdleState());
    }

    @Override
    public void idle(StateOfVendingMachine stateOfVendingMachine) {
        // Do Nothing
    }

    public void waitingForMoney(StateOfVendingMachine stateOfVendingMachine) {
        // Do Nothing
    }
}
