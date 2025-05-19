package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println(" Size should not exceed 30");
            }
        } while (size > 30);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a mark for student " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("List of marks: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+ "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
