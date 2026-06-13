import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("Is the first number the largest? true");
        else
            System.out.println("Is the first number the largest? false");

        if (b > a && b > c)
            System.out.println("Is the second number the largest? true");
        else
            System.out.println("Is the second number the largest? false");

        if (c > a && c > b)
            System.out.println("Is the third number the largest? true");
        else
            System.out.println("Is the third number the largest? false");

        
    }
}
