package bai;

public class NhanVien {
    protected String hoTen;
    protected String ngaySinh;
    protected double luongCoBan;

    public NhanVien(String hoTen, String ngaySinh, double luongCoBan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luongCoBan = luongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }

    public void hienThiThongTin(boolean showLuong) {
        hienThiThongTin();
        if (showLuong) {
            System.out.println("Tổng lương: " + tinhLuong());
        }
    }
}
