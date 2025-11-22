package vendingmachine.library.snack;

public class Coke extends Snack {
    public Coke(double price, int quantity) {
        this.name = "Coke";
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
