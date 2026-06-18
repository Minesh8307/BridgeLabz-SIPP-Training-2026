import java.util.Scanner;

public class FactorsArray {

    public static int[] getFactors(int n) {

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

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2];
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;

        for (int f : factors)
            sum += f;

        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;

        for (int f : factors)
            product *= f;

        return product;
    }

    public static double cubeProduct(int[] factors) {

        double product = 1;

        for (int f : factors)
            product *= Math.pow(f, 3);

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println("Greatest Factor = " +
                greatestFactor(factors));

        System.out.println("Sum = " +
                sumFactors(factors));

        System.out.println("Product = " +
                productFactors(factors));

        System.out.println("Cube Product = " +
                cubeProduct(factors));
    }
}
