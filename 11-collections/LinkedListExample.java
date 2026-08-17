import java.util.LinkedList;
/**
 * LinkedListExample
 * LinkedList is a dynamic data structure an memory is allocated at run time. THe concept of linked list is not 
 * to store data contiguosly. Nodes of linked list containt links that point to the next elements in the list.
 * 
 * Performance-wise, linked list are slower than arrays because there is no direct access to linked list elements.
 * A linked list is a useful data structure when we do not know the number of elements to be stored ahead of time.
 * There are many types of linked list: linear, circular, doubly, doubly circular etc.
 * 
 * Bellow is the API of the LinkedList:
 * 1. Insert(k) will insert an element at the start of the list. Just create a new element and move pointers. This take O(1) time.
 * 2. Delete() will delete an element at the start of thelisth. Just move the pointer to the next element. This takes O(1) time.
 * 3. Print() will print all the elements in the list. This takes O(n) time.
 * 4. Search(k) will search for an element in the list. This takes O(n) time.
 * 5. isEmpty() will check if the list is empty. This takes O(1) time.
 */
class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 100; i=i+5) {
            if (i % 2 == 0) {
                numbers.addFirst(i);
            } else {
                numbers.addLast(i); 
            }
        }
        System.out.println("LinkedList: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Element at index 1: " + numbers.get(1));

        Integer removedElement = numbers.remove(10);
        System.out.println("Removed element: " + removedElement);
        Integer firstElement = numbers.removeFirst();
        System.out.println("First element removed: " + firstElement);
        Integer lastElement = numbers.removeLast();
        System.out.println("Last element removed: " + lastElement);
        System.out.println("LinkedList after removing elements: " + numbers);
        System.out.println("Size after removal: " + numbers.size());
    }
}