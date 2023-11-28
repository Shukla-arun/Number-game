import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + minRange + " and " + maxRange);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts");
                    break;
                    
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");

                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            totalAttempts += attempts;
            rounds++;

            System.out.println("The correct number was: " + targetNumber);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        System.out.println("Game Over! You played " + rounds + " round(s) with a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
}