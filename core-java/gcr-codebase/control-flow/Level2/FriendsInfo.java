import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar Age: ");
        int aAge = sc.nextInt();

        System.out.print("Enter Akbar Age: ");
        int bAge = sc.nextInt();

        System.out.print("Enter Anthony Age: ");
        int cAge = sc.nextInt();

        System.out.print("Enter Amar Height: ");
        int aH = sc.nextInt();

        System.out.print("Enter Akbar Height: ");
        int bH = sc.nextInt();

        System.out.print("Enter Anthony Height: ");
        int cH = sc.nextInt();

        if (aAge < bAge && aAge < cAge)
            System.out.println("Youngest Friend: Amar");
        else if (bAge < aAge && bAge < cAge)
            System.out.println("Youngest Friend: Akbar");
        else
            System.out.println("Youngest Friend: Anthony");

        if (aH > bH && aH > cH)
            System.out.println("Tallest Friend: Amar");
        else if (bH > aH && bH > cH)
            System.out.println("Tallest Friend: Akbar");
        else
            System.out.println("Tallest Friend: Anthony");

        sc.close();
    }
}
