package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] arr = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " :");
            arr[i] = input.nextInt();
        }
        System.out.println("Nhập phần tử cần thêm: ");
        int x = input.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int index = input.nextInt();

        if (index < 0 || index > n) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            for (int i = n; i > index-1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index-1] = x; // Chèn phần tử X vào vị trí

            n++; // Tăng kích thước thực tế của mảng

            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn phần tử:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
