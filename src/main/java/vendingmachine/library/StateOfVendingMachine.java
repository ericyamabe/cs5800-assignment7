package vendingmachine.library;

import vendingmachine.library.state.State;

public class StateOfVendingMachine {
    private State state;

    public StateOfVendingMachine(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void idle(VendingMachine vendingMachine) {
        this.getState().idle(this);
        vendingMachine.getSnackDispenseHandler().handleRequest("idle",  vendingMachine);
    }

    public void waitingForMoney(VendingMachine vendingMachine) {
        this.getState().waitingForMoney(this);
        vendingMachine.getSnackDispenseHandler().handleRequest("waitingForMoney",  vendingMachine);
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
        this.getState().dispense(this);
        vendingMachine.getSnackDispenseHandler().handleRequest("Dispense",  vendingMachine);
    }
}
