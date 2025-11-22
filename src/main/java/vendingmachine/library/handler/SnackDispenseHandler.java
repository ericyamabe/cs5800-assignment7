package vendingmachine.library.handler;

import vendingmachine.library.VendingMachine;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public void handleRequest(String requestType, VendingMachine vendingMachine) {
        if(next != null) {
            next.handleRequest(requestType,  vendingMachine);
        }
    }
}
