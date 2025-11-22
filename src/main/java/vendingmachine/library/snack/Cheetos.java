package vendingmachine.library.snack;

public class Cheetos extends Snack {
    public Cheetos(double price, int quantity) {
        this.name = "Cheetos";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
