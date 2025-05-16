package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " :");
            arr[i] = input.nextInt();
        }
        System.out.println("Nhập phần tử cần xóa: ");
        int x = input.nextInt();
        int index_del = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
            }
        }
        if (index_del == -1) {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
        } else {
            System.out.println("Phần tử " + x + " xuất hiện tại vị trí " + (index_del+1));

            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Mảng sau khi xoá phần tử " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

