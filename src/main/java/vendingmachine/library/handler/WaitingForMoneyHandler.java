package vendingmachine.library.handler;

import vendingmachine.library.VendingMachine;

public class WaitingForMoneyHandler extends SnackDispenseHandler {
    public WaitingForMoneyHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType, VendingMachine vendingMachine) {
        if(requestType.equals("waitingForMoney")) {
            System.out.println("Waiting for money");
        } else {
            super.handleRequest(requestType, vendingMachine);
        }
    }
}
