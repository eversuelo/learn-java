public class WhileLoop {

    public static void main(String[] args) {
        /*
         * The while loop:
         * It repeats while a condition remains true.
         * It is useful when the exact number of iterations is not known beforehand.
         */

        int counter = 1;

        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }
    }
}
