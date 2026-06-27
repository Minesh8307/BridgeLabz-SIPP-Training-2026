import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.txt", true));

            System.out.print("Enter Expense Category : ");
            String category = sc.nextLine();

            System.out.print("Enter Amount : ");
            int amount = sc.nextInt();

            writer.write(category + " - " + amount);
            writer.newLine();

            writer.close();

            System.out.println("Expense Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }

        sc.close();
    }
}