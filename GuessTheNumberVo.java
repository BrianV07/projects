
/**
 * Name: Brian Vo
 * Date: November 18, 2026
 * Description: A program that generates a number from 1-100, counting the user's attempts of inputing what number they guess it is. Once they win, they have the option to play again or not.
 * Self-Grade: A-
 */

import java.util.Scanner;

public class GuessTheNumberVo {
    public static void playGame() {
        // Set the minimum and maximum numbers that the guessing game would pretty much allow...
        // Also don't forget how many tries they need, and every other bit for the game to work like if they CAN PLAY it
        boolean playingGame = true;
        int min = 1;
        int max = 100;
        Scanner scanner = new Scanner(System.in);

        // Sets up our random number using the min and max, inclusive!!!
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        int counter = 0;

        // Game loop
        while (playingGame) {
            // Display Enter Number Prompt
            System.out.print("Hey bro. Guess my number between 1-100, I won't judge you. ");
            // System.out.print("The number is " + randomNum + ". "); -- was for testing
            while (!scanner.hasNextInt()) {
                System.out.print("Yo, your input is NOT an integer. Try entering a number between 1-100. ");
                scanner.next();
            }
            int num = scanner.nextInt();
            counter += 1;
            // Check if users number equals secret number
            // If so, declare victory and game is over
            if (num == randomNum) {
                System.out.println("You got it! The number was " + randomNum + ".");
                // display the number of tries
                System.out.println("Looks like you took " + counter + " tries to beat me.");
                // prompts if they wanna play again
                System.out.print("Wanna challenge me again? Type Y/N for yes or no. ");
                String prompt = scanner.next();
                if (prompt.equalsIgnoreCase("Y")) {
                    counter = 0;
                    randomNum = (int)(Math.random() * (max - min + 1)) + min;
                } else {
                    System.out.println("GGs. You take this win.");
                    scanner.close();
                    break;
                }
            // Literally checks if the value they enter is in the boundaries of 1-100
            } else if (num > 100 || num < 1) {
                System.out.println("The number you entered isn't a valid input.");
            // If number greater than secret number then display “too high” message
            } else if (num > randomNum) {
                System.out.println("Nope. Too high.");
            // If number less than secret number then display “too low” message
            } else if (num < randomNum) {
                System.out.println("Nope. Too low.");
            }
        }

    }

}