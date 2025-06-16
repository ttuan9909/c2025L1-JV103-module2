package ss14_sort.bai_tap;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        insertionSort ob = new insertionSort();

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ob.insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && currentElement < list[k]; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }


}
