package bai;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienVanPhong("Nguyễn Văn A", "01/01/1990", 3_000_000, 20, 1.5);
        NhanVien nv2 = new NhanVienSanXuat("Trần Thị B", "02/02/1992", 3_000_000, 100);

        System.out.println("=== Thông tin Nhân viên Văn phòng ===");
        nv1.hienThiThongTin();

        System.out.println("\n=== Thông tin Nhân viên Sản xuất ===");
        nv2.hienThiThongTin();
    }
}
