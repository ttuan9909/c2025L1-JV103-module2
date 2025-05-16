package ss2_vong_lap.bai_tap;

public class CheckPrime2 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
