import java.util.Scanner;

public class ReverseStringRecursion {

    static void reverse(String str, int index) {
        if (index < 0)
            return;

        System.out.print(str.charAt(index));
        reverse(str, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str, str.length() - 1);
    }
}