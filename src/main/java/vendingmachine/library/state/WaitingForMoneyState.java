package vendingmachine.library.state;

import vendingmachine.library.StateOfVendingMachine;

public class WaitingForMoneyState implements State {
    @Override
    public void waitingForMoney(StateOfVendingMachine stateOfVendingMachine) {
        System.out.println("Waiting for money");
    }

    @Override
    public void idle(StateOfVendingMachine stateOfVendingMachine) {
        // Do Nothing
    }

    @Override
    public void dispense(StateOfVendingMachine stateOfVendingMachine) {
        stateOfVendingMachine.setState(new DispensingState());
    }
}
