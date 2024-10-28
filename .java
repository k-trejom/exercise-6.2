public class SumOfDigits {
    public static int sumDigits(long n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        long number1 = 234;
        long number2 = -987;
        long number3 = 1001;
        long number4 = 0;

        System.out.println("Sum of digits in " + number1 + "=" + sumDigits(number1));
        System.out.println("Sum of digits in " + number2 + "=" + sumDigits(number2));
        System.out.println("Sum of digits in " + number3 + "=" + sumDigits(number3));
        System.out.println("Sum of digits in " + number4 + "=" + sumDigits(number4));
    }
}
//10252024_TrejoKevin_exercise6.2
