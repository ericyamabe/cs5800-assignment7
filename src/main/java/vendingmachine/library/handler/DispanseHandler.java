package vendingmachine.library.handler;

import vendingmachine.library.VendingMachine;
import vendingmachine.library.snack.Snack;

public class DispanseHandler extends SnackDispenseHandler {
    public DispanseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(String requestType, VendingMachine vendingMachine) {
        if (requestType.equals("Dispense")) {
            Snack snack = vendingMachine.getCurrentSnack();
            snack.setQuantity(snack.getQuantity() - 1);
            System.out.println("Dispensing " + vendingMachine.getCurrentSnackName() + "\n");
        } else {
            super.handleRequest(requestType, vendingMachine);
        }
    }
}
