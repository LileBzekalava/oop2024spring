import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;

        // Enter the radius
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula
        double area = Math.PI * radius * radius;

        // Print out the results
        System.out.println("Area of the circle is: " + area);

        scanner.close();
    }
}