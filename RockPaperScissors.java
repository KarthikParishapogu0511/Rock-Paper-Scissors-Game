import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playAgain;
        do {
            System.out.println("\nEnter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors:");
                userChoice = scanner.nextLine().toLowerCase();
            }
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("Computer chose: " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
} 