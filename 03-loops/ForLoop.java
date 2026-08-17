public class ForLoop {

    public static void main(String[] args) {
        /*
         * The for loop:
         * It is commonly used when the number of repetitions is known in advance.
         *
         * Structure:
         * for (initialization; condition; update) {
         *     // code to repeat
         * }
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration number: " + i);
        }
        for(float i2 = 1.0f; i2 <= 5.0f; i2 += 0.5f) {
            System.out.println("Iteration number: " + i2);
        }
    }
}
