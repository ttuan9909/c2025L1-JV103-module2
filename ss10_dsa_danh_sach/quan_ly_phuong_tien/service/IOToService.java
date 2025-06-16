package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;

import javax.swing.*;
import java.util.List;

public interface IOToService {
    List<OTo> showCars();

    void add(OTo oTo);

    void delete(String bienKiemSoat);

    OTo findById(String bienKiemSoat);
}
