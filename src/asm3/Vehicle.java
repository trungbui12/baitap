package asm3;

public class Vehicle {
    protected String licensePlate;
    protected String brand;

    public Vehicle() {}

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Bien so: " + licensePlate + ", Hang: " + brand;
    }

    public int tinhPhiGuiXe(int soGio) {
        return 0;
    }
}