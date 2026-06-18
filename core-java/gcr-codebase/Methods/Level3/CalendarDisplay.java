import java.util.Scanner;
import java.time.LocalDate;

public class CalendarDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        int days = date.lengthOfMonth();
        int firstDay = date.getDayOfWeek().getValue() % 7;

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        for (int day = 1; day <= days; day++) {

            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}