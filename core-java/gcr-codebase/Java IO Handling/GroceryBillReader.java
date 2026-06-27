import java.io.*;

public class GroceryBillReader {

    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("bill.txt"));

            String line;
            int lineCount = 0;

            System.out.println("Contents of bill.txt:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            reader.close();

            System.out.println("\nTotal Number of Lines = " + lineCount);

        } catch (FileNotFoundException e) {

            System.out.println("bill.txt file not found.");

        } catch (IOException e) {

            System.out.println("Error while reading the file.");
        }
    }
}