import java.util.ArrayList;
/**
 * 
 * ArrayListExample
 * Aplications of ArrayList in Java
 * 1. Storing data in tabular format
 * 2. Used in the creation of Matrices
 * 3. Usen in the creation of various higher level data structures like Stacks, Queues, Heaps, Hash Tables, etc.
 */


// ArrayList Implementatation in Java

public class ArrayListExample{
    public static void main(String[] args) {
        /**
         * ArrayList<E> in Java Collections is a data structure that implements the List<E> interface,
         * which means that it can have duplicate elements in it. ArrayList is an implementation of a
         * dynamic array that can grow or shrink as needed. (Internally the array is used when it is full,
         * a bigger array is allocated and the old array values are copied to it.
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers); 
        System.out.println("Size: " + numbers.size()); // Getting the size of the ArrayList
        System.out.println("Element at index 1: " + numbers.get(1)); // Getting the element at index 1
        System.out.println("Array is Empty: " + numbers.isEmpty()); // Checking if the ArrayList is empty

        numbers.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + numbers);
        System.out.println("Size after removal: " + numbers.size());

        
        
    }
}