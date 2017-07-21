import java.util.Scanner;

/**
 * Created by James Haller
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String humanChoice;
        String computerChoice;

        do {
            // Computer makes a choice
            //---------------------------------------------------------------------
            int choiceNumber = (int) (Math.random() * 3);  // Randomly picks a number between 0-2 (inclusive)
            if (choiceNumber == 0) {
                computerChoice = "Rock";
            } else if (choiceNumber == 1) {
                computerChoice = "Paper";
            } else if (choiceNumber == 2) {
                computerChoice = "Scissors";
            } else {
                computerChoice = "WAT";
            }

            // Human makes a choice
            //---------------------------------------------------------------------
            // Print menu
            System.out.println("Enter your choice: Rock, Paper, Scissors, or Exit");
            humanChoice = scanner.next();

            // Print results
            //---------------------------------------------------------------------
            System.out.println("Human:     " + humanChoice);
            System.out.println("Computer:  " + computerChoice);
            System.out.println();

        } while(!humanChoice.toLowerCase().equals("exit"));

        System.out.println("Good bye!");
    }
}
