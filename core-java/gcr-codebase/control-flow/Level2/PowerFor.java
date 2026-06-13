import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.print("Enter Power: ");
        int p = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= p; i++) {
            result *= n;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
