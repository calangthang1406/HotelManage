package DATABASE;

import java.util.List;

import DOMAIN.model.HotelModel;

public interface HotelDAO {
    void addBill(HotelModel HotelModel);

    void removeBill(int id);

    void editBill(HotelModel HotelModel);

    List<HotelModel> getAllBill();
    //THONG BAO DEN THANH VIEN DA DANG KY
    void notifySubscribers();
}
