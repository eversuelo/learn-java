import java.util.Stack;
/**
 * Stack is a data structure that follows the Last-In, First-Out (LIFO) principle.
 * This means that the element that is added last will be removed first.
 */
class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping: " + stack);
    }
}
