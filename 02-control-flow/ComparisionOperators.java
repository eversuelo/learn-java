import java.lang.System;

/**
 * Examples of Comparison Operators in Java.
 * 
 * Performance:
 * | OPERATOR | NAME | EXAMPLE | DESCRIPTION |
 * |----------|--------------------------|---------|-----------------------------------|
 * | == | Equal to | a == b | True if a is equal to b |
 * | != | Not equal to | a != b | True if a is not equal to b |
 * | < | Less than | a < b | True if a is less than b |
 * | > | Greater than | a > b | True if a is greater than b |
 * | <= | Less than or equal to | a <= b | True if a is less than or equal to b|
 * | >= | Greater than or equal to | a >= b | True if a is greater than or equal
 * to b|
 */
public class ComparisionOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // == Equal to
        System.out.println("Is " + a + " equal to " + b + "? " + (a == b)); // false

        // != Not equal to
        System.out.println("Is " + a + " NOT equal to " + b + "? " + (a != b)); // true

        // < Less than
        System.out.println("Is " + a + " less than " + b + "? " + (a < b)); // true

        // > Greater than
        System.out.println("Is " + a + " greater than " + b + "? " + (a > b)); // false

        // <= Less than or equal to
        System.out.println("Is " + a + " less than or equal to " + b + "? " + (a <= b)); // true

        // >= Greater than or equal to
        System.out.println("Is " + a + " greater than or equal to " + b + "? " + (a >= b)); // false

        // Example with same values
        int c = 10;
        System.out.println("\nWith same values (a = 10, c = 10):");
        System.out.println("a <= c is: " + (a <= c)); // true
        System.out.println("a >= c is: " + (a >= c)); // true
        System.out.println("a == c is: " + (a == c)); // true
    }
}
