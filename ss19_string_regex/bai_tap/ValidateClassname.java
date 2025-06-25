package ss19_string_regex.bai_tap;

import java.util.regex.Pattern;

public class ValidateClassname {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public static boolean isValidClassName(String className) {
        return Pattern.matches(CLASS_NAME_REGEX, className);
    }

    public static void main(String[] args) {
        System.out.println("C0223G: " + isValidClassName("C0223G")); // true
        System.out.println("A0323K: " + isValidClassName("A0323K")); // true

        System.out.println("M0318G: " + isValidClassName("M0318G")); // false
        System.out.println("P0323A: " + isValidClassName("P0323A")); // false
        System.out.println("C0223G#: " + isValidClassName("C0223G#")); // false
        System.out.println("A032GH: " + isValidClassName("A032GH")); // false
    }
}
