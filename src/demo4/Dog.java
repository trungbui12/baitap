package demo4;

public class Dog {
    // ham khoi tao ko tham so
    private String kind;
    private String color;
    private int price;
// khoa du lieu o tren va public o duoi de mo khoa du lieu
// lam nhu nay de tranh mat du lieu goc
// cac hang get de lay du lieu

    public String getKind(){
        return this.kind;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        if(this.price >= 0)
            return this.price;
        else
            return 0;
    }

// nap du lieu vao bang ham set
    public void setKind(String kind){
        this.kind = kind;
    }
    public void setPrice(int price){
        if(price > 0)
            this.price = price;
        else
            this.price = 0;
    }
// de phong nhap du lieu sai
}
