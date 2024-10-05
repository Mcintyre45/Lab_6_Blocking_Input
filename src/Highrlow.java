import java.util.Random;
import java.util.Scanner;

public class Highrlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1; // Generate a random number between 1 and 10
        int guess = 0; // User's guess
        boolean doneGuessing = false; // Game status

        System.out.println("Welcome to the High or Low game!");

        do {
            System.out.print("Guess a number between 1 and 10: ");

            // Check if the next input is an integer
            if (in.hasNextInt()) {
                guess = in.nextInt(); // Read the user's guess

                if (guess < 1 || guess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                } else if (guess < val) {
                    System.out.println("Your guess was too low!");
                } else if (guess > val) {
                    System.out.println("Your guess was too high!");
                } else {
                    System.out.println("Congratulations! Your guess was correct! The number was " + val);
                    doneGuessing = true; // End the game
                }
            } else {
                // Consume the invalid input
                String trash = in.nextLine();
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (!doneGuessing);

        in.close(); // Close the scanner
    }
}