/**
 * Generic Stack implementation using an array as storage.
 * Follows the LIFO principle (Last In, First Out).
 *
 * @param <T> the type of elements stored in the stack
 * @author jakob Dotti
 * @version 23.02.2026
 */
public class Stack<T> {

    private T[] elements;
    private int full;
    private int size;

    /**
     * Default constructor.
     * Creates a stack with default capacity of 10 elements.
     */
    public Stack() {
        size = 10;
        elements = (T[]) new Object[size];
        full = -1;
    }

    /**
     * Constructor with custom stack capacity.
     *
     * @param size maximum number of elements the stack can hold
     */
    public Stack(int size) {
        this.size = size;
        elements = (T[]) new Object[size];
        full = -1;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param object element to be added
     * @throws StackFullException if the stack is already full
     */
    public void push(T object) throws StackFullException {
        if (full == size-1) {
            throw new StackFullException("Kein platz im Stack");
        }
        elements[++full] = object;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the removed element
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException{
        if (full == -1) {
            throw new StackEmptyException("Das Stack ist Leer");
        }
        return elements[full--];
    }

    /**
     * Returns the top element without removing it.
     *
     * @return the top element
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException{
        if (full == -1) {
            throw new StackEmptyException("Das Stack ist Leer");
        }
        return elements[full];
    }

    /**
     * Returns all stack elements as a single string separated by semicolons.
     * Elements are listed from bottom to top.
     *
     * @return string containing all elements separated by ";"
     */
    public String list() {
        String list = "";
        for (int i = 0; i <= full; i++) {
            list += elements[i] + ";";
        }
        return list;
    }
}