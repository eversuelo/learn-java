public class DoWhileLoop {

    public static void main(String[] args) {
        /*
         * The do-while loop:
         * It executes the block first and checks the condition afterward.
         * This guarantees that the code runs at least one time.
         */

        int counter = 1;

        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter <= 5);
    }
}
