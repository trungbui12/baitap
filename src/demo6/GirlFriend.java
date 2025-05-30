package demo6;

public class GirlFriend {
    private String name;
    private String telephone;
    private int age;
    public GirlFriend(String name, String telephone, int age) {
        this.name = name;
        this.telephone = telephone;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
