package vendingmachine;

import vendingmachine.library.VendingMachine;
import vendingmachine.library.snack.*;

public class Main {
    public static void main(String[] args) {
        Coke coke = new Coke(1.00, 10);
        Pepsi pepsi = new Pepsi(1.00, 10);
        Cheetos cheetos = new Cheetos(1.50, 10);
        Doritos doritos = new Doritos(1.50, 10);
        Kitkat kitkat = new Kitkat(1.00, 10);
        Snickers snickers = new Snickers(1.00, 10);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(snickers);

        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(coke);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(cheetos);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(cheetos);
        vendingMachine.insertMoney(1.50);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(pepsi);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(kitkat);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(kitkat);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(doritos);
        vendingMachine.insertMoney(1.50);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(doritos);
        vendingMachine.insertMoney(1.50);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(coke);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(pepsi);
        vendingMachine.insertMoney(1.00);
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(1.00);
    }
}
