import java.util.Scanner;

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowThrowsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Using throws in a method signature
            validateAge(age);

            // Using throw to manually throw an exception
            if (age < 18) {
                throw new CustomException("You must be at least 18 years old.");
            }

            System.out.println("You are eligible to vote!");
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method using throws in its signature
    private static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative.");
        }
    }
}
