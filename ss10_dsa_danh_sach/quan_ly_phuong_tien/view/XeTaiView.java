package ss10_dsa_danh_sach.quan_ly_phuong_tien.view;

import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeMay;
import ss10_dsa_danh_sach.quan_ly_phuong_tien.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class XeTaiView {



    public static XeTai inputXeTai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Chủ sỡ hữu: ");
        String chuSoHuu = scanner.nextLine();

        System.out.print("Nhập tải trọng: ");
        int trongTai = Integer.parseInt(scanner.nextLine());
        return new XeTai(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,trongTai);
    }
}
