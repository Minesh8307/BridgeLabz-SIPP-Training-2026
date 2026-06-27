import java.io.*;

public class CustomerFeedback {

    public static void main(String[] args) {

        int goodCount = 0;

        try {

            BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));

            String feedback;

            while ((feedback = reader.readLine()) != null) {

                if (feedback.toLowerCase().contains("good")) {
                    goodCount++;
                }
            }

            reader.close();

            System.out.println("Good Feedback Count = " + goodCount);

        } catch (FileNotFoundException e) {

            System.out.println("feedback.txt file not found.");

        } catch (IOException e) {

            System.out.println("Error reading file.");
        }
    }
}