import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block will be executed whether an exception occurs or not
            System.out.println("Finally block is executed.");
            scanner.close();
        }
    }

    // Method to perform division
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException if the denominator is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
