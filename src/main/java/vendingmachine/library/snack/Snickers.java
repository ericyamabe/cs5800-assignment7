package vendingmachine.library.snack;

public class Snickers extends Snack {
    public Snickers(double price, int quantity) {
        this.name = "Snickers";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
