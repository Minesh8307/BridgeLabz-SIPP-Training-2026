import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

            BufferedWriter writer = new BufferedWriter(new FileWriter("reportcard.txt", true));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                writer.write("Name : " + name);
                writer.newLine();
                writer.write("Average Marks : " + average);
                writer.newLine();
                writer.write("-------------------------");
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Report Card Created Successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("Student file not found.");

        } catch (IOException e) {

            System.out.println("Error while reading/writing file.");
        }
    }
}