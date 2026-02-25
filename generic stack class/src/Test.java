public class Test {
    public static void main(String[] args) {
        System.out.println("Testing with a Integer Stack"); // Print title for Integer stack test
        System.out.println("---------------------------------"); // Separator

        Stack<Integer> integerStack = new Stack<>(5); // Create a stack that can hold max. 5 Integer elements

        try {
            // Push three numbers onto the stack
            integerStack.push(10);
            integerStack.push(20);
            integerStack.push(30);
        } catch (StackFullException e) {
            System.err.println("The stack is full"); // This will execute if stack capacity is exceeded
        }

        System.out.println("Viewing of all elements"); // text for printing all elements in stack
        System.out.println(integerStack.list()); // expected: 10;20;30;

        try {
            System.out.println("Viewing without deleting");
            System.out.println(integerStack.peek()); // expected: 30


            System.out.println("Viewing with deleting");
            System.out.println(integerStack.pop());  // expected: 30

            System.out.println("Viewing without deleting");
            System.out.println(integerStack.peek()); // expected: 20

        } catch (StackEmptyException e) {
            System.err.println("The stack is empty");  // This will execute if pop/peek is called on empty stack
        }

        System.out.println("---------------------------------"); // Separator for second test
        System.out.println("Testing with a String Stack"); // Print title for String stack test
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); // Separator

        Stack<String> stringStack = new Stack<>(); // Create a stack with default size (10)

        try {
            // Push several strings onto the stack
            stringStack.push("Hello");
            stringStack.push("how");
            stringStack.push("are");
            stringStack.push("you");;
        } catch (StackFullException e) {
            System.err.println(); // Would only happen if more than capacity is pushed
        }

        System.out.println("Viewing of all elements"); // text for printing all elements in stack
        System.out.println(stringStack.list()); // expected: Hello;how;are;you;

        try {
            System.out.println("Viewing without deleting");
            System.out.println(stringStack.peek()); // expected: you

            System.out.println("Viewing with deleting");
            System.out.println(stringStack.pop());  // expected: you

            System.out.println("Viewing without deleting");
            System.out.println(stringStack.peek()); // expected: are
        } catch (StackEmptyException e) {
            System.err.println("The stack is empty"); // Happens if stack is empty
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); // Final separator
    }
}