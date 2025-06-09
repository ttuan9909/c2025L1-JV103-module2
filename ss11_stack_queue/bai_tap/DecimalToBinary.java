package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hệ thập phân: ");
        int n = input.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        if(n == 0){
            System.out.println("Số nhị phân: 0");
            return;
        }

        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }

        System.out.println("Số nhị phân là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
