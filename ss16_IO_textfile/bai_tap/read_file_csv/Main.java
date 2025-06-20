package ss16_IO_textfile.bai_tap.read_file_csv;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Country> countrys = new ArrayList<>();

    public static void main(String[] args) {
        Main app = new Main();
        app.loadFromFile();


        for (Country c : app.countrys) {
            System.out.println(c);
        }
    }

    public void loadFromFile() {
        countrys.clear();
        File file = new File("D:\\CODEGYM\\module2\\module2\\src\\ss16_IO_textfile\\bai_tap\\read_file_csv\\country.csv");
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].replace("\"", "").trim();
                    String name = parts[2].replace("\"", "").trim();
                    countrys.add(new Country(id, code, name));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
