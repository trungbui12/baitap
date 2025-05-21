package asm3;

public class Car extends Vehicle {
    private int seatNumber;

    public Car(String licensePlate, String brand, int seatNumber) {
        super(licensePlate, brand);
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", So cho: " + seatNumber;
    }

    @Override
    public int tinhPhiGuiXe(int soGio) {
        int fee = 10000 * soGio;
        if (seatNumber > 5) fee += 3000 * soGio;
        return fee;
    }
}
