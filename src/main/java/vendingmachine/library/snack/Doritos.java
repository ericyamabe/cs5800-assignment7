package vendingmachine.library.snack;

public class Doritos extends Snack {
    public Doritos(double price, int quantity) {
        this.name = "Doritos";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
