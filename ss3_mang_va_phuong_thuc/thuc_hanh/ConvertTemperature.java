package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double farenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu\n"
            + "1. Fahrenheit to Celsius\n"
            + "2. Celsius to Fahrenheit\n"
            + "0. Exit\n"
            + "Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit: ");
                    farenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(farenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
