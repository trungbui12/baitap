// đặt tên cho package viết thường
// đặt tên cho file class viết hoa chữ đầu

package demo1;

public class Student {
    String name; // đây là attribute
    int age;
    String telephone;

    //method
    void eat(){
        System.out.println(this.name +" Eating...");// this là đối tượng ngầm định 
    }

    void run(){
        System.out.println(this.name +" Running...");
    }
    
    void learn(){
        System.out.println(this.name +" Learning...");
    }

    public Student(String n1, int a1, String t1){ // public là hàm khởi tạo:  
        this.name = n1;
        this.age = a1;
        this.telephone = t1;
        System.out.println("Constructor running...");

    }
}
