import java.io.*;

public class Main {

    public static void main(String[] args) {
        Invoice invoiceOne = new Invoice("1", "amazing product", 4, 22.55);
        Invoice invoiceTwo = new Invoice("2", "another amazing product", -4, 2.5);
        Invoice invoiceThree = new Invoice("3", "the most amazing product", 4, -2.5);
        System.out.println(invoiceOne.Amount());
        System.out.println(invoiceTwo.Amount());
        System.out.println(invoiceThree.Amount());
    }
}

class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double Amount() {
        if (quantity < 0) return 0;
        else if (pricePerItem < 0) return 0;
        return quantity * pricePerItem;
    }
}
