import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks user to enter first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Asks user to enter second number
        System.out.print("Enter Second number: ");
        double num2 = scanner.nextDouble();

        // Perform math operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        // Print out the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        scanner.close();
    }
}