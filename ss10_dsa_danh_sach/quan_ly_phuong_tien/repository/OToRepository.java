package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OToRepository implements IOToRepository {
    private static List<OTo> otoList = new ArrayList<>();

    @Override
    public void add(OTo oto) {
        otoList.add(oto);
    }

    @Override
    public List<OTo> showCars() { return otoList; }

    @Override
    public void delete(String bienKiemSoat) {
        boolean found = false;
        Iterator<OTo> iterator = otoList.iterator();
        while (iterator.hasNext()) {
            OTo oTo = iterator.next();
            if (oTo.getBienKiemSoat().equals(bienKiemSoat)) {
                iterator.remove();
                found = true;
                System.out.println("Đã xóa ô tô có biển kiểm soát: " + bienKiemSoat);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy ô tô với biển kiểm soát: " + bienKiemSoat);
        }
    }

    public OTo findById(String bienKiemSoat){
        for (OTo oto : otoList) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                return oto;
            }
        }
        return null;
    }
}
