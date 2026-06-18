import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {

        if (num1 > num2)
            return 1;
        else if (num1 < num2)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {

            if (isPositive(num)) {

                if (isEven(num))
                    System.out.println(num + " is Positive Even");
                else
                    System.out.println(num + " is Positive Odd");

            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1)
            System.out.println("First element is Greater");
        else if (result == -1)
            System.out.println("First element is Smaller");
        else
            System.out.println("Both are Equal");
    }
}