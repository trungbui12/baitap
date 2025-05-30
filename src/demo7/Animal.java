package demo7;

public abstract class Animal { // đây là 1 lớp trừu tượng
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public abstract void eat(); // Hàm trừu tượng không có nội dung hàm
    public abstract void dead();
}