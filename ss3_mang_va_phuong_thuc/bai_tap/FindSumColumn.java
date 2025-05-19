package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class FindSumColumn {
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
        System.out.println("Nhập cột cần tính: ");
        int cot = input.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][cot-1];
        }
        System.out.println("Tổng của cột " + (cot) + " là: " + sum);
    }
}
