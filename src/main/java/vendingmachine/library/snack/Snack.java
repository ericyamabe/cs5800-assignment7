package vendingmachine.library.snack;

public abstract class Snack {
    protected String  name;
    protected double  price;
    protected int quantity;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
}
