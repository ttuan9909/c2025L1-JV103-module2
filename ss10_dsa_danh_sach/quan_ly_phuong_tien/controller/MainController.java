package ss10_dsa_danh_sach.quan_ly_phuong_tien.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THONG"
                            + "Chọn chức năng: \n"
                            + "Thêm mới phương tiện \n"
                            + "Hiển thị phương tiện \n"
                            + "Xóa phương tiện\n"
                            + "Thoát");

        int choice1 = Integer.parseInt(sc.nextLine());

        switch (choice1) {
            case 1:
                System.out.println("Thêm mới phương tiện: \n"
                                    + "1. Thêm xe tải\n"
                                    + "2.  Thêm ô tô\n"
                                    + "3. Thêm xe máy");
                int choice2 = Integer.parseInt(sc.nextLine());
                switch (choice2) {
                    case 1:

                }
            case 2:
            case 3:
        }
    }

    public static void displayAddMenu(){
        Scanner sc = new Scanner(System.in);
    }
}
