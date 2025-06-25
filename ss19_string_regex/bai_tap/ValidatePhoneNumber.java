package ss19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches(PHONE_REGEX, phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println("(84)-(0978489648): " + isValidPhoneNumber("(84)-(0978489648)"));

        System.out.println("(a8)-(22222222): " + isValidPhoneNumber("(a8)-(22222222)"));
        System.out.println("(84)-(02222222): " + isValidPhoneNumber("(84)-(0222222222)"));
        System.out.println("(84)-(9978489648): " + isValidPhoneNumber("(84)-(9978489648)"));
        System.out.println("(84)-(097848964):" + isValidPhoneNumber("(84)-(097848964)")); 
    }
}
