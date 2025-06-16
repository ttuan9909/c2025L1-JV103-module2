package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.List;

public interface IXeTaiService {
    List<XeTai> showXeTai();
    void add(XeTai xeTai);
    void delete(String bienKiemSoat);

    XeTai findById(String bienKiemSoat);
}
