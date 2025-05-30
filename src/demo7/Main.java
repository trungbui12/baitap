package demo7;

public class Main {
    public static void main(String[] args){
       // Animal a = new Animal(); // ko thể tạo 1 object từ lớp trừu tượng
        Tiger t = new Tiger();
        Rabbit r = new Rabbit();
        anyAnimalEat(t);
        anyAnimalEat(r);

        //
        PaperTiger pt = new PaperTiger();
        anyAnimalEat(pt);
    }

    // viết 1 hàm truyền vào 1 con động vật bất kỳ và cho nó ăn
    static void anyAnimalEat(Animal t){
        t.eat();
    }

}