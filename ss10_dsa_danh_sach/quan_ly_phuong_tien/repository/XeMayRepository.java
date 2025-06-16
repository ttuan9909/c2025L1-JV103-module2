package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XeMayRepository implements IXeMayRepository {
    private static List<XeMay> xemayList = new ArrayList<>();

    @Override
    public void add(XeMay xemay){
        xemayList.add(xemay);
    }

    @Override
    public List<XeMay> showXeMay() {
        return xemayList;
    }

    @Override
    public void delete(String bienKiemSoat) {
        boolean found = false;
        Iterator<XeMay> iterator = xemayList.iterator();
        while (iterator.hasNext()) {
            XeMay xeMay = iterator.next();
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                iterator.remove();
                found = true;
                System.out.println("Đã xóa xe máy có biển kiểm soát: " + bienKiemSoat);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe máy với biển kiểm soát: " + bienKiemSoat);
        }
    }

    @Override
    public XeMay findById(String bienKiemSoat) {
        for (XeMay xeMay : xemayList) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeMay;
            }
        }
        return null;
    }
}
