import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n > 0 && n < 100) {
            for (int i = n; i < 100; i += n) {
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
