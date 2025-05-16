package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String name = input.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of student in the list " + (i+1) + " is " + students[i]);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + name + " in the list");
        }
    }
}
