package ss10_dsa_danh_sach.quan_ly_phuong_tien.view;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;

import java.util.List;
import java.util.Scanner;

public class XeMayView {

    public static XeMay inputXeMay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Chủ sỡ hữu: ");
        String chuSoHuu = scanner.nextLine();

        System.out.print("Nhập công suất: ");
        int congSuat = Integer.parseInt(scanner.nextLine());

        return  new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuat);
    }
}
