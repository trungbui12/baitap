package demo3;

public class Man {
    // ham private chi su dung trong pham vi cua file Man chu ko dung duoc trong phai main
    // ko viet gi thi trong pham vi package
    /*private*/ String name;
    /*private*/ int age;
    /*private*/ protected void drink(){
    // protected se chho su dung trong pham vi lop cha con khac package
    // public thi duoc dung het
        System.out.println("Drink beer...");
            this.name = "Xmen";
            System.out.println("Drinking beer...");
    }
    private void married(){
        this.drink();
    }
}
