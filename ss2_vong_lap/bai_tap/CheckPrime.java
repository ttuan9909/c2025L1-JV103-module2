package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
