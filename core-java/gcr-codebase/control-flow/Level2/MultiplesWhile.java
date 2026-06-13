import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int i = n;

        while (i < 100) {
            System.out.println(i);
            i += n;
        }

        sc.close();
    }
}