package vendingmachine.library.snack;

public class Kitkat extends Snack {
    public Kitkat(double price, int quantity) {
        this.name = "Kitkat";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
