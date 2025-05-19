package bai;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    public NhanVienSanXuat(String hoTen, String ngaySinh, double luongCoBan, int soSanPham) {
        super(hoTen, ngaySinh, luongCoBan);
        this.soSanPham = soSanPham;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soSanPham * 50000;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số sản phẩm: " + soSanPham);
        System.out.println("Tổng lương: " + tinhLuong());
    }
}
