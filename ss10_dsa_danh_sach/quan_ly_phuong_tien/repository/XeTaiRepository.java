package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository {
    private static List<XeTai> xetaiList = new ArrayList<>();
    @Override
    public List<XeTai> showXeTai() {
        return xetaiList;
    }

    @Override
    public void add(XeTai xeTai) {
        xetaiList.add(xeTai);
    }

    @Override
    public void delete(String bienKiemSoat) {
        boolean found = false;
        Iterator<XeTai> iterator = xetaiList.iterator();
        while (iterator.hasNext()) {
            XeTai xeTai = iterator.next();
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                iterator.remove();
                found = true;
                System.out.println("Đã xóa xe tải có biển kiểm soát: " + bienKiemSoat);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe tải với biển kiểm soát: " + bienKiemSoat);
        }
    }


    @Override
    public XeTai findById(String bienKiemSoat) {
        for (XeTai xeTai : xetaiList) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeTai;
            }
        }
        return null;
    }
}
