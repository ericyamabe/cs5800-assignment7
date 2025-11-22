package vendingmachine.library.state;

import vendingmachine.library.StateOfVendingMachine;

public class IdleState implements State {
    @Override
    public void idle(StateOfVendingMachine stateOfVendingMachine) {
        System.out.println("Idle State");
    }

    @Override
    public void dispense(StateOfVendingMachine stateOfVendingMachine) {
        // Do nothing
        System.out.println("IdleState::dispense");
    }

    @Override
    public void waitingForMoney(StateOfVendingMachine stateOfVendingMachine) {
        stateOfVendingMachine.setState(new WaitingForMoneyState());
    }
}
