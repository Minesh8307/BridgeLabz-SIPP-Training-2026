import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.print("Enter Power: ");
        int p = sc.nextInt();

        int result = 1;
        int count = 0;

        while (count < p) {
            result *= n;
            count++;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}