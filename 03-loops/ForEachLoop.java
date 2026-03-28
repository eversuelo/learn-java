public class ForEachLoop {

    public static void main(String[] args) {
        /*
         * The for-each loop:
         * It is used to iterate through all elements of an array or collection.
         * It is simpler when you only need the values and not the index.
         */

        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
