package demo9;

public class Main {
    public static void main(String[] args) {
        ICar ic = new ICar() {

            @Override
            public void speedUp() {
                // TODO Auto-generated method stub
                System.out.println("ICar is speeding up...");
            }
            
        };
        ic.speedUp();
    }
    ICar ic2 = ()->{
        System.out.println("ICar 2 is speeding up... ");
    };
    ic2.speedUp();
}
