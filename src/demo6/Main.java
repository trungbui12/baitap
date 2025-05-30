package demo6;

import java.util.ArrayList;

import demo4.Boy;

public class Main {
    public static void main(String[] args) {
        Boy b = new Boy(); // tao ra 1 object, b la object, new Boy la instance
        // se co 2 o nho tao ra 1 cho v va 1 cho new Boy()
        // khi viet b.name thi no se tim doi duong o b va tim doi duong name o new Boy
        int arr[] = new int [10]; // mang 10 so nguyen 
        arr[0] = 20;
        
        Boy bs[] = new Boy[10]; // mang 10 cau con trai
        bs[0] = new Boy();
        // mang gioi han so luong 10 cau con trai

        ArrayList arrayList = new ArrayList(); //mang dang danh sach
        // arraylist giup thoai mai so luong can dung ma ko bij gioi han
        arrayList.add(20);
        arrayList.add("Hello");
        arrayList.add(new Boy());
        
        ArrayList<String> strList = new ArrayList<>();
        // ko bi rang buoc so luong nhung bat buoc chi thay doi chuoi
        strList.add("T2409M");
        // strList.add(50); se bi loi vi la mang String
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(50);
        // strList.add("abc") se bi loi vi la mang int: so nguyen
        // ban chat cua arraylist la 1 object
        // strList ben trong co 1 item ban chat la 1 danh sach
        // add ban chat la 1 Fluction: them 1 phan tu vao items

        System.out.println("pt dau tien: " +strList.get(0)); //.get(0): lay phan tu dau tien
        // arrayList la tap hop Linked list
        ArrayList<Boy> boyaArrayList = new ArrayList<>();
        // uu diem cua arraylist la ko can lien ket nhau trong o nho 
        boyaArrayList.add(new Boy());
        boyaArrayList.add(new Boy());
        boyaArrayList.add(new Boy());
        boyaArrayList.add(new Boy());
        boyaArrayList.add(new Boy());

        for (int i = 0; i < boyaArrayList.size(); i++){ // boyArraylist.size()= 5
            // xoa x khoi danh sach
            boyaArrayList.remove(i);
        }
        boyaArrayList.remove(2);
        for (Boy x : boyaArrayList){ //tu dong duyet toan bo danh sach
            // x tuong duong voi boyArrayList.get(i)
            // xoa x khoi danh sach
            boyaArrayList.remove(x);
            
        }
        // Tạo 1 sinh viên
        Student s = new Student();


        // them 1 ban gai
        GirlFriend g1 = new GirlFriend("Tran Ha Linh", "09823728372378", 18);
        s.addGirlFriend(g1);
        // them ban gai thu 2
        GirlFriend g2 = new GirlFriend("Lan anh","09034932423", 20);
        s.addGirlFriend(g2);
        // xoa ban gai 2
        s.removeGirlFriend(g2);
    }
}
