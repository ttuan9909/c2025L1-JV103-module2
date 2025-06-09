package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;

import java.util.ArrayList;
import java.util.List;

public class OToRepository implements IOToRepository {
    private static List<OTo> otoList = new ArrayList<>();

    @Override
    public void add(OTo oto) {
        otoList.add(oto);
    }

    @Override
    public List<OTo> findAll() {
        return otoList;
    }

    @Override
    public void delete(OTo oto) {

    }
}
