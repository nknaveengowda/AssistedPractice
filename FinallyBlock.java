import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Attempt to divide by zero
            int result = 10 / number;

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            // This block will be executed whether an exception occurs or not
            System.out.println("Finally block is executed.");
            scanner.close();
        }
    }
}