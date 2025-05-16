package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Property list is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("The max value is " + max + ", at position " + index);

    }
}
