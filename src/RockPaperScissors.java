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
	// Your code here 
        // --------------------------------------------------------------------

            // Computer makes a choice
            int choiceNumber = (int) (Math.random() * 3);  // Randomly picks a number between 0-2 (inclusive)

            // Human makes a choice
            System.out.println("Enter your choice: Rock, Paper, Scissors, or Exit");
            humanChoice = scanner.next();

        //---------------------------------------------------------------------
        } while(!humanChoice.toLowerCase().equals("exit"));

        System.out.println("Good bye!");
    }
}
