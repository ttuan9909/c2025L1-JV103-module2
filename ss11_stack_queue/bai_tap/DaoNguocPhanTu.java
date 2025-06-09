package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int[] array = inputElement();
        Stack<Integer> stack = new Stack<Integer>();
        for (int j : array) {
            stack.push(j);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] inputElement(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " :");
            array[i] = input.nextInt();
        }
        return array;
    }
}
