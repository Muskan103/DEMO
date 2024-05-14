public class DassariumNumber {

    public static void main(String[] args) {
        int number = 89;
        if (isDassarium(number)) {
            System.out.println(number + " is a Dassarium number.");
        } else {
            System.out.println(number + " is not a Dassarium number.");
        }
    }

    // Function to calculate the sum of digits each raised to the power of itself
    public static int sumOfDigitPowers(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (int) (Math.pow(digit, digit) + sumOfDigitPowers(num / 10));
    }

    // Function to check if a number is a Dassarium number
    public static boolean isDassarium(int num) {
        return num == sumOfDigitPowers(num);
    }
}
