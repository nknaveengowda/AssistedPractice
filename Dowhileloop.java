import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 10
        int secretNumber = (int) (Math.random() * 10) + 1;

        int guess;
        boolean correctGuess = false;

        System.out.println("Guess the secret number between 1 and 10!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                correctGuess = true;
            } else {
                System.out.println("Try again. Incorrect guess!");
            }
        } while (!correctGuess);

        scanner.close();
    }
}