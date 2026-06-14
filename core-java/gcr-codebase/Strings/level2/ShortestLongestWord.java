import java.util.Scanner;

public class ShortestLongestWord {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static int[] shortestLongest(String[] words) {

        int min = 0;
        int max = 0;

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() <
                    words[min].length())
                min = i;

            if (words[i].length() >
                    words[max].length())
                max = i;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        int[] result = shortestLongest(words);

        System.out.println("Shortest Word: "
                + words[result[0]]);

        System.out.println("Longest Word: "
                + words[result[1]]);
    }
}
