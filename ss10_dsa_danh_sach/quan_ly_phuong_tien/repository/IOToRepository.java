package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;

import java.util.List;

public interface IOToRepository {
    void add(OTo oto);

    List<OTo> findAll();

    void delete(OTo oto);
}
