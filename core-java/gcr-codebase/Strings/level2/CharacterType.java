import java.util.Scanner;

public class CharacterType {

    static String check(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {

            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";

            return "Consonant";
        }

        return "Not Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        System.out.println("Character\tType");

        for (int i = 0; i < text.length(); i++) {

            System.out.println(
                    text.charAt(i) + "\t\t" +
                            check(text.charAt(i)));
        }
    }
}