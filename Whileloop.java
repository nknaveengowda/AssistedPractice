import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // While loop to calculate the sum of numbers from 1 to the given limit
        while (i <= limit) {
            sum += i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to " + limit + ": " + sum);

        scanner.close();
    }
}