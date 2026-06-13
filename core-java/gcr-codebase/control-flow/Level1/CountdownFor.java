import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int count = sc.nextInt();

        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launch!");

        sc.close();
    }
}
