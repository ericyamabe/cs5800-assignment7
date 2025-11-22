package vendingmachine.library;

import vendingmachine.library.handler.DispanseHandler;
import vendingmachine.library.handler.IdleHandler;
import vendingmachine.library.handler.SnackDispenseHandler;
import vendingmachine.library.handler.WaitingForMoneyHandler;
import vendingmachine.library.snack.Snack;
import vendingmachine.library.state.IdleState;

import java.util.ArrayList;

public class VendingMachine {
    private StateOfVendingMachine stateOfVendingMachine;
    private SnackDispenseHandler snackDispenseHandler;
    private ArrayList<Snack> availableSnacks = new ArrayList<Snack>();
    private Integer currentSnack;

    public VendingMachine() {
        this.stateOfVendingMachine = new StateOfVendingMachine(new IdleState());
        this.snackDispenseHandler = new IdleHandler(new WaitingForMoneyHandler(new DispanseHandler(null)));
    }

    public void addSnack(Snack snack) {
        if (!availableSnacks.contains(snack)) {
            availableSnacks.add(snack);
        }
    }

    public void selectSnack(Snack snack) {
        if (availableSnacks.contains(snack)) {
            this.currentSnack = this.availableSnacks.indexOf(snack);
            System.out.println(this.availableSnacks.get(this.currentSnack).getName() + " selected");

            if(this.availableSnacks.get(this.currentSnack).getQuantity() > 0) {
                this.stateOfVendingMachine.waitingForMoney(this);
            } else {
                System.out.println(this.availableSnacks.get(this.currentSnack).getName() + " is not available");
            }
        }
    }

    public double insertMoney(double payment) {
        if(this.availableSnacks.get(this.currentSnack).getPrice() <= payment) {
            this.stateOfVendingMachine.dispenseSnack(this);
            return (payment - this.availableSnacks.get(this.currentSnack).getPrice());
        }

        System.out.println("Not enough money to purchase " + this.availableSnacks.get(this.currentSnack).getName() + "\n");
        return payment;
    }

    public String getCurrentSnackName() {
        return this.availableSnacks.get(this.currentSnack).getName();
    }

    public Snack getCurrentSnack() {
        return this.availableSnacks.get(this.currentSnack);
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return this.snackDispenseHandler;
    }
}
