public class Primitives {
    public static void main(String[] args) {
        byte b = 127;
        short numberShort = 32767;
        int numberInt = 2147483647;
        long numberLong = 9223372036854775807L;
        float numberFloat = 3.4028235E38F;
        double numberDouble = 1.7976931348623157E308;
        char character = 'A';// Unicode 16 bits
        boolean flag = true;

        // Arithmetic Operators
        int a = 10;
        int c = 5;

        int sum = a + c;           // Addition
        int subtraction = a - c;    // Subtraction
        int multiplication = a * c; // Multiplication
        int division = a / c;       // Division
        int remainder = a % c;      // Modulo (Remainder)

        System.out.println("a = " + a + ", c = " + c);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder (Modulo): " + remainder);

        // Increment and Decrement
        int increment = a;
        increment++;
        int decrement = c;
        decrement--;

        System.out.println("Increment a: " + increment);
        System.out.println("Decrement c: " + decrement);
    }
}
