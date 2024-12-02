import java.util.Stack;

public class TaskManager {
    public static void main(String[] args) {
        // Create a stack and push elements
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop the top element from the stack
        int poppedValue = stack.pop();
        System.out.println("Popped value: " + poppedValue);

        // Display the stack after popping
        System.out.println("Stack after pop: " + stack);
    }
}
