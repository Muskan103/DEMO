public class PrimeNumberSeries {

    public static void main(String[] args) {
        int n = 10; // Number of prime numbers to generate
        System.out.println("First " + n + " prime numbers:");
        generatePrimeSeries(n, 2);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);
    }

    // Function to generate prime series
    public static void generatePrimeSeries(int n, int currentNumber) {
        if (n == 0) {
            return;
        }
        if (isPrime(currentNumber, 2)) {
            System.out.print(currentNumber + " ");
            generatePrimeSeries(n - 1, currentNumber + 1);
        } else {
            generatePrimeSeries(n, currentNumber + 1);
        }
    }
}
