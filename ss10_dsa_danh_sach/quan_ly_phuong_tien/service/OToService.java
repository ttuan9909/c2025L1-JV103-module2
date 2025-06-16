package ss10_dsa_danh_sach.quan_ly_phuong_tien.service;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.repository.IOToRepository;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.repository.OToRepository;

import java.util.List;

public class OToService implements IOToService {
    private IOToRepository oToRepository = new OToRepository();

    @Override
    public List<OTo> showCars() {
        List<OTo> cars = oToRepository.showCars();
        if (cars.isEmpty()) {
            System.out.println("Danh sách ô tô trống.");
        } else {
            System.out.println("Danh sách ô tô:");
            for (OTo c : cars) {
                System.out.println(c);
            }
        }
        return cars;
    }

    @Override
    public void add(OTo oTo) {
        oToRepository.add(oTo);
        System.out.println("Thêm ô tô thành công.");
    }

    public void delete(String bienKiemSoat) {
        oToRepository.delete(bienKiemSoat);
    }

    @Override
    public OTo findById(String bienKiemSoat) {
        return oToRepository.findById(bienKiemSoat);
    }
}
