package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.repository.IXeMayRepository;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.repository.XeMayRepository;

import java.util.List;

public class XemayService implements IXemayService {
    private IXeMayRepository xeMayRepository = new XeMayRepository();

    @Override
    public List<XeMay> showXeMay() {
        List<XeMay> xeMays = xeMayRepository.showXeMay();
        if(xeMays.isEmpty()) {
            System.out.println("Danh sách xe máy trống.");
        }
        for (XeMay xeMay : xeMays) {
            System.out.println(xeMay);
        }
        return xeMays;
    }

    public void add(XeMay xeMay) {
        xeMayRepository.add(xeMay);
        System.out.println("Thêm xe máy thành công.");
    }

    @Override
    public void delete(String bienKiemSoat) {
        xeMayRepository.delete(bienKiemSoat);
    }

    public XeMay findById(String bienKiemSoat) {
        return xeMayRepository.findById(bienKiemSoat);
    }
}
