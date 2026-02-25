/**
 * Exception thrown when an operation is performed on an empty stack.
 * This is typically triggered when calling pop() or peek()
 * while no elements are stored.
 * @author Jakob Dotti
 * @version 23.02.2026
 */
public class StackEmptyException extends Exception {

    /**
     * Constructs a new StackEmptyException with a specific error message.
     *
     * @param message description of the error
     */
    public StackEmptyException(String message) {
        super(message);
    }
}