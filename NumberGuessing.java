
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean hasWon = false;

            System.out.println("I have generated a number between 1 and 100. Can you guess it? You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (hasWon) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was: " + numberToGuess);
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
