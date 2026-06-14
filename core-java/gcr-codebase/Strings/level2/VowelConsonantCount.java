import java.util.Scanner;

public class VowelConsonantCount {

    static String check(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u')
                return "Vowel";

            return "Consonant";
        }

        return "Not Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        int vowel = 0, consonant = 0;

        for (int i = 0; i < text.length(); i++) {

            String result = check(text.charAt(i));

            if (result.equals("Vowel"))
                vowel++;

            else if (result.equals("Consonant"))
                consonant++;
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);
    }
}
