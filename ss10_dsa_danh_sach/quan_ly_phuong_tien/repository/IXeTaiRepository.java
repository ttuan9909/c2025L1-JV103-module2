package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    void add(XeTai xetai);

    List<XeTai> showXeTai();

    void delete(String bienKiemSoat);

    XeTai findById(String bienKiemSoat);
}
