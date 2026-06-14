import java.util.Scanner;

public class TrimString {

    static String trimText(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String user = trimText(text);
        String builtIn = text.trim();

        System.out.println("User Trim : " + user);
        System.out.println("Built-in  : " + builtIn);
        System.out.println(user.equals(builtIn));
    }
}