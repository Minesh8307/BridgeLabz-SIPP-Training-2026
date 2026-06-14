import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {

        int n = (int) (Math.random() * 3);

        if (n == 0) return "rock";
        if (n == 1) return "paper";

        return "scissors";
    }

    static int winner(String user, String comp) {

        if (user.equals(comp))
            return 0;

        if ((user.equals("rock") &&
                comp.equals("scissors")) ||

            (user.equals("paper") &&
                comp.equals("rock")) ||

            (user.equals("scissors") &&
                comp.equals("paper")))
            return 1;

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userWin = 0, compWin = 0;

        System.out.print("Games: ");
        int games = sc.nextInt();

        for (int i = 1; i <= games; i++) {

            System.out.print("rock/paper/scissors: ");
            String user = sc.next();

            String comp = computerChoice();

            int result = winner(user, comp);

            if (result == 1)
                userWin++;
            else if (result == -1)
                compWin++;

            System.out.println("Computer = " + comp);
        }

        System.out.println("User Wins = " + userWin);
        System.out.println("Computer Wins = " + compWin);
    }
}
