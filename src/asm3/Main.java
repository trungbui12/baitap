package asm3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorbike("59X1-12345", "Honda", 155));
        vehicles.add(new Car("51F-67890", "Toyota", 7));
        vehicles.add(new Truck("60C-99999", "Isuzu", 8));

        int soGioGui = 3; // có thể nhập từ Scanner

        for (Vehicle v : vehicles) {
            System.out.println(v);
            System.out.println("Phi gui xe (" + soGioGui + " gio): " + v.tinhPhiGuiXe(soGioGui) + " đong\n");
        }
    }
}