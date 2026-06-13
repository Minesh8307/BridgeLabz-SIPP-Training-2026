import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int greatestFactor = 1;
        int i = n - 1;

        while (i >= 1) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest Factor = " + greatestFactor);

        sc.close();
    }
}
