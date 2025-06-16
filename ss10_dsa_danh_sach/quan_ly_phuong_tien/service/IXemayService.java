package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.util.List;

public interface IXemayService {
    List<XeMay> showXeMay();
    void add(XeMay xeMay);
    void delete(String bienKiemSoat);

    XeMay findById(String bienKiemSoat);
}
