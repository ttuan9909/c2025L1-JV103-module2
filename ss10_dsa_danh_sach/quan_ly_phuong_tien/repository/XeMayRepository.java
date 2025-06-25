package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XeMayRepository implements IXeMayRepository {
    private static final String FILE_PATH = "D:\\CODEGYM\\module2\\module2\\src\\ss10_dsa_danh_sach\\quan_ly_phuong_tien\\data\\xemay.csv";
    private List<XeMay> xemayList = loadFromFile();

    @Override
    public void add(XeMay xeMay) {
        xemayList.add(xeMay);
        saveToFile();
    }

    @Override
    public List<XeMay> showXeMay() {
        return new ArrayList<>(xemayList);
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
                saveToFile();
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

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (XeMay xeMay : xemayList) {
                bw.write(toCsvLine(xeMay));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file CSV: " + e.getMessage());
        }
    }

    private List<XeMay> loadFromFile() {
        List<XeMay> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                XeMay xeMay = fromCsvLine(line);
                if (xeMay != null) {
                    list.add(xeMay);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }

        return list;
    }

    private String toCsvLine(XeMay xeMay) {
        return String.join(",",
                xeMay.getBienKiemSoat(),
                xeMay.getTenHangSanXuat(),
                String.valueOf(xeMay.getNamSanXuat()),
                xeMay.getChuSoHuu(),
                String.valueOf(xeMay.getTrongTai())
        );
    }

    private XeMay fromCsvLine(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) return null;
        return new XeMay(
                parts[0],
                parts[1],
                Integer.parseInt(parts[2]),
                parts[3],
                Integer.parseInt(parts[4])
        );
    }
}
