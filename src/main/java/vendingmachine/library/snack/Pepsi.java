package vendingmachine.library.snack;

public class Pepsi extends Snack {
    public Pepsi(double price, int quantity) {
        this.name = "Pepsi";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
