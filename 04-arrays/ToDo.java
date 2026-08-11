/**
 * Make a To Do List with 10 top tasks. The user should be able to add a task to the list and see the task they added.
 */
import java.util.Scanner;

public class ToDo {
    static String[] topTasks = new String[10];

    public static void main(){
        System.out.println("Welcome to your To Do List!\nYou can add up to 10 tasks to your list." );
        
        boolean running = true;
        do { 
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Please choose an option:\n1. Add a task\n2. Remove a task\n3. View tasks\n4. Exit");
                int choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter the task you want to add:");
                        String taskToAdd = input.next();
                        topTasks = addTask(taskToAdd, topTasks);
                    }
                    case 2 -> {
                        System.out.println("Enter the index of the task you want to remove (0-9):");
                        int indexToRemove = input.nextInt();
                        topTasks = removeTask(indexToRemove, topTasks);
                    }
                    case 3 -> {
                        printTasks(topTasks);
                    }
                    case 4 -> {
                        running = false;
                        System.out.println("Exiting the To Do List. Goodbye!");
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (running);

    }
    static String[] addTask(String task, String[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                System.out.println("Task added: " + task);
                return tasks;
            }
        }
        System.out.println("Your To Do List is full. Please complete or remove a task before adding a new one.");
        return tasks;
    }
    static String[] removeTask(int index, String[] tasks) {
        if (index < 0 || index >= tasks.length || tasks[index] == null) {
            System.out.println("Invalid task index. Please provide a valid index.");
            return tasks;
        }
        System.out.println("Task removed: " + tasks[index]);
        tasks[index] = null;
        return tasks;
    }
    static void printTasks(String[] tasks) {
        System.out.println("Your To Do List:");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }
}
