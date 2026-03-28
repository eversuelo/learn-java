import java.util.Scanner;

public class ControlFlowIf {

    public static void main(String[] args) {
        /*
         * The Scanner object:
         * The Scanner class is used to read data from the keyboard.
         * The nextInt() method is used to read an integer.
         * In this example, an 'int' variable named 'number' is created.
         * The nextInt() method reads a number from the keyboard and stores it in
         * the 'number' variable.
         * Finally, the value of the 'number' variable is displayed on the screen.
         */
        
        // Read from console using try-with-resources to ensure the scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number == 8) {
                System.out.println("The number is equal to 8");
            } else if (number < 8) {
                System.out.println("The number " + number + " is less than 8");
            } else {
                System.out.println("The number " + number + " is greater than 8");
            }
        } catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
