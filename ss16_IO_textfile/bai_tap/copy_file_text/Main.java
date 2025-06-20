package ss16_IO_textfile.bai_tap.copy_file_text;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Main app = new Main();

        app.loadFromFile();

        app.saveToFile();

        app.copyFileWithChecks(
                "D:\\CODEGYM\\module2\\module2\\src\\ss16_IO_textfile\\bai_tap\\copy_file_text\\text2.csv",
                "D:\\CODEGYM\\module2\\module2\\src\\ss16_IO_textfile\\bai_tap\\copy_file_text\\text1.csv"
        );
    }

    public void saveToFile() {
        File file = new File(
                "D:\\CODEGYM\\module2\\module2\\src\\ss16_IO_textfile\\bai_tap\\copy_file_text\\text1.csv");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Product p : products) {
                writer.printf("%d,%s,%.2f%n", p.getId(), p.getName(), p.getPrice());
            }
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        products.clear();
        File file = new File(
                "D:\\CODEGYM\\module2\\module2\\src\\ss16_IO_textfile\\bai_tap\\copy_file_text\\text2.csv");
        if (!file.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    products.add(new Product(id, name, price));
                }
            }
            System.out.println("Đọc file thành công. Tổng sản phẩm: " + products.size());
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    public void copyFileWithChecks(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại: " + sourcePath);
            return;
        }

        if (targetFile.exists()) {
            System.out.print("Tệp đích đã tồn tại. Bạn có muốn ghi đè không? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                System.out.println("Hủy sao chép.");
                return;
            }
        }

        int charCount = 0;
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(targetFile)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }
            System.out.println("Sao chép thành công. Tổng số ký tự: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi sao chép file: " + e.getMessage());
        }
    }
}
