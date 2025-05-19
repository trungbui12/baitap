package demo2;

public class Car {
    String brand;
    int year;
    String color;

    void run(){
        System.out.println("Car is running: 40km/h");
    }

    void run (int speed){
        System.out.println("Car is running: "+speed+"km/h");
    }
    void run(float xyz){

    }
    void run(int x, String y){

    }
    void run(String x, int y){
        
    }
    // trong 1 class co the goi 1 ten nhung co nhieu kieu du lieu khac n
    void speedUp(){
        System.out.println("Car is speeding up...");
    }
}
