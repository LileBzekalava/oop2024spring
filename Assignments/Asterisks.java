import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter the number of levels for the triangle
        System.out.print("Enter the number of levels for the triangle: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}