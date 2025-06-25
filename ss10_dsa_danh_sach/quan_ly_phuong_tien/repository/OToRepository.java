package ss10_dsa_danh_sach.quan_ly_phuong_tien.repository;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OToRepository implements IOToRepository {
    private static final String FILE_PATH = "D:\\CODEGYM\\module2\\module2\\src\\ss10_dsa_danh_sach\\quan_ly_phuong_tien\\data\\oto.csv";
    private List<OTo> otoList = loadFromFile();

    @Override
    public void add(OTo oto) {
        otoList.add(oto);
        saveToFile();
    }

    @Override
    public List<OTo> showCars() {
        return new ArrayList<>(otoList);
    }

    @Override
    public void delete(String bienKiemSoat) {
        boolean found = false;
        Iterator<OTo> iterator = otoList.iterator();
        while (iterator.hasNext()) {
            OTo oto = iterator.next();
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                iterator.remove();
                found = true;
                saveToFile();
                System.out.println("Đã xóa ô tô có biển kiểm soát: " + bienKiemSoat);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy ô tô với biển kiểm soát: " + bienKiemSoat);
        }
    }

    @Override
    public OTo findById(String bienKiemSoat) {
        for (OTo oto : otoList) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                return oto;
            }
        }
        return null;
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (OTo oto : otoList) {
                bw.write(toCsvLine(oto));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file CSV: " + e.getMessage());
        }
    }

    private List<OTo> loadFromFile() {
        List<OTo> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                OTo oto = fromCsvLine(line);
                if (oto != null) {
                    list.add(oto);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }

        return list;
    }

    private String toCsvLine(OTo oto) {
        return String.join(",",
                oto.getBienKiemSoat(),
                oto.getTenHangSanXuat(),
                String.valueOf(oto.getNamSanXuat()),
                oto.getChuSoHuu(),
                String.valueOf(oto.getSoChoNgoi()),
                oto.getKieuXe()
        );
    }

    private OTo fromCsvLine(String line) {
        String[] parts = line.split(",");
        if (parts.length != 6) return null;
        return new OTo(
                parts[0],
                parts[1],
                Integer.parseInt(parts[2]),
                parts[3],
                Integer.parseInt(parts[4]),
                parts[5]
        );
    }
}
