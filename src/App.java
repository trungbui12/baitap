import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = scanner.nextInt();

        if (so % 2 == 0) {
            System.out.println(so + " la so chan.");
        } else {
            System.out.println(so + " la so le.");
        }

        scanner.close();
    }
}
 
