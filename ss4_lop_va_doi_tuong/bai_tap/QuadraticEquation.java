package ss4_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b*b) - (4*a*c);
    }

    public double getRoot1() {
        return (-b + getDiscriminant())/(2*a);
    }

    public double getRoot2() {
        return (-b - getDiscriminant())/(2*a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        // Xử lý theo giá trị của delta
        if (delta > 0) {
            System.out.println("The equation has two roots:");
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root:");
            System.out.println("Root: " + equation.getRoot1()); // Root1 == Root2
        } else {
            System.out.println("The equation has no roots.");
        }
    }

}
