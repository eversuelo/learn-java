import java.util.Scanner;
public class CompareTwoNumbers {
        public static void main(String[] args) {
        if(args.length < 2) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Please enter two numbers to compare:");
                var firstNumber = input.nextInt();
                System.out.println("Please enter the second number:");
                var secondNumber = input.nextInt();
                printComparison(firstNumber, secondNumber);
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }finally {
                System.out.println("Program finished.");
            }
        }else{
            printComparison(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
    }
    public static boolean isGreaterThan(int a, int b) {
        return a > b;
    }
    public static void printComparison(int a, int b) {
        if (isGreaterThan(a, b)) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
