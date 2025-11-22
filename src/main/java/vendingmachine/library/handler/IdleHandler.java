package vendingmachine.library.handler;

import vendingmachine.library.VendingMachine;

public class IdleHandler extends SnackDispenseHandler
{
    public IdleHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType,  VendingMachine vendingMachine) {
        if(requestType.equals("idle")) {
            System.out.println("Idling...");
        } else {
            super.handleRequest(requestType, vendingMachine);
        }
    }
}
