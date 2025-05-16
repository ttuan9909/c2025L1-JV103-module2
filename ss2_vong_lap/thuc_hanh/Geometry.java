package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu\n"
                    + "1. Draw the triangle\n"
                    + "2. Draw the square\n"
                    + "3. Draw the rectangle\n"
                    + "0. Exit\n"
                    + "Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle\n"
                            + "******\n"
                            + "*****\n"
                            + "****\n"
                            + "***\n"
                            + "**\n"
                            + "*\n");
                    break;
                case 2:
                    System.out.println("Draw the square\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n");
                    break;
                case 3:
                    System.out.println("Draw the rectangle\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n"
                            + "* * * * * *\n");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");

            }
        }
    }

}
