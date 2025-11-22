package vendingmachine.library.state;

import vendingmachine.library.StateOfVendingMachine;

public interface State {
    void idle(StateOfVendingMachine stateOfVendingMachine);
    void dispense(StateOfVendingMachine stateOfVendingMachine);
    void waitingForMoney(StateOfVendingMachine stateOfVendingMachine);
}
