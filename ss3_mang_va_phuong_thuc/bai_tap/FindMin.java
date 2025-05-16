package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class FindMin {
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
        int min = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Phàn tử nhỏ nhất là: " + min);
    }
}
