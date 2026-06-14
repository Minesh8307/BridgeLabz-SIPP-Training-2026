import java.util.Scanner;

public class StudentGrade {

    static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";

        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        System.out.println("Phy\tChem\tMath\tTotal\t%\tGrade");

        for (int i = 0; i < n; i++) {

            int phy = (int)(Math.random() * 100);
            int chem = (int)(Math.random() * 100);
            int math = (int)(Math.random() * 100);

            int total = phy + chem + math;

            double per = total / 3.0;

            System.out.printf(
                    "%d\t%d\t%d\t%d\t%.2f\t%s\n",
                    phy, chem, math,
                    total, per,
                    grade(per));
        }
    }
}