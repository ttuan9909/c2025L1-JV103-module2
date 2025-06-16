package ss13_search.bai_tap;

import java.util.Scanner;

public class findSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi: ");
        String input = sc.nextLine();

        String subString = findLongestIncreasingSubstring(input);

        System.out.println("Chuỗi con tăng dần lớn nhất: " + subString);
    }

    public static String findLongestIncreasingSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String maxSub = "";
        String currentSub = "";

        currentSub += s.charAt(0); // bắt đầu với ký tự đầu tiên

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char prevChar = s.charAt(i - 1);

            if (currentChar > prevChar) {
                currentSub += currentChar;
            } else {
                if (currentSub.length() > maxSub.length()) {
                    maxSub = currentSub;
                }
                currentSub = "" + currentChar;
            }
        }
        return maxSub;
    }
}
