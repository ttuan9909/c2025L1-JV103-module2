package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.repository.XeTaiRepository;

import java.util.Iterator;
import java.util.List;

public class XeTaiService implements IXeTaiService{
    private XeTaiRepository xeTaiRepository = new XeTaiRepository();

    @Override
    public List<XeTai> showXeTai() {
        List<XeTai> xeTai = xeTaiRepository.showXeTai();
        if (xeTai.isEmpty()) {
            System.out.println("Danh sách xe tải trống.");
        }
        for (XeTai xeTai1 : xeTai) {
            System.out.println(xeTai1);
        }
        return xeTai;
    }

    @Override
    public void add(XeTai xeTai) {
        xeTaiRepository.add(xeTai);
        System.out.println("Thêm xe tải thành công.");
    }

    public void delete(String bienKiemSoat) {
        xeTaiRepository.delete(bienKiemSoat);
    }


    public XeTai findById(String id) {
        return xeTaiRepository.findById(id);
    }
}
