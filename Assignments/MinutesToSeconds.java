import java.util.Scanner;

public class MinutesToSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int minute = scanner.nextInt();

        // Converts minutes to seconds
        int result = minute * 60;

        //prints out the result
        System.out.println("The number of seconds is: " + result);

        scanner.close();
    }
}