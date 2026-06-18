import java.util.Scanner;

public class FactorsProgram {

    public static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int num : factors)
            sum += num;
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int num : factors)
            product *= num;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int num : factors)
            sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int factor : factors)
            System.out.print(factor + " ");

        System.out.println("\nSum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
    }
}
