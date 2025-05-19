package bai;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;
    private double heSoPhuCap;

    public NhanVienVanPhong(String hoTen, String ngaySinh, double luongCoBan,
                            int soNgayLamViec, double heSoPhuCap) {
        super(hoTen, ngaySinh, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
        this.heSoPhuCap = heSoPhuCap;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soNgayLamViec * 100000 + heSoPhuCap * 500000;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
        System.out.println("Hệ số phụ cấp: " + heSoPhuCap);
        System.out.println("Tổng lương: " + tinhLuong());
    }
}
