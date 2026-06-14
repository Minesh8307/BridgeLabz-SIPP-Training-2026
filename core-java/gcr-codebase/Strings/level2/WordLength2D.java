import java.util.Scanner;

public class WordLength2D {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static String[][] getWordLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLength(words);

        System.out.println("Word\tLength");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}