package ss17_binary_file_serialization.bai_tap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourcePath = "D:\\CODEGYM\\module2\\module2\\src\\ss17_binary_file_serialization\\bai_tap\\source.dat";
        String targetPath = "D:\\CODEGYM\\module2\\module2\\src\\ss17_binary_file_serialization\\bai_tap\\target.dat";

        CreateSample(sourcePath);

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Cảnh báo: File đích đã tồn tại.");
            System.out.print("Bạn có muốn ghi đè file đích không? (y/n): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Hủy sao chép.");
                return;
            }
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile);
        ) {
            byte[] buffer = new byte[4096]; // buffer 4KB
            int bytesRead;
            long totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép hoàn tất. Tổng số byte: " + totalBytes);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép: " + e.getMessage());
        }
    }

    public static void CreateSample(String sourcePath){

        try (FileOutputStream fos = new FileOutputStream(sourcePath)) {

        byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        fos.write(data);

        System.out.println("Đã tạo file nguồn với dữ liệu mẫu tại: " + sourcePath);
    } catch (IOException e) {
        System.out.println("Lỗi khi tạo file nguồn: " + e.getMessage());
    }
}

}
