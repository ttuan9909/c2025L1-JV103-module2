package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository {
    private static List<XeMay> xemayList = new ArrayList<>();

    @Override
    public void add(XeMay xemay){
        xemayList.add(xemay);
    }

    @Override
    public List<XeMay> findAll() {
        return xemayList;
    }

    @Override
    public void delete(XeMay xemay) {
        xemayList.remove(xemay);
    }
}
