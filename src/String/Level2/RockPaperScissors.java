package String.Level2;
import java.util.*;

public class RockPaperScissors {

    static String computerChoice() {

        int n = (int)(Math.random() * 3);

        if (n == 0)
            return "Rock";
        else if (n == 1)
            return "Paper";
        else
            return "Scissors";
    }

    static String winner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("\nEnter Rock/Paper/Scissors: ");
            String user = sc.next();

            String computer = computerChoice();

            String result = winner(user, computer);

            if (result.equals("User"))
                userWins++;

            else if (result.equals("Computer"))
                computerWins++;

            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + result);
        }

        double userPercentage =
                (userWins * 100.0) / games;

        double computerPercentage =
                (computerWins * 100.0) / games;

        System.out.println("\nPlayer Wins\tComputer Wins");
        System.out.println(userWins + "\t\t" + computerWins);

        System.out.println("Player Winning %: " +
                userPercentage);

        System.out.println("Computer Winning %: " +
                computerPercentage);
    }
}