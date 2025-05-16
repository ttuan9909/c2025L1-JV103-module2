package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu\n"
                    + "1. Draw the rectangle\n"
                    + "2. Draw the square triangle\n"
                    + "3. Draw the isosceles triangle \n"
                    + "0. Exit\n"
                    + "Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a length of the rectangle: ");
                    int length = input.nextInt();
                    System.out.println("Enter a width of the rectangle: ");
                    int width = input.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int chon = -1;
                    while (chon != 0) {
                        System.out.println("Menu\n"
                                + "1. Draw the square triangle top-left\n"
                                + "2. Draw the square triangle top-right\n"
                                + "3. Draw the square triangle bottom-left\n"
                                + "4. Draw the square triangle bottom-right\n"
                                + "0. Exit\n"
                                + "Enter your choice");
                        chon = input.nextInt();
                        switch (chon) {
                            case 1:
                                System.out.println("Draw the square triangle top-left ");
                                for (int i = 5; i > 0; i--) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("Draw the square triangle top-right:");
                                for (int i = 5; i > 0; i--) {
                                    for (int j = 0; j < 5 - i; j++) {
                                        System.out.print("  ");
                                    }
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.out.println("Draw the square triangle bottom-left:");
                                for (int i = 1; i <= 5; i++) {
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                System.out.println("Draw the square triangle bottom-right:");
                                for (int i = 1; i <= 5; i++) {
                                    for (int j = 0; j < 5 - i; j++) {
                                        System.out.print("  ");
                                    }
                                    for (int j = 0; j < i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 0:
                                System.out.println("Exit triangle menu.");
                                break;
                            default:
                                System.out.println("No choice");
                                break;
                        }
                    }
                    break; // <--- CẦN THÊM break ở đây để không chạy tiếp case 3

                case 3:
                    System.out.println("Draw the isosceles triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice");
            }
        }
    }
}
