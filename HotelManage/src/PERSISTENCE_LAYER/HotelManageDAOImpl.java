package PERSISTENCE_LAYER;

import java.util.List;
import DOMAIN_LAYER.model.BillHotel;

public class HotelManageDAOImpl implements HotelManageDAO {

    private HotelManageGateway HotelManageGateway;

    public HotelManageDAOImpl(HotelManageGateway HotelManageGateway) {
        this.HotelManageGateway = HotelManageGateway;
    }

    @Override
    public void addHoaDon(BillHotel HoaDon) {
        HotelManageGateway.addHoaDon(HoaDon);
    }

    @Override
    public void updateHoaDon(BillHotel HoaDon) {
        HotelManageGateway.updateHoaDon(HoaDon);
    }

    @Override
    public void deleteHoaDon(int maHD) {
        HotelManageGateway.deleteHoaDon(maHD);
    }

    @Override
    public BillHotel getHoaDonById(int maHoaDon) {
        return HotelManageGateway.getHoaDonById(maHoaDon);
    }

    @Override
    public List<BillHotel> getAllHoaDon() {
        return HotelManageGateway.getAllHoaDon();
    }

}
