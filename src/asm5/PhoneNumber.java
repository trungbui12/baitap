package asm5;

import java.util.ArrayList;

public class PhoneNumber{
    private String name;
    private ArrayList<String> phone = new ArrayList<>();

    public PhoneNumber(String name, String phone){
        this.name = name;
        this.phone.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
    
}
