iimport java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("The number " + n + " is divisible by 5.");
        } else {
            System.out.println("The number " + n + " is not divisible by 5.");
        }

        sc.close();
    }
}
