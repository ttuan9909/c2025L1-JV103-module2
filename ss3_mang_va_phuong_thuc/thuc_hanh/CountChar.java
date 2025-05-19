package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String ch = sc.nextLine().toLowerCase();
        System.out.println("Nhập kí tự bạn muốn đếm: ");
        char ch2 = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == ch2) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + ch2 + ": " + count);
    }
}
