package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository {
    private static final String FILE_PATH = "D:\\CODEGYM\\module2\\module2\\src\\ss10_dsa_danh_sach\\quan_ly_phuong_tien\\data\\xetai.csv";
    private List<XeTai> xeTaiList = loadFromFile();

    @Override
    public void add(XeTai xeTai) {
        xeTaiList.add(xeTai);
        saveToFile();
    }

    @Override
    public List<XeTai> showXeTai() {
        return new ArrayList<>(xeTaiList);
    }

    @Override
    public void delete(String bienKiemSoat) {
        boolean found = false;
        Iterator<XeTai> iterator = xeTaiList.iterator();
        while (iterator.hasNext()) {
            XeTai xeTai = iterator.next();
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                iterator.remove();
                found = true;
                saveToFile();
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
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                return xeTai;
            }
        }
        return null;
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (XeTai xeTai : xeTaiList) {
                bw.write(toCsvLine(xeTai));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file CSV: " + e.getMessage());
        }
    }

    private List<XeTai> loadFromFile() {
        List<XeTai> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                XeTai xeTai = fromCsvLine(line);
                if (xeTai != null) {
                    list.add(xeTai);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }

        return list;
    }

    private String toCsvLine(XeTai xeTai) {
        return String.join(",",
                xeTai.getBienKiemSoat(),
                xeTai.getTenHangSanXuat(),
                String.valueOf(xeTai.getNamSanXuat()),
                xeTai.getChuSoHuu(),
                String.valueOf(xeTai.getTrongTai())
        );
    }

    private XeTai fromCsvLine(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) return null;
        return new XeTai(
                parts[0],
                parts[1],
                Integer.parseInt(parts[2]),
                parts[3],
                Integer.parseInt(parts[4])
        );
    }
}
