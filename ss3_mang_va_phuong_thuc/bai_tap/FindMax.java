package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số hàng: ");
        int row = input.nextInt();
        System.out.println("Nhập số cột: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               System.out.println("Nhập phần tử[" + i + "][" + j + "]: "  );
               arr[i][j] = input.nextInt();
           }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phàn tử lớn nhất là: " + max);
    }
}
