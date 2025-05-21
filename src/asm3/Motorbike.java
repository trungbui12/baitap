package asm3;

public class Motorbike extends Vehicle {
private int engineCapacity;

    public Motorbike(String licensePlate, String brand, int engineCapacity) {
        super(licensePlate, brand);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dung tich: " + engineCapacity + "cc";
    }

    @Override
    public int tinhPhiGuiXe(int soGio) {
        int fee = 5000 * soGio;
        if (engineCapacity > 150) fee += 2000 * soGio;
        return fee;
    }
}
