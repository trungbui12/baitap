package demo6;

import java.util.ArrayList;

import demo4.Boy;

public class Student {
    private String name;
    private String address;
    private ArrayList<GirlFriend> girlFriend = new ArrayList<>(); // rieng 1 so dang arraylist thi them phan new 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public ArrayList<GirlFriend> getGirlFriend() {
        return girlFriend;
    }
    // them 1 ban gai vao danh sach
    public boolean addGirlFriend(GirlFriend friend) {
        return girlFriend.add(friend);
    }
    // xoa 1 ban gai khoi danh sach
    public boolean removeGirlFriend(GirlFriend friend){
        return girlFriend.remove(friend);
    }
}
