package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b ) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
