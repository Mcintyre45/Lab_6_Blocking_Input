import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess = 0;
        boolean doneGuess = false;
        String trash = "";

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();

                if (guess < 1 || guess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                } else if (guess < val) {
                    System.out.println("The random number was " + val);
                    System.out.println("Your guess was too low!");
                    doneGuess = true;
                } else if (guess > val) {
                    System.out.println("The random number was " + val);
                    System.out.println("Your guess was too high!");
                    doneGuess = true;
                } else {
                    System.out.println("The random number was " + val);
                    System.out.println("Your guess was correct!");
                    doneGuess = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (!doneGuess);
    }
}