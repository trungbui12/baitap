package demo2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.year = 2024;
        c1.color = "Pink";
        c1.run();
        c1.run(80);

        SportCar sc1 = new SportCar();
        sc1.brand = "Honda";
        sc1.year = 2022;
        sc1.color = "black";
        sc1.nitro = "N2";
        sc1.run();
        sc1.speedUp();
        /* vi du ep kieu:
        int x = 10;
        float y =(float)x; // y =10.0 // tuc la ep tu kieu int sang kieu float thi lay gia tri cua x =10 ep sang y kieu float se la 10.0
        
        double pi =3.145454;
        int k = (int)pi; //k = 3*/
        
        //F1SportCar f1 = (F1SportCar)c1; //down casting
        //Car c2 = (Car) sc1; // up casting        
    }
}
