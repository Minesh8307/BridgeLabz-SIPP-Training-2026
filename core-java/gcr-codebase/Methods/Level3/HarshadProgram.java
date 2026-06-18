import java.util.Scanner;

public class HarshadProgram {

    public static int[] getDigits(int n) {

        int temp = n;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    public static double sumSquareDigits(int[] digits) {
        double sum = 0;

        for (int d : digits)
            sum += Math.pow(d, 2);

        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumDigits(getDigits(n)) == 0;
    }

    public static void frequency(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits)
            freq[d]++;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Sum = " + sumDigits(digits));
        System.out.println("Sum of Squares = " + sumSquareDigits(digits));
        System.out.println("Harshad = " + isHarshad(num));

        frequency(digits);
    }
}