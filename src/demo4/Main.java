package demo4;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        // d.kind = "Alaska"; viet nnay se bi loi
        d.setKind("Alaska"); //nap du lieu vao
        System.out.println("Day la loai"+d.getKind());

        
    }
}
