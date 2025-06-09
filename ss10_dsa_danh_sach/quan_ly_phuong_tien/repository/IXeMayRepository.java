package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.util.List;

public interface IXeMayRepository {
    void add(XeMay xemay);

    List<XeMay> findAll();

    void delete(XeMay xemay);
}
