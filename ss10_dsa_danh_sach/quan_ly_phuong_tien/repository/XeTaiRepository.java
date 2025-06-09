package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository {
    private static List<XeTai> xetaiList = new ArrayList<>();
    @Override
    public List<XeTai> findAll() {
        return xetaiList;
    }

    @Override
    public void add(XeTai xeTai) {
        xetaiList.add(xeTai);
    }

    @Override
    public void delete(XeTai xeTai) {
        xetaiList.remove(xeTai);
    }

}
