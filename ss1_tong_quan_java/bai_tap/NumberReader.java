package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (tối đa 3 chữ số): ");
        int num = scanner.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("out of ability");
        } else {
            // Đọc và in kết quả
            System.out.println("Kết quả: " + readNumber(num));
        }
    }

    public static String readNumber(int number) {
        if (number < 10) {
            return readOneDigit(number);
        } else if (number < 20) {
            return readTeen(number);
        } else if (number < 100) {
            return readTens(number);
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;

            String result = readOneDigit(hundreds) + " hundred";

            if (remainder != 0) {
                result += " and " + readNumber(remainder);
            }

            return result;
        }
    }

    public static String readOneDigit(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    
    public static String readTeen(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String readTens(int n) {
        int tens = n / 10;
        int ones = n % 10;

        String tensStr = "";
        switch (tens) {
            case 2: tensStr = "twenty"; break;
            case 3: tensStr = "thirty"; break;
            case 4: tensStr = "forty"; break;
            case 5: tensStr = "fifty"; break;
            case 6: tensStr = "sixty"; break;
            case 7: tensStr = "seventy"; break;
            case 8: tensStr = "eighty"; break;
            case 9: tensStr = "ninety"; break;
        }

        if (ones == 0) {
            return tensStr;
        } else {
            return tensStr + " " + readOneDigit(ones);
        }
    }
}
