import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        // Typed variables with primitive types
        int number = 10;
        char character = 'A';
        float decimalNumber = 10.66F;
        boolean isTrue = false;

        // We have single and double precision
        double v = 101252.022252E-10;
        System.out.println("v = " + v);

        byte byteNumber = 127;
        System.out.println("number2 = " + byteNumber);

        // String is an object
        String greeting = "Hello String";
        System.out.println(character);
        System.out.println(number);
        System.out.println("decimal number " + decimalNumber + "\n");
        System.out.println("concatenated " + greeting);

        System.out.println("isTrue = " + isTrue);
    }
}
