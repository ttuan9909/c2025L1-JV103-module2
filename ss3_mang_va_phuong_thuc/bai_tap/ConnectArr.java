package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ConnectArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập mảng thứ 1 \n"
                + "Nhập số phần tử: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];

        for (int j = 0; j < n1; j++) {
            System.out.println("Nhập phần tử thứ " + (j + 1) + " :");
            arr1[j] = input.nextInt();
        }

        System.out.println("Nhập mảng thứ 2 \n"
                + "Nhập số phần tử: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];

        for (int j = 0; j < n2; j++) {
            System.out.println("Nhập phần tử thứ " + (j + 1) + " :");
            arr2[j] = input.nextInt();
        }

        int n3 = n1 + n2;
        int[] arr3 = new int[n3];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[n1+i] = arr2[i];
        }

        System.out.println("Mảng sau khi nối phần tử:");
        for (int i = 0; i < n3; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

    }
}
