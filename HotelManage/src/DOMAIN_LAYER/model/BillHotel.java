package DOMAIN_LAYER.model;

import java.sql.Date;

public class BillHotel {
    private int maHoaDon;
    private int maPhong;
    private String tenKhachHang;
    private Date ngayHoaDon;
    private Double donGia;
    private Double thanhTien;

    public BillHotel(int maHoaDon, int maPhong, String tenKhachHang, Date ngayHoaDon, Double donGia, Double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maPhong = maPhong;
        this.tenKhachHang = tenKhachHang;
        this.ngayHoaDon = ngayHoaDon;
        this.donGia = donGia;

    }

    // Getters and setters for the fields
    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
