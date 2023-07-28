package PERSISTENCE_LAYER;

import java.util.List;
import DOMAIN_LAYER.model.BillHotel;

public interface HotelManageDAO {

    void addHoaDon(BillHotel HoaDon);

    void updateHoaDon(BillHotel HoaDon);

    void deleteHoaDon(int maHoaDon);

    BillHotel getHoaDonById(int maHoaDon);

    List<BillHotel> getAllHoaDon();
}
