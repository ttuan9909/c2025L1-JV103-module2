package ss10_dsa_danh_sach.quan_ly_phuong_tien.controller;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.OTo;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.service.OToService;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.service.XeTaiService;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.service.XemayService;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.view.OToView;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.view.XeMayView;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.view.XeTaiView;

import java.util.Scanner;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
    private static XeTaiService xeTaiService = new XeTaiService();
    private static XemayService xemayService = new XemayService();
    private static OToService oToService = new OToService();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n"
                    + "1. Thêm mới phương tiện\n"
                    + "2. Hiển thị phương tiện\n"
                    + "3. Xóa phương tiện\n"
                    + "4. Thoát\n"
                    + "Chọn chức năng: ");

            int choice1 = Integer.parseInt(sc.nextLine());

            switch (choice1) {
                case 1:
                    addVihicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    deleteVehicle();
                    break;
                case 4:
                    System.out.println("Chương trình đã kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        }
    }


    public static void addVihicle() {
        System.out.println("Thêm mới phương tiện: \n"
                + "1. Thêm xe tải\n"
                + "2.  Thêm ô tô\n"
                + "3. Thêm xe máy");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                XeTai xeTai = XeTaiView.inputXeTai();
                xeTaiService.add(xeTai);
                break;
            case 2:
                OTo oTo = OToView.inputOTo();
                oToService.add(oTo);
                break;
            case 3:
                XeMay xemay = XeMayView.inputXeMay();
                xemayService.add(xemay);
                break;
        }
    }

    public static void displayVehicle() {
        System.out.println("Hiển thị phương tiện: \n"
                + "1. Hiển thị xe tải\n"
                + "2. Hiển thị ô tô\n"
                + "3. Hiển thị xe máy");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                xeTaiService.showXeTai();
                break;
            case 2:
                oToService.showCars();
                break;
            case 3:
                xemayService.showXeMay();
                break;

        }
    }

    public static void deleteVehicle() {
        System.out.println("Xóa phương tiện: \n"
                + "1. Xóa xe tải\n"
                + "2. Xóa ô tô\n"
                + "3. Xóa xe máy");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = sc.nextLine();

        switch (choice) {
            case 1:
                xeTaiService.delete(bienKiemSoat);
                break;
            case 2:
                oToService.delete(bienKiemSoat);
                break;
            case 3:
                xemayService.delete(bienKiemSoat);
                break;
        }
    }
}
