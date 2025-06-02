package asm5;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: phoneList){
            if(p.getName() == name){ // neu da co ten trong danh ba
                p.getPhone().add(phone);
                return;
            }
        }
        // khi ra day duoc ma ko bi return thi tuc la chua co ten trong danh ba
        PhoneNumber pn = new PhoneNumber(name, phone);
        phoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p: phoneList){
            if(p.getName() == name){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p: phoneList){
            if (p.getName() == name) {
                System.out.println(p.getName());
                for(String s: p.getPhone()){
                    System.out.println(s);
                }
                return;
            }
        }
    }

    @Override
    public void sort() {
        phoneList.sort((c1,c2)-> c1.getName().compareTo(c2.getName()));
        // giai thich
        // Comparator<PhoneNumber> cmp = new Comparator<PhoneNumber>(){
        //  @Override
        //  public int compare(PhoneNumber o1, PhoneNumber o2){
        //      return o1.getName().compareTo(o2.getName());
        //  }
        // };
        // phoneList.sort(cmp);
    }

    @Override
    public void updatePhone(String name, String newphone) {
        removePhone(name);
        insertPhone(name, newphone);
    }
    
}
