package asm4;

import java.util.ArrayList;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("E001", "Laptop", 15000000, 24));
        products.add(new FoodProduct("F001", "Milk", 50000, 2));
        products.add(new ClothingProduct("C001", "T-shirt", 200000, "M"));
        products.add(new FoodProduct("F002", "Bread", 30000, 5));
        products.add(new ElectronicProduct("E002", "Phone", 8000000, 12));

        for (Product p : products) {
            System.out.println(p.getInfo());
            System.out.println("Discounted Price: " + p.calculateDiscountedPrice());
            System.out.println("-----------------------");
        }
    }
}
