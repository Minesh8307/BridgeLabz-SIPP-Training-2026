import java.io.*;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) {

        int count = 0;

        try {

            BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.toLowerCase().contains("good")) {
                    count++;
                }
            }

            reader.close();

            System.out.println("Good Feedback Count = " + count);

        } catch (FileNotFoundException e) {

            System.out.println("Feedback file not found.");

        } catch (IOException e) {

            System.out.println("Error reading file.");
        }
    }
}