package PERSISTENCE_LAYER;

import DOMAIN_LAYER.model.BillHotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelManageJDBC implements HotelManageGateway {
    private Connection connection;

    public HotelManageJDBC() {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/hotelmanage";
        String username = "root";
        String password = "Calangthang@ak1406";

        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addHoaDon(BillHotel HoaDon) {
        String sql = "INSERT INTO hotelmanage (maHD, maPhong, tenKH, ngayHD, donGia, tongTien) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, HoaDon.getMaHoaDon());
            statement.setInt(2, HoaDon.getMaPhong());
            statement.setString(3, HoaDon.getTenKhachHang());
            statement.setDate(4, HoaDon.getNgayHoaDon());
            statement.setDouble(5, HoaDon.getDonGia());
            statement.setDouble(6, HoaDon.getThanhTien());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateHoaDon(BillHotel HoaDon) {
        String sql = "UPDATE hotelmanage SET maHD = ?, maPhong = ?, tenKH = ?, ngayHD = ?, donGia = ?. tongTien = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, HoaDon.getMaHoaDon());
            statement.setInt(2, HoaDon.getMaPhong());
            statement.setString(3, HoaDon.getTenKhachHang());
            statement.setDate(4, HoaDon.getNgayHoaDon());
            statement.setDouble(5, HoaDon.getDonGia());
            statement.setDouble(6, HoaDon.getThanhTien());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
