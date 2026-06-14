import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Physics: ");
            int phy = sc.nextInt();

            System.out.print("Chemistry: ");
            int chem = sc.nextInt();

            System.out.print("Maths: ");
            int math = sc.nextInt();

            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("Invalid Marks");
                i--;
                continue;
            }

            percentage[i] = (phy + chem + math) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Percentage = " +
                    percentage[i] +
                    " Grade = " + grade[i]);
        }
    }
}