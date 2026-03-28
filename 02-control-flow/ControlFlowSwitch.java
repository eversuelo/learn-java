import java.util.Scanner;

public class ControlFlowSwitch {

    public static void main(String[] args) {
        /*
         * The switch statement:
         * A switch is used when a variable can match one of several known values.
         * It is often clearer than writing many if-else conditions for exact matches.
         *
         * How it works:
         * 1. Java evaluates the expression inside switch(...).
         * 2. It compares that value with each case.
         * 3. When a match is found, the corresponding block is executed.
         * 4. The break statement stops execution and exits the switch.
         * 5. The default block runs when no case matches.
         *
         * In this example, the user enters a number from 1 to 7
         * and the program prints the corresponding day of the week.
         */

        // Read from console using try-with-resources to ensure the scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number from 1 to 7: ");
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day. Please enter a number between 1 and 7.");
            }
        } catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
