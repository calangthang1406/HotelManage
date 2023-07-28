package PERSISTENCE_LAYER;

import DOMAIN_LAYER.model.BillHotel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void deleteHoaDon(int maHD) {
        String sql = "DELETE FROM hotelmanage WHERE maHD = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, maHD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BillHotel getHoaDonById(int maHoaDon) {
        String sql = "SELECT * FROM hotelmanage WHERE maHD = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, maHoaDon);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int maHD = resultSet.getInt("maHD");
                int maPhong = resultSet.getInt("maPhong");
                String tenKhachHang = resultSet.getString("tenKH");
                Date ngayHoaDon = resultSet.getDate("ngayHD");
                double donGia = resultSet.getDouble("donGia");
                double thanhTien = resultSet.getDouble("thanhTien");

                return new BillHotel(maHD, maPhong, tenKhachHang, ngayHoaDon, donGia, thanhTien);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<BillHotel> getAllHoaDon() {
        List<BillHotel> HoaDon = new ArrayList<>();
        String sql = "SELECT * FROM hotelmanage";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int maHD = resultSet.getInt("maHD");
                int maPhong = resultSet.getInt("maPhong");
                String tenKhachHang = resultSet.getString("tenKH");
                Date ngayHoaDon = resultSet.getDate("ngayHD");
                double donGia = resultSet.getDouble("donGia");
                double thanhTien = resultSet.getDouble("donGia");

                HoaDon.add(new BillHotel(maHD, maPhong, tenKhachHang, ngayHoaDon, donGia, thanhTien));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return HoaDon;
    }
}
