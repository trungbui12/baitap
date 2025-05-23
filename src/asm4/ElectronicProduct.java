package asm4;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Warranty: " + warrantyMonths + " months";
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() > 10000000 ? getPrice() * 0.9 : getPrice();
    }
}