import java.io.*;

public class SchoolResult {

    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("reportcard.txt", true));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int marks1 = Integer.parseInt(data[1]);
                int marks2 = Integer.parseInt(data[2]);
                int marks3 = Integer.parseInt(data[3]);

                double average = (marks1 + marks2 + marks3) / 3.0;

                writer.write("Student Name : " + name);
                writer.newLine();
                writer.write("Average Marks : " + average);
                writer.newLine();
                writer.write("----------------------------");
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Report Card Generated Successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("students.txt file not found.");

        } catch (IOException e) {

            System.out.println("Error while reading or writing file.");
        }
    }
}