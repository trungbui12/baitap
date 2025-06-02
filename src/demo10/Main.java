package demo10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int c;
        try {
            a = sc.nextInt();
            b = sc.nextInt();  
            if (a < 10) {
            // khong cho chia
            throw new Exception("nhap so vao vo van qua"); //chu dong chuyen den xe ly ngoai le
            }          
            c = a/b; // nhap vap a=2 b= 0 -> loi
            System.out.println("c ="+c);
        }catch (ClassCastException e){
            System.out.println("Loi vo van gi do!");
        }catch (ArithmeticException e){
            System.out.println("Co sai sot trong tinh toan!");
        }catch (Exception e){ //xu ly ngoai le
            System.out.println("Xay ra loi" +e.getMessage());
        }      
    }
}

