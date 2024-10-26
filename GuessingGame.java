package Project2;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;


        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;


        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");


        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number.");
        System.out.println("It took you " + attempts + " attempts to guess the number.");

        scanner.close();
    }
}
