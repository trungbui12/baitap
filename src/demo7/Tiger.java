package demo7;

public class Tiger extends Animal{
    @Override
    public void eat() { // khi kế thừa bắt buộc phải override hàm trừu tượng
        System.out.println("Eating meat...");
    }

    @Override
    public void dead() {
        System.out.println("The heart was stopped...");
    }
}