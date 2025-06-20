package ss15_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập cạnh a: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.println("Nhập cạnh b: ");
            double b = Double.parseDouble(sc.nextLine());

            System.out.println("Nhập cạnh c: ");
            double c = Double.parseDouble(sc.nextLine());

            Triangle triangle = new Triangle(a,b,c);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập sô hợp lệ.");
        }
    }
}
