package asm3;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String licensePlate, String brand, double loadCapacity) {
        super(licensePlate, brand);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Trong tai: " + loadCapacity + " tan";
    }

    @Override
    public int tinhPhiGuiXe(int soGio) {
        int fee = 15000 * soGio;
        if (loadCapacity > 5) fee += 5000 * soGio;
        return fee;
    }
}
