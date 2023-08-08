package DATABASE;

import java.util.List;

import DOMAIN.model.HotelModel;

public interface HotelGateway {

    void addBill(HotelModel HotelModel);

    void removeBill(int HotelId);

    void editBill(HotelModel HotelModel);

    HotelModel findBill(int HotelId);

    List<HotelModel> getAllBill();

}
