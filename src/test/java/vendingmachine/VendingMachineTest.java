package vendingmachine;

import org.junit.jupiter.api.Test;
import vendingmachine.library.VendingMachine;
import vendingmachine.library.snack.Coke;
import vendingmachine.library.snack.Snack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    VendingMachine vendingMachine = new VendingMachine();

    @Test
    public void addSnackTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        assertEquals("Coke", this.vendingMachine.getCurrentSnackName());
    }

    @Test
    public void selectSnackTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        assertEquals("Coke", this.vendingMachine.getCurrentSnackName());
    }

    @Test
    public void currentSnackNameTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        assertEquals("Coke", this.vendingMachine.getCurrentSnackName());
    }

    @Test
    public void insertInsefficientMoneyTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        double refund = this.vendingMachine.insertMoney(.50);
        assertEquals(refund, .50);
    }

    @Test
    public void insertSufficientMoneyTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        double refund = this.vendingMachine.insertMoney(1.00);
        assertEquals(refund, 0);
    }

    @Test
    public void getSnackTest() {
        Coke coke = new Coke(1.00, 10);
        this.vendingMachine.addSnack(coke);
        this.vendingMachine.selectSnack(coke);
        Snack test = this.vendingMachine.getCurrentSnack();
        assertEquals(coke, test);
    }
}
